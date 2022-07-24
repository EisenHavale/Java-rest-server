package com.eisenhavale.restserver.interfaces;

import com.eisenhavale.restserver.models.Permissions;
import java.util.List;
import java.util.UUID;

public interface IPermissions {

  Permissions save(Permissions entity);

  Permissions update(Permissions entity);

  Permissions getById(UUID id);

  List<Permissions> getAll();

}
