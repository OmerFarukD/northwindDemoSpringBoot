package com.qubitfaruk.northwinddemo.api.controller;
import com.qubitfaruk.northwinddemo.business.abstracts.ProductService;
import com.qubitfaruk.northwinddemo.core.utilities.results.DataResult;
import com.qubitfaruk.northwinddemo.core.utilities.results.Result;
import com.qubitfaruk.northwinddemo.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addToProduct")
    public Result addProduct(@RequestBody Product product){
        return this.productService.addToProduct(product);
    }
    @GetMapping("/getAllByProductName")
    public DataResult<List<Product>> getAllByProductName(@RequestParam String productName){
        return this.productService.getAllByProductName(productName);
    }
    @GetMapping("/getByProductId")
    public DataResult<Product> getByProductId(@RequestParam int productId){
        return this.productService.getByProductId(productId);
    }
    @GetMapping("/getAllByCategoryId")
    public DataResult<List<Product>> getAllByCategoryId(int categoryId){
        return this.productService.getAllByCategoryId(categoryId);
    }
}
