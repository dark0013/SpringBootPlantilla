package com.darkross.mediappbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@EqualsAndHashCode
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idPatient;
    @Column(length = 70, nullable = false)
    public String name;

}
