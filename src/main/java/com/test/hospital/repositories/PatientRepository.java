package com.test.hospital.repositories;

import com.test.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query(value = "select p.* from patients p where p.id = :id ", nativeQuery = true)
    Patient findByPatientId(@Param("id") long id );

}
