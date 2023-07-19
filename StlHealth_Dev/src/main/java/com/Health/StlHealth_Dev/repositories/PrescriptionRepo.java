package com.Health.StlHealth_Dev.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Health.StlHealth_Dev.Model.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Long>{

}