package com.Health.StlHealth_Dev.Controllers;

import java.util.ArrayList;
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

import com.Health.StlHealth_Dev.Model.Cases;
import com.Health.StlHealth_Dev.repositories.CasesRepo;

	@RestController
	@CrossOrigin("http://localhost:4200")
	public class CaseController {
		@Autowired(required=false)
	private CasesRepo casesRepo;

	@GetMapping("/view_casedetails")
		public ResponseEntity<List<Cases>> view_casedetails() {
	try {
				List<Cases> casesList= new ArrayList<>();
				casesRepo.findAll().forEach(casesList::add);
				if(casesList.isEmpty()) {
					return new ResponseEntity<List<Cases>>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<List<Cases>>(casesList,HttpStatus.OK);
			} catch(Exception ex) {
				return new ResponseEntity<List<Cases>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/view_casedetails/{id}")
		public ResponseEntity<Cases> getCasesById(@PathVariable Long id) {
			Optional<Cases> CasesData=casesRepo.findById(id);
			if(CasesData.isPresent()) {
				return new ResponseEntity<>(CasesData.get(),HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@PostMapping("/add_casedetails")
		public ResponseEntity<Cases> addCases(@RequestBody Cases cases) {
			Cases CasesObj=casesRepo.save(cases);
			return new ResponseEntity<>(CasesObj,HttpStatus.OK);
		}
		@PutMapping("/edit_casedetails/{id}")
		public ResponseEntity<Cases> updateCasesById(@PathVariable Long id, @RequestBody Cases newCasesData) {
			Optional<Cases>OldCasesData=casesRepo.findById(id);
			if(OldCasesData.isPresent()) {
			Cases updatedCasesData =	OldCasesData.get();
			updatedCasesData.setCase_number(newCasesData.getCase_number());
			updatedCasesData.setPatient_id(newCasesData.getPatient_id());
			updatedCasesData.setVle_id(newCasesData.getVle_id());
			updatedCasesData.setVle_note(newCasesData.getVle_note());
			updatedCasesData.setPanchayat_id(newCasesData.getPanchayat_id());
			updatedCasesData.setCase_status(newCasesData.getCase_status());
			updatedCasesData.setCase_date(newCasesData.getCase_date());
			updatedCasesData.setRef_image(newCasesData.getRef_image());
			updatedCasesData.setDescription(newCasesData.getDescription());
			updatedCasesData.setCreated_date(newCasesData.getCreated_date());
			updatedCasesData.setUpdated_date(newCasesData.getUpdated_date());
			Cases CasesObj=casesRepo.save(updatedCasesData);
			return new ResponseEntity<>(CasesObj,HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@DeleteMapping("/delete_casedetails/{id}")
		public ResponseEntity<HttpStatus> deleteCasesById(@PathVariable Long id) {
			casesRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		@GetMapping("/count_casedetails")
		public int count_casedetails(){
			return casesRepo.countByCaseId();
		}
	}


