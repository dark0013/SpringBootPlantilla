package com.darkross.mediappbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    public Integer idPatient;
    @Column(length = 70, nullable = false)
    public String firstName;
    @Column(length = 70, nullable = false)
    public String lastName;
    @Column(length = 10, nullable = false)
    public String dni;
    @Column(length = 200, nullable = false)
    public String address;
    @Column(length = 10, nullable = false)
    public String phone;
}
