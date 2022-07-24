package com.eisenhavale.restserver.interfaces;

import com.eisenhavale.restserver.models.Product;
import java.util.List;
import java.util.UUID;

public interface IProductService {

  Product save(Product entity);

  Product update(Product entity);

  Product getById(UUID id);

  List<Product> getAll();

}

