package com.Health.StlHealth_Dev.Model;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_health_data")
public class HealthData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_id")
    private Long healthId;

    
    @Column(name = "case_id")
    private Long caseObj;

    
    @Column(name = "patient_id")
    private Long patient;

    @Column(name = "bt_temperature")
    private double btTemperature;

    @Column(name = "bp_systolic")
    private int bpSystolic;

    @Column(name = "bp_diastolic")
    private int bpDiastolic;

    @Column(name = "bp_ma_pressure")
    private int bpMaPressure;

    @Column(name = "bp_pulse")
    private int bpPulse;

    @Column(name = "pom_oxegen_level")
    private int pomOxygenLevel;

    @Column(name = "pom_pulse")
    private int pomPulse;

    @Column(name = "bg_glucose_level")
    private int bgGlucoseLevel;

    @Column(name = "bg_post_glucose_level")
    private int bgPostGlucoseLevel;

    @Column(name = "fb_heart_rates")
    private int fbHeartRates;

    @Column(name = "fb_steps")
    private int fbSteps;

    @Column(name = "fb_calories")
    private int fbCalories;

    @Column(name = "wm_weight")
    private double wmWeight;

    @Column(name = "other_data")
    private String otherData;

    @Column(name = "type")
    private String type;

    @Column(name = "created_date")
    private Date createdAt;

    @Column(name = "updated_date")
    private Date updatedAt;

	public HealthData(Long healthId, Long caseObj, Long patient, double btTemperature, int bpSystolic, int bpDiastolic,
			int bpMaPressure, int bpPulse, int pomOxygenLevel, int pomPulse, int bgGlucoseLevel, int bgPostGlucoseLevel,
			int fbHeartRates, int fbSteps, int fbCalories, double wmWeight, String otherData, String type,
			Date createdAt, Date updatedAt) {
		super();
		this.healthId = healthId;
		this.caseObj = caseObj;
		this.patient = patient;
		this.btTemperature = btTemperature;
		this.bpSystolic = bpSystolic;
		this.bpDiastolic = bpDiastolic;
		this.bpMaPressure = bpMaPressure;
		this.bpPulse = bpPulse;
		this.pomOxygenLevel = pomOxygenLevel;
		this.pomPulse = pomPulse;
		this.bgGlucoseLevel = bgGlucoseLevel;
		this.bgPostGlucoseLevel = bgPostGlucoseLevel;
		this.fbHeartRates = fbHeartRates;
		this.fbSteps = fbSteps;
		this.fbCalories = fbCalories;
		this.wmWeight = wmWeight;
		this.otherData = otherData;
		this.type = type;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
public HealthData() {
	
}
	public Long getHealthId() {
		return healthId;
	}

	public void setHealthId(Long healthId) {
		this.healthId = healthId;
	}

	public Long getCaseObj() {
		return caseObj;
	}

	public void setCaseObj(Long caseObj) {
		this.caseObj = caseObj;
	}

	public Long getPatient() {
		return patient;
	}

	public void setPatient(Long patient) {
		this.patient = patient;
	}

	public double getBtTemperature() {
		return btTemperature;
	}

	public void setBtTemperature(double btTemperature) {
		this.btTemperature = btTemperature;
	}

	public int getBpSystolic() {
		return bpSystolic;
	}

	public void setBpSystolic(int bpSystolic) {
		this.bpSystolic = bpSystolic;
	}

	public int getBpDiastolic() {
		return bpDiastolic;
	}

	public void setBpDiastolic(int bpDiastolic) {
		this.bpDiastolic = bpDiastolic;
	}

	public int getBpMaPressure() {
		return bpMaPressure;
	}

	public void setBpMaPressure(int bpMaPressure) {
		this.bpMaPressure = bpMaPressure;
	}

	public int getBpPulse() {
		return bpPulse;
	}

	public void setBpPulse(int bpPulse) {
		this.bpPulse = bpPulse;
	}

	public int getPomOxygenLevel() {
		return pomOxygenLevel;
	}

	public void setPomOxygenLevel(int pomOxygenLevel) {
		this.pomOxygenLevel = pomOxygenLevel;
	}

	public int getPomPulse() {
		return pomPulse;
	}

	public void setPomPulse(int pomPulse) {
		this.pomPulse = pomPulse;
	}

	public int getBgGlucoseLevel() {
		return bgGlucoseLevel;
	}

	public void setBgGlucoseLevel(int bgGlucoseLevel) {
		this.bgGlucoseLevel = bgGlucoseLevel;
	}

	public int getBgPostGlucoseLevel() {
		return bgPostGlucoseLevel;
	}

	public void setBgPostGlucoseLevel(int bgPostGlucoseLevel) {
		this.bgPostGlucoseLevel = bgPostGlucoseLevel;
	}

	public int getFbHeartRates() {
		return fbHeartRates;
	}

	public void setFbHeartRates(int fbHeartRates) {
		this.fbHeartRates = fbHeartRates;
	}

	public int getFbSteps() {
		return fbSteps;
	}

	public void setFbSteps(int fbSteps) {
		this.fbSteps = fbSteps;
	}

	public int getFbCalories() {
		return fbCalories;
	}

	public void setFbCalories(int fbCalories) {
		this.fbCalories = fbCalories;
	}

	public double getWmWeight() {
		return wmWeight;
	}

	public void setWmWeight(double wmWeight) {
		this.wmWeight = wmWeight;
	}

	public String getOtherData() {
		return otherData;
	}

	public void setOtherData(String otherData) {
		this.otherData = otherData;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "HealthData [healthId=" + healthId + ", caseObj=" + caseObj + ", patient=" + patient + ", btTemperature="
				+ btTemperature + ", bpSystolic=" + bpSystolic + ", bpDiastolic=" + bpDiastolic + ", bpMaPressure="
				+ bpMaPressure + ", bpPulse=" + bpPulse + ", pomOxygenLevel=" + pomOxygenLevel + ", pomPulse="
				+ pomPulse + ", bgGlucoseLevel=" + bgGlucoseLevel + ", bgPostGlucoseLevel=" + bgPostGlucoseLevel
				+ ", fbHeartRates=" + fbHeartRates + ", fbSteps=" + fbSteps + ", fbCalories=" + fbCalories
				+ ", wmWeight=" + wmWeight + ", otherData=" + otherData + ", type=" + type + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

    // Getters and Setters

    
}
