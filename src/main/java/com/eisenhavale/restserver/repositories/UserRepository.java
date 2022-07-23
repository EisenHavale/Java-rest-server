package com.eisenhavale.restserver.repositories;


import com.eisenhavale.restserver.models.User;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {

}
