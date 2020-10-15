package com.abridged.bookmydoctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abridged.bookmydoctor.dao.PatientDAO;
import com.abridged.bookmydoctor.dto.AppointmentInfoBean;
import com.abridged.bookmydoctor.dto.AvailabilityDates;
import com.abridged.bookmydoctor.dto.DoctorInfoBean;
import com.abridged.bookmydoctor.dto.FeedBackInfoBean;
import com.abridged.bookmydoctor.dto.PatientInfoBean;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientDAO patientDao;

	@Override
	public boolean addPatient(PatientInfoBean bean) {

		return patientDao.addPatient(bean);
	}

	@Override
	public boolean addAppointment(AppointmentInfoBean bean) {

		return patientDao.addAppointment(bean);
	}

	@Override
	public boolean patientFeedBack(FeedBackInfoBean bean) {

		return patientDao.patientFeedBack(bean);
	}

	@Override
	public List<DoctorInfoBean> getDoctors(String speciality, String location) {

		return patientDao.getDoctors(speciality, location);
	}

	@Override
	public PatientInfoBean loginPatient(String email, String password) {

		return patientDao.loginPatient(email, password);
	}

	@Override
	public boolean editPatientProfile(PatientInfoBean bean) {

		return patientDao.editPatientProfile(bean);
	}

	@Override
	public List<AppointmentInfoBean> getAppointmentsByPatient(int patientId) {

		return patientDao.getAppointmentsByPatient(patientId);
	}

	@Override
	public AvailabilityDates getAvailabilityDatesOfDoctor(int doctorId) {

		return patientDao.getAvailabilityDatesOfDoctor(doctorId);
	}

	@Override
	public List<FeedBackInfoBean> getFeedBacksOfDoctors(int doctorId) {

		return patientDao.getFeedBacksOfDoctors(doctorId);
	}

	@Override
	public boolean deleteAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		return patientDao.deleteAppointment(appointmentId);
	}

	@Override
	public PatientInfoBean getPatientProfile(int patientId) {

		return patientDao.getPatientProfile(patientId);
	}

}
