package com.eisenhavale.restserver.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@CrossOrigin(origins="*")
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name="id")
    private UUID id;

    @NotBlank
    @Size(min=5, max=20)
    @Column(name="name")
    private String name;

    @NotBlank
    @Size(min=5, max=20)
    @Column(name="last_name")
    private String lastName;

    @NotBlank
    @Size(min=3,  max=20)
    @Column(name="user_name")
    private String userName;

    @NotBlank
    @Column(name="birth_day")
    @DateTimeFormat
    private Date birthDay;

    @NotBlank
    @Column(name="password")

    private String password;

    @NotBlank
    @Email
    @UniqueElements
    @Column(name ="email")
    private String email;

    @NotBlank
    @UniqueElements
    @Column(name="phone_number")
    @NumberFormat
    private int phoneNumber; /** TODO Set a proper number format*/

    @NotBlank
    @Column(name="status")
    private Boolean isActive;

    @Column(name="profile_image")
    private String profileImage;

    /**TODO Work on roles*/

}
