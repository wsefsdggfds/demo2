package com.example.demo.shopping.specifications.conroller;

import com.example.demo.model.ApiResult;
import com.example.demo.shopping.specifications.entiy.Specifications;
import com.example.demo.shopping.specifications.service.SpecificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/specification")
public class SpecificationsController {
//    @Autowired
//    private SpecificationsService specificationsService;
//    @PostMapping("/insert/specifications")
//    public ApiResult insert(@RequestBody Specifications specifications){
//        return specificationsService.insert(specifications);
//    }
}
