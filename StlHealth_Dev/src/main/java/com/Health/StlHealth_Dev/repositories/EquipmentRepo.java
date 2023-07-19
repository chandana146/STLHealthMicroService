package com.Health.StlHealth_Dev.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Health.StlHealth_Dev.Model.Equipment;
@EnableJpaRepositories
public interface EquipmentRepo extends JpaRepository<Equipment, Long>{

}
