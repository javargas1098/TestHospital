package com.test.hospital.services;

import com.test.hospital.dtos.ResponseGenericDTO;
import com.test.hospital.entities.Patient;

public interface IPatientService {


    ResponseGenericDTO savePatient(Patient patient);

}
