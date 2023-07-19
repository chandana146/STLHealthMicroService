
package com.Health.StlHealth_Dev.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Health.StlHealth_Dev.Model.HealthData;

public interface HealthDataRepo extends JpaRepository<HealthData, Long>{

}