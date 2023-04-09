package com.darkross.mediappbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idUser;

    @Column(nullable = false,length = 100, unique = true)
    private String username;
    @Column(nullable = false,length = 150)
    private String password;
    @Column(nullable = false)
    private Boolean enabled;
}
