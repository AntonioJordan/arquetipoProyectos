package com.base.artefactobase;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USUARIOSS", schema = "JWT_SECURITY")
public class User {
    @Id
    private Integer id;
    private String firstName;
    private String lastname;
    private String email;
    private String password;
}
