package com.qubitfaruk.northwinddemo.dataAccess.Abstract;

import com.qubitfaruk.northwinddemo.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDal extends JpaRepository<Product,Integer>{

}
