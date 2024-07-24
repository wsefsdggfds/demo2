//package com.example.demo.generator.conroller;
//
//import com.example.demo.generator.domain.Classfication;
//import com.example.demo.generator.domain.ClassficationDocumentRelation;
//import com.example.demo.generator.domain.Document;
//import com.example.demo.generator.mapper.ClassficationDocumentRelationMapper;
//import com.example.demo.generator.mapper.DocumentMapper;
//import com.example.demo.generator.service.ClassficationService;
//import com.example.demo.generator.service.ClassificationDocumentService;
//import com.example.demo.generator.service.DocumentService;
//import com.example.demo.model.ApiResult;
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/api/services/classification")
//public class ClassficationControllerT {
//
//    @Autowired
//    private DocumentMapper documentMapper;
//    @Autowired
//    private ClassficationDocumentRelationMapper classficationDocumentRelationMapper;
//    @Autowired
//    private ClassficationService classficationService;
//    @Autowired
//    private ClassificationDocumentService classificationDocumentService;
//    @Autowired
//    private DocumentService documentService;
////    @Autowired
////    private ClassficationMapper classficationMapper;
//
//
//    /**
//     {
//     "type": "Senond_Level",
//     "parentId": "2323",
//     "topDocument": {
//     图片名称
//     "name": "dsdad.png",
//     云服务器返回id
//     "externalId": "/sdsd/sdad/sdsd.png"
//     },
//     "documentList": [
//     {
//     "name": "dsdad.png",
//     "externalId": "/sdsd/sdad/sdsd.png",
//     "sort": 1
//     },
//     {
//     "name": "dsdad.png",
//     "externalId": "/sdsd/sdad/sdsd.png",
//     "sort": 2
//     },
//     {
//     "name": "dsdad.png",
//     "externalId": "/sdsd/sdad/sdsd.png",
//     "sort": 3
//     }
//     ]
//     }
//     */
////    添加分类
//    @PostMapping
//    public ApiResult add(@RequestBody Classfication classfication){
//
//        // 判断如果是一级分类，跳到二级分类
//        if (Classfication.Type.Second_Level.name().equals(classfication.getType())){
//
//            if (StringUtils.isEmpty(classfication.getParentId())){
//                return ApiResult.failure("一级分类不存在");
//            }
//            // 根据一级分类id 查找，找不到返回失败，一级分类不存在
//
//            // top docuemnt 不为空，就保存document 对象，然后把id放到top document
////            一级分类图片缩略图？？？？？？
//            if (!StringUtils.isEmpty(classfication.getTopDocument())){
//                Document document  = new Document();
//                Document topDocument = classfication.getTopDocument();
//                document.setExternalId(topDocument.getExternalId());
//                document.setName(topDocument.getName());
//                documentMapper.save(document);
//
//               classfication.setTopDocumentId(document.getId());
//
//            }
//            // 保存classfication
//
//            // 图片list不为空，就保存document 对象，然后把id放到top document
//            if (null != classfication.getDocumentList() && classfication.getDocumentList().size() > 0){
//                for (Document document : classfication.getDocumentList()){
//                    Document document1  = new Document();
//                     document1.setExternalId(document.getExternalId());
//                    document1.setName(document.getName());
//
//                    documentMapper.save(document1);
//
//                    ClassficationDocumentRelation relation = new ClassficationDocumentRelation();
//                    relation.setClassficationId(classfication.getId());
//                    relation.setDocumentId(document1.getId());
//                    relation.setSort(document.getSort());
//                    classficationDocumentRelationMapper.save(relation);
//                }
//            }
//
//
//        }else {
//            if (Classfication.Type.First_Level.name().equals(classfication.getType())){
//
////                查找一级分类是否存在
////                if (Classfication.Type.First_Level.name().equals(classfication.getType())&&classficationMapper.select(classfication.getName()).size()>0){
////                    return ApiResult.failure("该分类已经存在");
////                }
////                保存document
//                if (!StringUtils.isEmpty(classfication.getTopDocument())){
//                    Document document=new Document();
//                    Document document1=classfication.getTopDocument();
//                    document.setExternalId(document1.getExternalId());
//                    document.setName(document.getName());
//                    documentMapper.save(document);
//                    classfication.setTopDocumentId(document.getId());
//
//                }
//
//
//            }
////            classficationMapper.insert(classfication);
//        }
//
//        return null;
//    }
//
//
//
//
////    分类查询与商品管理页面的分类查询相同
//    @GetMapping("/selectFirst")
//    public ApiResult getFirst(@RequestParam(required = false) String name,@RequestParam(required = false) String type, @RequestParam(required = false) String state){
////        查询分类
////        查询分类id并保存
//        List<Classfication> classfications=  classficationService.findClassification(name,type,state);
//        List<Integer> classificationId=classfications.stream().map(Classfication::getId).collect(Collectors.toList());
////        查询分类图片
////        查询图片
//        List<ClassficationDocumentRelation> classficationDocumentRelations=classificationDocumentService.findDocumentId(classificationId);
//        List<Document> documentList= documentService.findClassificationDocument(classficationDocumentRelations);
////        图片与分类封装
//        List<Classfication> classficationList=new ArrayList<>();
//        for (Classfication classfication:classfications){
//            Classfication classfication1=new Classfication();
//            BeanUtils.copyProperties(classfication,classfication1);
//            List<ClassficationDocumentRelation> classficationDocumentRelations1=classficationDocumentRelations.stream().filter(a->a.getClassficationId().equals(classfication.getId())).collect(Collectors.toList());
//            List<Integer> documentIds=classficationDocumentRelations1.stream().map(ClassficationDocumentRelation::getDocumentId).collect(Collectors.toList());
//            List<Document> documents=documentList.stream().filter(a->documentIds.contains(a.getId())).collect(Collectors.toList());
//            classfication1.setDocumentList(documents);
//            classficationList.add(classfication1);
//            }
//
//        return ApiResult.success(classficationList);
//    }
//
//
//
//
//    @GetMapping("/selectSecond")
//    public ApiResult getSecond(@RequestParam(required = false) Integer parentId,@RequestParam(required = false) String name,@RequestParam(required = false) String type, @RequestParam(required = false) String state) {
////        查询分类
////        查询分类id并保存
//        List<Classfication> classfications = classficationService.findClassificationSecond(parentId,name, type, state);
//        List<Integer> classificationId = classfications.stream().map(Classfication::getId).collect(Collectors.toList());
////        查询分类图片
////        查询图片
//        List<ClassficationDocumentRelation> classficationDocumentRelations = classificationDocumentService.findDocumentId(classificationId);
//        List<Document> documentList = documentService.findClassificationDocument(classficationDocumentRelations);
//
////        查询topDocument
//        List<Integer> topDocument=classfications.stream().map(Classfication::getTopDocumentId).collect(Collectors.toList());
//        List<Document> documentList1=documentService.findClassificationTopDocument(topDocument);
//
//
//
////        图片与分类封装
//        List<Classfication> classficationList = new ArrayList<>();
//        for (Classfication classfication : classfications) {
//            Classfication classfication1 = new Classfication();
//            BeanUtils.copyProperties(classfication, classfication1);
//            List<ClassficationDocumentRelation> classficationDocumentRelations1 = classficationDocumentRelations.stream().filter(a -> a.getClassficationId().equals(classfication.getId())).collect(Collectors.toList());
//            List<Integer> documentIds = classficationDocumentRelations1.stream().map(ClassficationDocumentRelation::getDocumentId).collect(Collectors.toList());
//            List<Document> documents = documentList.stream().filter(a -> documentIds.contains(a.getId())).collect(Collectors.toList());
//            classfication1.setDocumentList(documents);
//            classficationList.add(classfication1);
//
////            topDocument封装
////            BeanUtils.copyProperties(classfication, classfication1);
////            List<Integer> topDocumentIds = classfications.stream().map(Classfication::getTopDocumentId).collect(Collectors.toList());
////            List<Document> topDocuments = documentList1.stream().filter(a -> topDocumentIds.contains(a.getId())).collect(Collectors.toList());
////            classfication1.setDocumentList(topDocuments);
////            classficationList.add(classfication1);
//
//        }
//
//        return ApiResult.success(classficationList);
//    }
//
//
//}
