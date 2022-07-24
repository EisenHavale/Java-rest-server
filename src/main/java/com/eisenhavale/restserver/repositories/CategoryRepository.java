package com.eisenhavale.restserver.repositories;

import com.eisenhavale.restserver.models.Category;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, UUID> {

}
