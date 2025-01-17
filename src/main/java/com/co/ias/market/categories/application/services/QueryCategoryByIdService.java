package com.co.ias.market.categories.application.services;

import com.co.ias.market.categories.application.domain.Category;
import com.co.ias.market.categories.application.domain.valueObjs.CategoryId;
import com.co.ias.market.categories.application.ports.input.QueryCategoryByIdUseCase;
import com.co.ias.market.categories.application.ports.output.CategoryRepository;
import com.co.ias.market.infranstructure.models.CategoryDTO;
import com.co.ias.market.infranstructure.models.ProductDTO;
import com.co.ias.market.products.application.domain.Product;
import com.co.ias.market.products.application.domain.valueObjs.ProductId;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QueryCategoryByIdService implements QueryCategoryByIdUseCase {
    private final CategoryRepository categoryRepository;

    public QueryCategoryByIdService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Optional<CategoryDTO> execute(Long id) {
        CategoryId categoryId = new CategoryId(id);

        Optional<Category> categoryOptional = categoryRepository.get(categoryId);

        return categoryOptional.map(category -> {
            CategoryDTO categoryDTO = CategoryDTO.fromDomain(category);
            return categoryDTO;
        });
    }
}
