
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

import com.Health.StlHealth_Dev.Model.Prescription;
import com.Health.StlHealth_Dev.repositories.PrescriptionRepo;

	@RestController
	@CrossOrigin("http://localhost:4200")
	public class PrescriptionController {
		@Autowired(required=false)
	private PrescriptionRepo prescriptionRepo;
		@GetMapping("/view_prescription")
		public ResponseEntity<List<Prescription>> view_prescription() {
	try {
				List<Prescription> prescriptionList= new ArrayList<>();
				prescriptionRepo.findAll().forEach(prescriptionList::add);
				if(prescriptionList.isEmpty()) {
					return new ResponseEntity<List<Prescription>>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<List<Prescription>>(prescriptionList,HttpStatus.OK);
			} catch(Exception ex) {
				return new ResponseEntity<List<Prescription>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/view_prescription/{id}")
		public ResponseEntity<Prescription> getPrescriptionById(@PathVariable Long id) {
			Optional<Prescription> PrescriptionData=prescriptionRepo.findById(id);
			if(PrescriptionData.isPresent()) {
				return new ResponseEntity<>(PrescriptionData.get(),HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@PostMapping("/add_prescription")
		public ResponseEntity<Prescription> addPrescription(@RequestBody Prescription prescription) {
			Prescription PrescriptionObj=prescriptionRepo.save(prescription);
			return new ResponseEntity<>(PrescriptionObj,HttpStatus.OK);
		}
		@PutMapping("/edit_prescription/{id}")
		public ResponseEntity<Prescription> updatePrescriptionById(@PathVariable Long id, @RequestBody Prescription newPrescriptionData) {
			Optional<Prescription>OldPrescriptionData=prescriptionRepo.findById(id);
			if(OldPrescriptionData.isPresent()) {
			Prescription updatedPrescriptionData =	OldPrescriptionData.get();
			updatedPrescriptionData.setCaseDetail(newPrescriptionData.getCaseDetail());
			updatedPrescriptionData.setPatient(newPrescriptionData.getPatient());
			updatedPrescriptionData.setDoctor(newPrescriptionData.getDoctor());
			updatedPrescriptionData.setPrescriptionImage(newPrescriptionData.getPrescriptionImage());
			updatedPrescriptionData.setNote(newPrescriptionData.getNote());
			updatedPrescriptionData.setNextVisitDate(newPrescriptionData.getNextVisitDate());
			updatedPrescriptionData.setCreatedDate(newPrescriptionData.getCreatedDate());
			updatedPrescriptionData.setUpdatedDate(newPrescriptionData.getUpdatedDate());
			Prescription PrescriptionObj=prescriptionRepo.save(updatedPrescriptionData);
			return new ResponseEntity<>(PrescriptionObj,HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@DeleteMapping("/delete_prescription/{id}")
		public ResponseEntity<HttpStatus> deletePrescriptionById(@PathVariable Long id) {
			prescriptionRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}


