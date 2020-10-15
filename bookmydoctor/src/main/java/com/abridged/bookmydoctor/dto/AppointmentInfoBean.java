package com.abridged.bookmydoctor.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Entity
@Table(name = "appointment_info")
@JsonRootName("AppointmentInfoBean")
@JsonInclude(content=Include.NON_NULL)
public class AppointmentInfoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="aid")
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;

	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	@JsonIgnoreProperties("appointment")
	@NotNull
	private DoctorInfoBean doctor = new DoctorInfoBean();

	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	@JsonIgnoreProperties("appointment")
	@NotNull
	
	private PatientInfoBean patient = new PatientInfoBean();

	@Column(name = "appointment_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@JsonProperty
	@Type(type = "date")
	private Date appointmentDate;

	@Column(name = "patient_name")
	@JsonProperty
	
	private String patientName = patient.getPatientName();

	@Column(name = "patient_mobileNo")
	@JsonProperty
	@NotNull
	private long mobileNo = patient.getMobileNo();

	@Column(name = "doctor_name")
	@JsonProperty
	private String doctorName = doctor.getDoctorName();

	@Column(name = "doctor_speciality")
	@JsonProperty
	private String speciality = doctor.getSpeciality();

	@Column(name = "hospital_name")
	@JsonProperty
	private String hospitalName = doctor.getHospitalName();

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public DoctorInfoBean getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorInfoBean doctor) {
		this.doctor = doctor;
	}

	public PatientInfoBean getPatient() {
		return patient;
	}

	public void setPatient(PatientInfoBean patient) {
		this.patient = patient;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	
}
