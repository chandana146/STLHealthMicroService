package com.Health.StlHealth_Dev.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tbl_equipments")
public class Equipment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="equipment_id")
	private Long equipment_id;
	@Column(name="equipment_name")
	private String equipment_name;
	@Column(name="equipment_model")
	private String equipment_model;
	@Column(name="manufacturer")
	private String manufacturer;
	@Column(name="created_date")
	private Date created_date;
	@Column(name="updated_date")
	private Date updated_date;
	public Equipment(Long equipment_id, String equipment_name, String equipment_model, String manufacturer,
			Date created_date, Date updated_date) {
		super();
		this.equipment_id = equipment_id;
		this.equipment_name = equipment_name;
		this.equipment_model = equipment_model;
		this.manufacturer = manufacturer;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}
	public Equipment() {
		
	}
	public Long getEquipment_id() {
		return equipment_id;
	}
	public void setEquipment_id(Long equipment_id) {
		this.equipment_id = equipment_id;
	}
	public String getEquipment_name() {
		return equipment_name;
	}
	public void setEquipment_name(String equipment_name) {
		this.equipment_name = equipment_name;
	}
	public String getEquipment_model() {
		return equipment_model;
	}
	public void setEquipment_model(String equipment_model) {
		this.equipment_model = equipment_model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	@Override
	public String toString() {
		return "Equipment [equipment_id=" + equipment_id + ", equipment_name=" + equipment_name + ", equipment_model="
				+ equipment_model + ", manufacturer=" + manufacturer + ", created_date=" + created_date
				+ ", updated_date=" + updated_date + "]";
	}
	
}
