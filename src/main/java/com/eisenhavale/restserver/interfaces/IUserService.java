package com.eisenhavale.restserver.interfaces;

import com.eisenhavale.restserver.models.User;
import java.util.List;
import java.util.UUID;

public interface IUserService {

  User save(User entity);

  User update(User entity);

  User getByEmail(String email);

  User getById(UUID id);

  List <User> getAll();

}
