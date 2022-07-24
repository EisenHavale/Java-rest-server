package com.eisenhavale.restserver.repositories;

import com.eisenhavale.restserver.models.Product;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends CrudRepository<Product, UUID> {

}
