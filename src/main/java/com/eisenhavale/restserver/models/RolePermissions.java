package com.eisenhavale.restserver.models;

import com.eisenhavale.restserver.models.publickey.RolePermissionsKey;
import java.util.Set;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="role_permissions")
public class RolePermissions {

  @EmbeddedId private RolePermissionsKey id;

  private boolean canView;
  private boolean canEdit;
  private boolean canAdd;
  private boolean canDelete;

  @ManyToOne
  @MapsId("roleId")
  @JoinColumn(name = "role_id")
  private Role role;

  @ManyToOne
  @MapsId("permissionId")
  @JoinColumn(name="permission_id")
  private Permissions permissions;

}
