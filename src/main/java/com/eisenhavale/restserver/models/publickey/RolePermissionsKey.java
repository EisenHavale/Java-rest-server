package com.eisenhavale.restserver.models.publickey;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.annotations.Type;


@Embeddable
public class RolePermissionsKey implements Serializable {
  @Column(name="role_id")
  @Type(type="uuid-char")
  private UUID roleId;

  @Column(name="permission_id")
  @Type(type="uuid-char")
  private UUID permssionId;

  public RolePermissionsKey(){}

  public RolePermissionsKey(UUID roleId, UUID permssionId){
    this.roleId=roleId;
    this.permssionId=permssionId;
  }

}
