package com.eisenhavale.restserver.repositories;

import com.eisenhavale.restserver.models.Permissions;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionsRepository extends CrudRepository<Permissions, UUID> {

}
