package com.Health.StlHealth_Dev.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_case_doctor_mapping")
public class CaseDoctorMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mapping_id")
    private Long mapping_id;
    
    @Column(name = "case_id")
    private Long case_id;
    
    @Column(name = "doctor_id")
    private Long doctor_id;

    @Column(name = "rejected_by_id")
    private Long rejected_by_id;

    @Column(name = "approved_by_id")
    private Long approved_by_id;

    @Column(name = "assigned_by_id")
    private Long assigned_by_id;

    @Column(name = "reason")
    private String reason;

    @Column(name = "mapping_status")
    private String mappingStatus;

    @Column(name = "created_date")
    private String created_date;

    @Column(name = "updated_date")
    private String updated_date;

	public CaseDoctorMapping(Long mapping_id, Long case_id, Long doctor_id, Long rejected_by_id, Long approved_by_id,
			Long assigned_by_id, String reason, String mappingStatus, String created_date, String updated_date) {
		super();
		this.mapping_id = mapping_id;
		this.case_id = case_id;
		this.doctor_id = doctor_id;
		this.rejected_by_id = rejected_by_id;
		this.approved_by_id = approved_by_id;
		this.assigned_by_id = assigned_by_id;
		this.reason = reason;
		this.mappingStatus = mappingStatus;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}
	public CaseDoctorMapping() {
	
	}
	public Long getMapping_id() {
		return mapping_id;
	}
	public void setMapping_id(Long mapping_id) {
		this.mapping_id = mapping_id;
	}
	public Long getCase_id() {
		return case_id;
	}
	public void setCase_id(Long case_id) {
		this.case_id = case_id;
	}
	public Long getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}
	public Long getRejected_by_id() {
		return rejected_by_id;
	}
	public void setRejected_by_id(Long rejected_by_id) {
		this.rejected_by_id = rejected_by_id;
	}
	public Long getApproved_by_id() {
		return approved_by_id;
	}
	public void setApproved_by_id(Long approved_by_id) {
		this.approved_by_id = approved_by_id;
	}
	public Long getAssigned_by_id() {
		return assigned_by_id;
	}
	public void setAssigned_by_id(Long assigned_by_id) {
		this.assigned_by_id = assigned_by_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getMappingStatus() {
		return mappingStatus;
	}
	public void setMappingStatus(String mappingStatus) {
		this.mappingStatus = mappingStatus;
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
		return "CaseDoctorMapping [mapping_id=" + mapping_id + ", case_id=" + case_id + ", doctor_id=" + doctor_id
				+ ", rejected_by_id=" + rejected_by_id + ", approved_by_id=" + approved_by_id + ", assigned_by_id="
				+ assigned_by_id + ", reason=" + reason + ", mappingStatus=" + mappingStatus + ", created_date="
				+ created_date + ", updated_date=" + updated_date + "]";
	}
	
	}