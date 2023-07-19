package com.Health.StlHealth_Dev.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "tbl_cases")
public class Cases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_id")
    private Long case_id;

    @Column(name = "case_number")
    private String case_number;

    
    @Column(name = "patient_id")
    private Long patient_id;

    
    @Column(name = "vle_id")
    private Long vle_id;

    @Column(name = "vle_note")
    private String vle_note;

    @Column(name = "panchayat_id")
    private Integer panchayat_id;

    @Column(name = "case_status")
    private String case_status;

    @Column(name = "case_date")
    private String case_date;

    @Column(name = "ref_image")
    private String ref_image;

    @Column(name = "description")
    private String description;

    @Column(name = "created_date")
    private String created_date;

    @Column(name = "updated_date")
    private String updated_date;

	public Cases(Long case_id, String case_number, Long patient_id, Long vle_id, String vle_note, Integer panchayat_id,
			String case_status, String case_date, String ref_image, String description, String created_date,
			String updated_date) {
		super();
		this.case_id = case_id;
		this.case_number = case_number;
		this.patient_id = patient_id;
		this.vle_id = vle_id;
		this.vle_note = vle_note;
		this.panchayat_id = panchayat_id;
		this.case_status = case_status;
		this.case_date = case_date;
		this.ref_image = ref_image;
		this.description = description;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}
	public Cases() {
	
	}

	public Long getCase_id() {
		return case_id;
	}

	public void setCase_id(Long case_id) {
		this.case_id = case_id;
	}

	public String getCase_number() {
		return case_number;
	}

	public void setCase_number(String case_number) {
		this.case_number = case_number;
	}

	public Long getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(Long patient_id) {
		this.patient_id = patient_id;
	}

	public Long getVle_id() {
		return vle_id;
	}

	public void setVle_id(Long vle_id) {
		this.vle_id = vle_id;
	}

	public String getVle_note() {
		return vle_note;
	}

	public void setVle_note(String vle_note) {
		this.vle_note = vle_note;
	}

	public Integer getPanchayat_id() {
		return panchayat_id;
	}

	public void setPanchayat_id(Integer panchayat_id) {
		this.panchayat_id = panchayat_id;
	}

	public String getCase_status() {
		return case_status;
	}

	public void setCase_status(String case_status) {
		this.case_status = case_status;
	}

	public String getCase_date() {
		return case_date;
	}

	public void setCase_date(String case_date) {
		this.case_date = case_date;
	}

	public String getRef_image() {
		return ref_image;
	}

	public void setRef_image(String ref_image) {
		this.ref_image = ref_image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "Cases [case_id=" + case_id + ", case_number=" + case_number + ", patient_id=" + patient_id + ", vle_id="
				+ vle_id + ", vle_note=" + vle_note + ", panchayat_id=" + panchayat_id + ", case_status=" + case_status
				+ ", case_date=" + case_date + ", ref_image=" + ref_image + ", description=" + description
				+ ", created_date=" + created_date + ", updated_date=" + updated_date + "]";
	}

	
    

}