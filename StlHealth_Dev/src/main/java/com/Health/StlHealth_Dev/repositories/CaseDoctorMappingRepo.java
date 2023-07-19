package com.Health.StlHealth_Dev.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Health.StlHealth_Dev.Model.CaseDoctorMapping;

@Repository
public interface CaseDoctorMappingRepo extends JpaRepository<CaseDoctorMapping, Long> {

}


