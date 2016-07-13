package tr.edu.yildiz.service;

import tr.edu.yildiz.domain.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getAllCategories();
}
