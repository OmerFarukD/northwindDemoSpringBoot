package com.qubitfaruk.northwinddemo.business.abstracts;

import com.qubitfaruk.northwinddemo.core.utilities.results.DataResult;
import com.qubitfaruk.northwinddemo.core.utilities.results.Result;
import com.qubitfaruk.northwinddemo.entities.concrete.Product;

import java.util.List;

public interface ProductService {
    Result addToProduct(Product product);
    DataResult<List<Product>> getAllByProductName(String productName);
    DataResult<Product> getByProductId(int productId);
}
