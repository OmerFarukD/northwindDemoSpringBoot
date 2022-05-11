package com.qubitfaruk.northwinddemo.dataAccess.Abstract;

import com.qubitfaruk.northwinddemo.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDal extends JpaRepository<Product,Integer>{
    List<Product> getAllByProductName(String productName);
    Product getByProductId(int id);
    List<Product> getByCategory_CategoryId(int id);

    @Query("FROM Product where productName=:productName and category.categoryId =:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);
}
