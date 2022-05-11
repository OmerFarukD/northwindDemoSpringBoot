package com.qubitfaruk.northwinddemo.business.abstracts;

import com.qubitfaruk.northwinddemo.core.utilities.results.DataResult;
import com.qubitfaruk.northwinddemo.entities.concrete.Category;

import java.util.List;

public interface CategoryService {
    DataResult<List<Category>> getAll();
}
