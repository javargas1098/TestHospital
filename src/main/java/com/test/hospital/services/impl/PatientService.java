package com.test.hospital.services.impl;

import com.test.hospital.dtos.ResponseGenericDTO;
import com.test.hospital.entities.Patient;
import com.test.hospital.repositories.PatientRepository;
import com.test.hospital.services.IPatientService;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService {

    final Logger logger = Logger.getLogger(this.getClass());

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    @Override
    public ResponseGenericDTO savePatient(Patient patient) {
        try {
            if (patientRepository.findByPatientId(patient.getId())!=null){
                return new ResponseGenericDTO("Patient already created", false, Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR);
            }

            patientRepository.save(patient);
            return new ResponseGenericDTO("Patient created", true, Integer.toString(HttpStatus.OK.value()), HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Event error: " + e.getMessage());
            return new ResponseGenericDTO(null, false, Integer.toString(HttpStatus.INTERNAL_SERVER_ERROR.value()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
