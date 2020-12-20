package com.test.hospital.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;

@Entity
@Table(name = "patients")
@Data
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id", nullable = false)
    private Long patienId;

    @Column(name = "id", nullable = false,length = 20)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "names", nullable = false,length = 255)
    private String names;

    @NotBlank(message = "Surnames is mandatory")
    @Column(name = "surnames", nullable = false,length = 255)
    private String surnames;

    @NotBlank(message = "Phone is mandatory")
    @Column(name = "phone", nullable = false,length = 20)
    private String phone;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "email", nullable = false,length = 255)
    @Email(message = "Email should be valid")
    private String email;
}
