package com.eisenhavale.restserver.models;

import com.eisenhavale.restserver.models.constants.UserConstants.UserJoinTable;
import com.eisenhavale.restserver.models.constants.UserConstants.UserTable;
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
@Table(name= UserTable.TABLE_NAME)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type="uuid-char")
    @Column(name=UserTable.ID_COLUMN_NAME)
    private UUID id;

    @NotBlank
    @Size(min=5, max=20)
    @Column(name= UserTable.NAME_COLUMN_NAME)
    private String name;

    @NotBlank
    @Size(min=5, max=20)
    @Column(name= UserTable.LAST_NAME_COLUMN_NAME)
    private String lastName;

    @NotBlank
    @Size(min=3,  max=20)
    @Column(name= UserTable.USER_NAME_COLUMN_NAME)
    private String userName;

    @NotBlank
    @Column(name=UserTable.BIRTHDAY_COLUMN_NAME)
    @DateTimeFormat
    private Date birthDay;

    @NotBlank
    @Column(name=UserTable.PASSWORD_COLUMN_NAME)
    private String password;

    @NotBlank
    @Email
    @UniqueElements
    @Column(name =UserTable.EMAIL_COLUMN_NAME)
    private String email;

    @NotBlank
    @UniqueElements
    @Column(name=UserTable.PHONE_COLUMN_NAME)
    @NumberFormat
    private int phoneNumber; /** TODO Set a proper number format*/

    @NotBlank
    @Column(name=UserTable.STATUS_COLUMN_NAME)
    private Boolean isActive;

    @Column(name=UserTable.IMAGE_COLUMN_NAME)
    private String profileImage;

    @ManyToOne
    @JoinTable(
        name = UserJoinTable.TABLE_NAME,
        joinColumns = @JoinColumn(name=UserJoinTable.USER_COULMN_NAME, referencedColumnName = UserTable.ID_COLUMN_NAME),
        inverseJoinColumns = @JoinColumn(name=UserJoinTable.ROLE_COULMN_NAME, referencedColumnName = UserTable.ID_COLUMN_NAME)
    )
    private Role role;

    /*TODO Work on roles*/

}
