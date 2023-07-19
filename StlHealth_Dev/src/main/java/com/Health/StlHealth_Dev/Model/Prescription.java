package com.Health.StlHealth_Dev.Model;


import jakarta.persistence.*;
import java.util.Date;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_prescription")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_id")
    private Long prescriptionId;

    
    @Column(name = "doctor_id")
    private Long doctor;

    
    @Column(name = "patient_id")
    private Long patient;

    
    @Column(name = "case_id")
    private Long caseDetail;

    @Column(name = "prescription_image")
    private String prescriptionImage;

    @Column(name = "note")
    private String note;

    @Column(name = "next_visit_date")
    private LocalDateTime nextVisitDate;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

	public Prescription(Long prescriptionId, Long doctor, Long patient, Long caseDetail, String prescriptionImage,
			String note, LocalDateTime nextVisitDate, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super();
		this.prescriptionId = prescriptionId;
		this.doctor = doctor;
		this.patient = patient;
		this.caseDetail = caseDetail;
		this.prescriptionImage = prescriptionImage;
		this.note = note;
		this.nextVisitDate = nextVisitDate;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
public Prescription() {
	
}
	public Long getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(Long prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public Long getDoctor() {
		return doctor;
	}

	public void setDoctor(Long doctor) {
		this.doctor = doctor;
	}

	public Long getPatient() {
		return patient;
	}

	public void setPatient(Long patient) {
		this.patient = patient;
	}

	public Long getCaseDetail() {
		return caseDetail;
	}

	public void setCaseDetail(Long caseDetail) {
		this.caseDetail = caseDetail;
	}

	public String getPrescriptionImage() {
		return prescriptionImage;
	}

	public void setPrescriptionImage(String prescriptionImage) {
		this.prescriptionImage = prescriptionImage;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public LocalDateTime getNextVisitDate() {
		return nextVisitDate;
	}

	public void setNextVisitDate(LocalDateTime nextVisitDate) {
		this.nextVisitDate = nextVisitDate;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime  getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime  updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Prescription [prescriptionId=" + prescriptionId + ", doctor=" + doctor + ", patient=" + patient
				+ ", caseDetail=" + caseDetail + ", prescriptionImage=" + prescriptionImage + ", note=" + note
				+ ", nextVisitDate=" + nextVisitDate + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ "]";
	}

    

}