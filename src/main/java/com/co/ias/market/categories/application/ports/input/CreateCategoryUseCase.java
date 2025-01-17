package com.co.ias.market.categories.application.ports.input;

import com.co.ias.market.commons.UseCase;
import com.co.ias.market.infranstructure.models.CategoryDTO;
import com.co.ias.market.infranstructure.models.ProductDTO;

public interface CreateCategoryUseCase extends UseCase<CategoryDTO, CategoryDTO> {
}
