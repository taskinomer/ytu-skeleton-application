package tr.edu.yildiz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.edu.yildiz.dao.CategoryDao;
import tr.edu.yildiz.domain.Category;
import tr.edu.yildiz.domain.dto.CategoryDto;
import tr.edu.yildiz.mapper.CategoryMapper;
import tr.edu.yildiz.service.CategoryService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    private CategoryMapper mapper = new CategoryMapper();

    @Override
    public List<CategoryDto> getAllCategories() {
        List<CategoryDto> categoryDtos = new ArrayList<>();
        List<Category> categories = categoryDao.findAll();
        for(Category category : categories) {
            categoryDtos.add( mapper. map(category));
        }

        return categoryDtos;
    }
}
