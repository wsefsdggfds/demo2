//package com.example.demo.generator.conroller;
//
//import com.example.demo.generator.domain.*;
//import com.example.demo.generator.dto.ProductRequestDTO;
//import com.example.demo.generator.dto.ProductResponseDTO;
//import com.example.demo.generator.service.*;
//import com.example.demo.model.ApiResult;
//import com.github.pagehelper.PageHelper;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.web.bind.annotation.*;
//
//import javax.print.attribute.standard.PageRanges;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/api/services/product")
//public class ProductControllerT {
//    @Autowired
//    private ProductService productService;
//    @Autowired
//    private ProductLabelRelationService productLabelRelationService;
//    @Autowired
//    private LabelService labelService;
//    @Autowired
//    private ProductSpecificationRelationService productSpecificationRelationService;
//    @Autowired
//    private SpecificationService specificationService;
//    @Autowired
//    private ProductDocumentRelationService productDocumentRelationService;
//    @Autowired
//    private DocumentService documentService;
//
//
//    @PostMapping
//    public ApiResult add(@RequestBody ProductRequestDTO product){
//        if (null == product.getLableList() || product.getLableList().size() < 1){
//            return ApiResult.failure("标签为空");
//        }
//        if (null == product.getDocumentList() || product.getDocumentList().size() < 1){
//            return ApiResult.failure("图片为空");
//        }
//        if (null == product.getSpecificationList() || product.getSpecificationList().size() < 1){
//            return ApiResult.failure("属性为空");
//        }
//
//
//        Product product1 = new Product();
//        BeanUtils.copyProperties(product,product1);
//        for (Label lable : product.getLableList()) {
//            ProductLabelRelation relation = new ProductLabelRelation();
//            relation.setProductId(product1.getId());
//            relation.setLabelId(lable.getId());
//            productLabelRelationService.add(relation);
//            // 保存relation
//        }
//         for (Document document : product.getDocumentList()) {
//             ProductDocumentRelation productDocumentRelation=new ProductDocumentRelation();
//             productDocumentRelation.setProductId(product1.getId());
//             productDocumentRelation.setDocumentId(document.getId());
//             productDocumentRelationService.add(productDocumentRelation);
//
//
//            // 保存product document relation
//        }
//
//        for (Specification specification : product.getSpecificationList()) {
//            ProductSpecificationRelation productSpecificationRelation=new ProductSpecificationRelation();
//            productSpecificationRelation.setProductId(product1.getId());
//            productSpecificationRelation.setSpecificationId(specification.getId());
//
//        }
//
//
//        return productService.addProduct(product1);
//    }
//
//
//
//    @GetMapping
//    public ApiResult get(@RequestParam(required = false) Integer id,@RequestParam(required = false) String name,
//                         @RequestParam(defaultValue = "1") int pageNum,
//                         @RequestParam(defaultValue = "10") int pageSize  ){
//
//
//        PageHelper.startPage(pageNum, pageSize);
//        // 查询product list
//        //(已写) select * from product where name like '%sdad%'
//        List<Product> products = productService.getProduct(id,name);
////分页查询加入当前页查询数据的量
//        List<Integer> productId = products.stream().map(Product::getId).collect(Collectors.toList());
//        // 标签
//        // (已写)标签 通过查询到的product_id查询标签id，用foreach（多个）
//        // select * from product_label_relation where product_id in ('productId','')
//        List<ProductLabelRelation> labelRelationList =  productLabelRelationService.get(productId);
//
//        //（已写）根据查询到的标签id查询标签名字
//        //select * from lable where id in ()
//        List<Label> lableList = labelService.get(labelRelationList);
//
//        // 规格
//        //根据商品规格关系表查询规格id
//        // select * from  product_specification_relation  where product_id in ('','')
//        List<ProductSpecificationRelation> specificationRelations = productSpecificationRelationService.select(productId);
//
//
//        List<Specification> specifications = specificationService.select(specificationRelations);
//
//        // 图片
//        // select * from  product_document_relation  where product_id in ('','')
//        List<ProductDocumentRelation> productDocumentRelations=productDocumentRelationService.findDocument(productId);
//        List<Document> documentList = documentService.find(productDocumentRelations);
//
//        List<ProductResponseDTO> dtoList  = new ArrayList<>();
//        for (Product product : products){
////            // 分类
////            ProductClassficationRelation first = new ProductClassficationRelation();
////            ProductClassficationRelation second = new ProductClassficationRelation();
//
//            ProductResponseDTO productResponseDTO = new ProductResponseDTO();
//
//
//
//
//            // 标签
//            BeanUtils.copyProperties(product,productResponseDTO);
//            List<ProductLabelRelation> labelRelations = labelRelationList.stream().filter(a -> a.getProductId().equals(product.getId())).collect(Collectors.toList());
//            List<Integer> labelIds = labelRelations.stream().map(ProductLabelRelation::getLabelId).collect(Collectors.toList());
//            List<Label> lables = lableList.stream().filter(a -> labelIds.contains(a.getId())).collect(Collectors.toList());
//            // 排序
//            productResponseDTO.setLableList(lables);
//
//
//            // 规格
//            BeanUtils.copyProperties(product,productResponseDTO);
//            List<ProductSpecificationRelation> specificationRelations1 = specificationRelations.stream().filter(a -> a.getProductId().equals(product.getId())).collect(Collectors.toList());
//            List<Integer> specificationIds = specificationRelations1.stream().map(ProductSpecificationRelation::getSpecificationId).collect(Collectors.toList());
//            List<Specification> specification = specifications.stream().filter(a -> specificationIds.contains(a.getId())).collect(Collectors.toList());
//            if (specification.size()>1){
//                List<Specification> specificationMaxMin = specificationService.select(specificationRelations);
//                List<Specification> specificationList=specificationMaxMin.stream().filter(a-> specificationIds.contains(a.getId())).collect(Collectors.toList());
//                productResponseDTO.setSpecificationList(specificationList);
//            }
//
//
//
//            productResponseDTO.setSpecificationList(specification);
//
//            // 图片
//            BeanUtils.copyProperties(product,productResponseDTO);
//            List<ProductDocumentRelation> documentRelations = productDocumentRelations.stream().filter(a -> a.getProductId().equals(product.getId())).collect(Collectors.toList());
//            List<Integer>  documentIds= documentRelations.stream().map(ProductDocumentRelation::getDocumentId).collect(Collectors.toList());
//            List<Document> documents = documentList.stream().filter(a -> documentIds.contains(a.getId())).collect(Collectors.toList());
//            // 排序
//            productResponseDTO.setDocumentList(documents);
//
//
//
//            dtoList.add(productResponseDTO);
//        }
//
//        return ApiResult.success(dtoList);
//    }
//}
