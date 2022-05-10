package com.qubitfaruk.northwinddemo.dataAccess.Abstract;

import com.qubitfaruk.northwinddemo.entities.concrete.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDal extends JpaRepository<Category,Integer>{

}
