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

import com.Health.StlHealth_Dev.Model.EquipmentPanchayatMapping;
import com.Health.StlHealth_Dev.repositories.EquipmentPanchayatMappingRepo;

	@RestController
	@CrossOrigin("http://localhost:4200")
	public class EquipmentPanchayatMappingController {
		@Autowired(required=false)
	private EquipmentPanchayatMappingRepo equipmentPanchayatMapping;
		@GetMapping("/view_equipmentmap")
		public ResponseEntity<List<EquipmentPanchayatMapping>> view_equipmentmap() {
	try {
				List<EquipmentPanchayatMapping> equipmentPanchayatList= new ArrayList<>();
				equipmentPanchayatMapping.findAll().forEach(equipmentPanchayatList::add);
				if(equipmentPanchayatList.isEmpty()) {
					return new ResponseEntity<List<EquipmentPanchayatMapping>>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<List<EquipmentPanchayatMapping>>(equipmentPanchayatList,HttpStatus.OK);
			} catch(Exception ex) {
				return new ResponseEntity<List<EquipmentPanchayatMapping>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		@GetMapping("/view_equipmentmap/{id}")
		public ResponseEntity<EquipmentPanchayatMapping> view_equipmentmapById(@PathVariable Long id) {
			Optional<EquipmentPanchayatMapping> EquipmentPanchayatMappingData=equipmentPanchayatMapping.findById(id);
			if(EquipmentPanchayatMappingData.isPresent()) {
				return new ResponseEntity<>(EquipmentPanchayatMappingData.get(),HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@PostMapping("/add_equipmentmap")
		public ResponseEntity<EquipmentPanchayatMapping> addEquipmentPanchayatMapping(@RequestBody EquipmentPanchayatMapping cases) {
			EquipmentPanchayatMapping EquipmentPanchayatMappingObj=equipmentPanchayatMapping.save(cases);
			return new ResponseEntity<>(EquipmentPanchayatMappingObj,HttpStatus.OK);
		}
		@PutMapping("/edit_equipmentmap/{id}")
		public ResponseEntity<EquipmentPanchayatMapping> updateEquipmentPanchayatMappingById(@PathVariable Long id, @RequestBody EquipmentPanchayatMapping newEquipmentPanchayatMappingData) {
			Optional<EquipmentPanchayatMapping>OldEquipmentPanchayatMappingData=equipmentPanchayatMapping.findById(id);
			if(OldEquipmentPanchayatMappingData.isPresent()) {
			EquipmentPanchayatMapping updatedEquipmentPanchayatMappingData =	OldEquipmentPanchayatMappingData.get();
			updatedEquipmentPanchayatMappingData.setEquipment(newEquipmentPanchayatMappingData.getEquipment());
			updatedEquipmentPanchayatMappingData.setPanchayat(newEquipmentPanchayatMappingData.getPanchayat());
			updatedEquipmentPanchayatMappingData.setEquipmentCode2(newEquipmentPanchayatMappingData.getEquipmentCode2());
			updatedEquipmentPanchayatMappingData.setEquipmentCode3(newEquipmentPanchayatMappingData.getEquipmentCode3());
			updatedEquipmentPanchayatMappingData.setDescription(newEquipmentPanchayatMappingData.getDescription());
			updatedEquipmentPanchayatMappingData.setCreatedDate(newEquipmentPanchayatMappingData.getCreatedDate());
			updatedEquipmentPanchayatMappingData.setUpdatedDate(newEquipmentPanchayatMappingData.getUpdatedDate());
			EquipmentPanchayatMapping EquipmentPanchayatMappingObj=equipmentPanchayatMapping.save(updatedEquipmentPanchayatMappingData);
			return new ResponseEntity<>(EquipmentPanchayatMappingObj,HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@DeleteMapping("/delete_equipmentmap/{id}")
		public ResponseEntity<HttpStatus> deleteEquipmentPanchayatMappingById(@PathVariable Long id) {
			equipmentPanchayatMapping.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}


