package com.eisenhavale.restserver.models;

import com.eisenhavale.restserver.models.constants.ProductConstants;
import java.util.Set;
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
    private UUID id;

    @NotBlank
    @Size(min=2, max = 15)
    private String name;


    @NotBlank
    @NumberFormat
    private Double price;

    @NotBlank
    private String description;

    private String image;

    @ManyToOne
    private Category category;

    /** TODO Work ok categories*/
}
