package tr.edu.yildiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.edu.yildiz.domain.Category;
import tr.edu.yildiz.domain.dto.CategoryDto;
import tr.edu.yildiz.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping()
    @ResponseBody
    public List<CategoryDto> getAll() {
        return categoryService.getAllCategories();
    }
}
