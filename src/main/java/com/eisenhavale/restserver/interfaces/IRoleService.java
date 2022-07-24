package com.eisenhavale.restserver.interfaces;

import com.eisenhavale.restserver.models.Role;
import java.util.List;
import java.util.UUID;

public interface IRoleService {
  Role save(Role entity);

  Role update(Role entity);

  Role getById(UUID id);

  List<Role> getAll();

}
