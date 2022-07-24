package com.eisenhavale.restserver.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="role")
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @NotBlank
  @Size(min=2,max = 255)
  private String name;

  @NotBlank
  @Size(min=2, max = 255)
  private String description;

  private boolean deleted;

  @OneToMany(mappedBy="role")
  @JsonManagedReference //* Use to set handle same json reference as settled on the other class
  private Set<Permissions> rolePermissions;

}
