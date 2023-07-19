package com.Health.StlHealth_Dev.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Health.StlHealth_Dev.Model.Cases;
@Repository
public interface CasesRepo extends JpaRepository<Cases, Long> {

	@Query(value="SELECT Count(case_id) FROM tbl_cases",nativeQuery=true)
	public int countByCaseId();

}
