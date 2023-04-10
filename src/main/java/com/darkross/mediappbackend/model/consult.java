package com.darkross.mediappbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class consult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idConsult;

    @ManyToOne//-> relacion foranea de muchos a uno
    @JoinColumn(name = "id_patient", nullable = false, foreignKey = @ForeignKey(name = "FK_CONSULT_PATIENT"))//-> es el nombre que se le da a la relacion de la columna
    private Patient patient;//->permite JPQL Java Persistence Query Lenguaje / from patient p where p.dni = ?

    @ManyToOne
    @JoinColumn(name = "id_medic",nullable = false, foreignKey = @ForeignKey(name = "FK_CONSULT_MEDIC"))
    private Medic medic;

    @ManyToOne
    @JoinColumn(name = "id_specialty", nullable = false,foreignKey = @ForeignKey(name = "FK_CONSULT_SPECIALTY"))
    private Specialty specialty;

    @Column(length = 3,nullable = false)
    private String numConsult;

    @Column(nullable = false) //ISODATE yyyy-mm-ddTHH:mm:ss
    private LocalDateTime consultDate;
}

