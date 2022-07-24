package com.eisenhavale.restserver.interfaces;

import com.eisenhavale.restserver.models.Category;
import java.util.List;
import java.util.UUID;

public interface ICategoryService {

  Category save(Category entity);

  Category update(Category entity);

  Category getById(UUID id);

  List<Category> getAll();

}
