package com.eisenhavale.restserver.models;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Setter
@Getter
@Table(name = "category")
@CrossOrigin(origins = "*")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private UUID id;

  @NotBlank
  @Size(min=2, max=20)
  @Column(name = "name")
  private String name;

  @Column()
  @NotBlank
  private String description;



  /* TODO identify probable missing attributes */

}
