package com.example.demo.controller;

import com.example.demo.pojo.Product;
import com.example.demo.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jdd on 2019/11/20.
 */
//@Api(description = "产品操作接口")
    @Api(value = "Product接口",tags = "Product的接口 from tags")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @ApiOperation(value = "获取otp", notes="通过手机号获取OTP验证码")
    @ApiImplicitParam(name = "telephone", value = "电话号码", paramType = "query", required = true, dataType = "Integer")
    @RequestMapping("/products")
    public List<Product> products(){
        List<Product> ps = productService.listProducts();
        return ps;
    }

}
