package com.test.hospital.controllers;

import com.test.hospital.dtos.ResponseGenericDTO;
import com.test.hospital.entities.Patient;
import com.test.hospital.services.impl.PatientService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/patients")
public class PatientController {
    final Logger logger = Logger.getLogger(this.getClass());
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @PostMapping
    public ResponseGenericDTO createPatient(@Valid @RequestBody Patient patient) {
        logger.info("ControladorEvento - listarEvento()");
        return patientService.savePatient(patient);
    }


}
