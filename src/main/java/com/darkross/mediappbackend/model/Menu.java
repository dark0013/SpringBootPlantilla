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
public class Menu {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idMenu;

    @Column(nullable = false,length = 20)
    private String icon;

    @Column(nullable = false,length = 20)
    private String name;

    @Column(nullable = false,length = 30)
    private String url;


}
