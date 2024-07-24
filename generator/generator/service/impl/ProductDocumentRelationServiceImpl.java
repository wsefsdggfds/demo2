package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.ProductDocumentRelation;
import generator.service.ProductDocumentRelationService;
import generator.mapper.ProductDocumentRelationMapper;
import org.springframework.stereotype.Service;

/**
* @author wwx92
* @description 针对表【product_document_relation(商品图片关系表)】的数据库操作Service实现
* @createDate 2024-07-17 20:30:13
*/
@Service
public class ProductDocumentRelationServiceImpl extends ServiceImpl<ProductDocumentRelationMapper, ProductDocumentRelation>
    implements ProductDocumentRelationService{

}




