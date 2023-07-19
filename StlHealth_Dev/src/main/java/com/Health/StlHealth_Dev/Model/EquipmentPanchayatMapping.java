package com.Health.StlHealth_Dev.Model;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "tbl_equipment_panchayat_mapping")
public class EquipmentPanchayatMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mapping_id")
    private Long mappingId;

    
    @Column(name = "equipment_id")
    private Long equipment;

    
    @Column(name = "panchayat_id")
    private String panchayat;

    @Column(name = "equipment_code_2")
    private String equipmentCode2;

    @Column(name = "equipment_code_3")
    private String equipmentCode3;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

	public EquipmentPanchayatMapping(Long mappingId, Long equipment, String panchayat,
			String equipmentCode2, String equipmentCode3, String description, Date createdDate,
			Date updatedDate) {
		super();
		this.mappingId = mappingId;
		this.equipment = equipment;
		this.panchayat = panchayat;
		this.equipmentCode2 = equipmentCode2;
		this.equipmentCode3 = equipmentCode3;
		this.description = description;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public EquipmentPanchayatMapping() {
		
	}
	public Long getMappingId() {
		return mappingId;
	}

	public void setMappingId(Long mappingId) {
		this.mappingId = mappingId;
	}

	public Long getEquipment() {
		return equipment;
	}

	public void setEquipment(Long equipment) {
		this.equipment = equipment;
	}

	public String getPanchayat() {
		return panchayat;
	}

	public void setPanchayat(String panchayat) {
		this.panchayat = panchayat;
	}

	public String getEquipmentCode2() {
		return equipmentCode2;
	}

	public void setEquipmentCode2(String equipmentCode2) {
		this.equipmentCode2 = equipmentCode2;
	}

	public String getEquipmentCode3() {
		return equipmentCode3;
	}

	public void setEquipmentCode3(String equipmentCode3) {
		this.equipmentCode3 = equipmentCode3;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "EquipmentPanchayatMapping [mappingId=" + mappingId + ", equipment=" + equipment + ", equipmentCode2="
				+ equipmentCode2 + ", equipmentCode3=" + equipmentCode3 + ", description=" + description
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

    // Add other relationships, getters, setters, and methods

  
}
