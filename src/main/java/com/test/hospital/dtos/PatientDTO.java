package com.test.hospital.dtos;

import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class PatientDTO {
    private Long PatienId;

    private Long id;

    private String names;

    private String surnames;

    private String phone;

    private String email;
}
