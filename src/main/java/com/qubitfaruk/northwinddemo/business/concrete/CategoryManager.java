package com.qubitfaruk.northwinddemo.business.concrete;

import com.qubitfaruk.northwinddemo.business.abstracts.CategoryService;
import com.qubitfaruk.northwinddemo.core.utilities.results.DataResult;
import com.qubitfaruk.northwinddemo.core.utilities.results.SuccessDataResult;
import com.qubitfaruk.northwinddemo.dataAccess.Abstract.CategoryDal;
import com.qubitfaruk.northwinddemo.entities.concrete.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    @Autowired
    private CategoryDal categoryDal;
    @Override
    public DataResult<List<Category>> getAll() {
        return new SuccessDataResult<List<Category>>(this.categoryDal.findAll());
    }

}
