package com.qubitfaruk.northwinddemo.business.concrete;

import com.qubitfaruk.northwinddemo.business.abstracts.ProductService;
import com.qubitfaruk.northwinddemo.core.utilities.results.DataResult;
import com.qubitfaruk.northwinddemo.core.utilities.results.Result;
import com.qubitfaruk.northwinddemo.core.utilities.results.SuccessDataResult;
import com.qubitfaruk.northwinddemo.core.utilities.results.SuccessResult;
import com.qubitfaruk.northwinddemo.dataAccess.Abstract.ProductDal;
import com.qubitfaruk.northwinddemo.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    @Autowired
    private ProductDal productDal;
    @Override
    public Result addToProduct(Product product) {
        this.productDal.save(product);
        return new SuccessResult("Ürün eklendi");
    }

    @Override
    public DataResult<List<Product>> getAllByProductName(String productName) {
        return new SuccessDataResult<List<Product>>("Ürün listelendi", this.productDal.getAllByProductName(productName));
    }

    @Override
    public DataResult<Product> getByProductId(int productId) {
        return new SuccessDataResult<Product>(this.productDal.getByProductId(productId));
    }
}
