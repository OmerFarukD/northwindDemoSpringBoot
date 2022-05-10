package com.qubitfaruk.northwinddemo.dataAccess.Abstract;

import com.qubitfaruk.northwinddemo.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDal extends JpaRepository<Product,Integer>{
    List<Product> getAllByProductName(String productName);
    Product getByProductId(int id);
}
