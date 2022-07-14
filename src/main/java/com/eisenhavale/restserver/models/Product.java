package com.eisenhavale.restserver.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "product")
@CrossOrigin(origins = "*")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @NotBlank
    @Size(min=2, max = 15)
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    @NotBlank
    @NumberFormat
    private Double price;

    private String description;

    /** TODO Work ok categories*/
}
