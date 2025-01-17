package com.co.ias.market.products.application.ports.input;

import com.co.ias.market.commons.UseCase;
import com.co.ias.market.infranstructure.models.ProductDTO;

import java.util.Optional;

public interface QueryProductByIdUseCase extends UseCase<Long, Optional<ProductDTO>> {
}