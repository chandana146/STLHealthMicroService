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

import com.Health.StlHealth_Dev.Model.Equipment;
import com.Health.StlHealth_Dev.repositories.EquipmentRepo;



	@RestController
	@CrossOrigin("http://localhost:4200")
	public class EquipmentControllers {
		@Autowired(required=false)
	private EquipmentRepo equipmentRepo;
		@GetMapping("/view_equipmentlist")
		public ResponseEntity<List<Equipment>>view_equipmentlist() {
	try {
				List<Equipment> EquipmentList= new ArrayList<>();
				equipmentRepo.findAll().forEach(EquipmentList::add);
				if(EquipmentList.isEmpty()) {
					return new ResponseEntity<List<Equipment>>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<List<Equipment>>(EquipmentList,HttpStatus.OK);
			} catch(Exception ex) {
				return new ResponseEntity<List<Equipment>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/view_equipmentlist/{id}")
		public ResponseEntity<Equipment> getEquipmentById(@PathVariable Long id) {
			Optional<Equipment> EquipmentData=equipmentRepo.findById(id);
			if(EquipmentData.isPresent()) {
				return new ResponseEntity<>(EquipmentData.get(),HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@PostMapping("/add_equipmentlist")
		public ResponseEntity<Equipment> addEquipment(@RequestBody Equipment equipment) {
			Equipment EquipmentObj=equipmentRepo.save(equipment);
			return new ResponseEntity<>(EquipmentObj,HttpStatus.OK);
		}
		@PutMapping("/edit_equipmentlist/{id}")
		public ResponseEntity<Equipment> updateEquipmentById(@PathVariable Long id, @RequestBody Equipment newEquipmentData) {
			Optional<Equipment>OldEquipmentData=equipmentRepo.findById(id);
			if(OldEquipmentData.isPresent()) {
			Equipment updatedEquipmentData =	OldEquipmentData.get();
			updatedEquipmentData.setEquipment_name(newEquipmentData.getEquipment_name());
			updatedEquipmentData.setEquipment_model(newEquipmentData.getEquipment_model());
			updatedEquipmentData.setManufacturer(newEquipmentData.getManufacturer());
			updatedEquipmentData.setCreated_date(newEquipmentData.getCreated_date());
			updatedEquipmentData.setUpdated_date(newEquipmentData.getUpdated_date());    
			Equipment EquipmentObj=equipmentRepo.save(updatedEquipmentData);
			return new ResponseEntity<>(EquipmentObj,HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@DeleteMapping("/delete_equipmentlist/{id}")
		public ResponseEntity<HttpStatus> deleteEquipmentById(@PathVariable Long id) {
			equipmentRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}



