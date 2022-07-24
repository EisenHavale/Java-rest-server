package com.eisenhavale.restserver.repositories;

import com.eisenhavale.restserver.models.Role;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, UUID> {

}
