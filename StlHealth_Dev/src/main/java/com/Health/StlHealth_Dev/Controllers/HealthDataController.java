package com.Health.StlHealth_Dev.Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Health.StlHealth_Dev.Model.HealthData;
import com.Health.StlHealth_Dev.repositories.HealthDataRepo;

	@RestController
	@CrossOrigin("http://localhost:4200")
	public class HealthDataController {
		@Autowired
	private HealthDataRepo healthDataRepo;
		@GetMapping("/view_healthData")
		public ResponseEntity<List<HealthData>> view_healthData() {
	try {
				List<HealthData> HealthDataList= new ArrayList<>();
				healthDataRepo.findAll().forEach(HealthDataList::add);
				if(HealthDataList.isEmpty()) {
					return new ResponseEntity<List<HealthData>>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<List<HealthData>>(HealthDataList,HttpStatus.OK);
			} catch(Exception ex) {
				return new ResponseEntity<List<HealthData>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/view_healthData/{id}")
		public ResponseEntity<HealthData> getHealthDataById(@PathVariable Long id) {
			Optional<HealthData> HealthDataData=healthDataRepo.findById(id);
			if(HealthDataData.isPresent()) {
				return new ResponseEntity<>(HealthDataData.get(),HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@PostMapping("/add_healthData")
		public ResponseEntity<HealthData> addHealthData(@RequestBody HealthData health) throws ParseException {
			Date CREATED_AT=new Date();
			SimpleDateFormat DATE_FORMATTER=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			health.setCreatedAt(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));
			health.setUpdatedAt(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));
			HealthData HealthDataObj=healthDataRepo.save(health);
			return new ResponseEntity<>(HealthDataObj,HttpStatus.OK);
		}
	}