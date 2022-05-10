package com.qubitfaruk.northwinddemo.api.controller;

import com.qubitfaruk.northwinddemo.business.abstracts.ProductService;
import com.qubitfaruk.northwinddemo.core.utilities.results.DataResult;
import com.qubitfaruk.northwinddemo.core.utilities.results.Result;
import com.qubitfaruk.northwinddemo.core.utilities.results.SuccessDataResult;
import com.qubitfaruk.northwinddemo.core.utilities.results.SuccessResult;
import com.qubitfaruk.northwinddemo.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    public Result addProduct(Product product){
        return this.productService.addToProduct(product);
    }
    public DataResult<List<Product>> getAllByProductName(String productName){
        return this.productService.getAllByProductName(productName);
    }
}
