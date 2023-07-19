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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Health.StlHealth_Dev.Model.entity;
import com.Health.StlHealth_Dev.repositories.entityRepo;

	@RestController
	@CrossOrigin("http://localhost:4200")
	public class entityController {
		@Autowired
	private entityRepo entityRepo;
		@GetMapping("/view_entitylist")
		public ResponseEntity<List<entity>> view_entitylist() {
//	try {
				List<entity> entityList= new ArrayList<>();
				entityRepo.findAll().forEach(entityList::add);
//				if(entityList.isEmpty()) {
//					return new ResponseEntity<List<entity>>(HttpStatus.NO_CONTENT);
//				}
				return new ResponseEntity<List<entity>>(entityList,HttpStatus.OK);
//			} catch(Exception ex) {
//				return new ResponseEntity<List<entity>>(HttpStatus.INTERNAL_SERVER_ERROR);
//			}
		}
		
		@GetMapping("/view_entitylist/{id}")
		public ResponseEntity<entity> view_entitylistById(@PathVariable Long id) {
			Optional<entity> entityData=entityRepo.findById(id);
			if(entityData.isPresent()) {
				return new ResponseEntity<>(entityData.get(),HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@PostMapping("/add_entitylist")
		public ResponseEntity<entity> addentity(@RequestBody entity entit) throws ParseException {
			System.out.println(entit);
			Date CREATED_AT=new Date();
			SimpleDateFormat DATE_FORMATTER=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			entit.setCreated_date(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));
			entit.setUpdated_date(DATE_FORMATTER.parse(DATE_FORMATTER.format(CREATED_AT)));


			entity entityObj=entityRepo.save(entit);
			return new ResponseEntity<>(entityObj,HttpStatus.OK);
		}
		@PutMapping("/edit_entitylist/{id}")
		public ResponseEntity<entity> updateentityById(@PathVariable Long id, @RequestBody entity newentityData) {
			Optional<entity>OldentityData=entityRepo.findById(id);
			if(OldentityData.isPresent()) {
			entity updatedentityData =	OldentityData.get();
			updatedentityData.setEntity_name(newentityData.getEntity_name());
			updatedentityData.setCreated_date(newentityData.getCreated_date());
			updatedentityData.setUpdated_date(newentityData.getUpdated_date());
			entity entityObj=entityRepo.save(updatedentityData);
			return new ResponseEntity<>(entityObj,HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@DeleteMapping("/delete_entitylist/{id}")
		public ResponseEntity<HttpStatus> deleteentityById(@PathVariable Long id) {
			entityRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}



