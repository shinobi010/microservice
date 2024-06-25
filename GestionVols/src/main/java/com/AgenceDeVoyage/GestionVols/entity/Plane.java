package com.AgenceDeVoyage.GestionVols.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "Plane")
public class Plane implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="identifier")
    private Long identifier;

    private String name;
    private String capacity;
    private Float width;
    private Float height;
    private Float speedMax;

}
