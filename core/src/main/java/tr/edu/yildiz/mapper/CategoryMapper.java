package tr.edu.yildiz.mapper;

import tr.edu.yildiz.domain.Category;
import tr.edu.yildiz.domain.dto.CategoryDto;

public class CategoryMapper {

    public CategoryDto map(Category category) {
        CategoryDto dto = new CategoryDto();
        dto.setCategoryName(category.getCategoryName());

        return dto;
    }
}
