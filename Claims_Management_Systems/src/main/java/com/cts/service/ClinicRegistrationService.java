package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.repository.ClinicRegistrationDao;
import com.cts.repository.DoctorRegistrationDao;

@Service
public class ClinicRegistrationService {

	@Autowired
	private ClinicRegistrationDao clinicRegistrationDao;

	public ClinicRegistrationDao getClinicRegistrationDao() {
		return clinicRegistrationDao;
	}

	public void setClinicRegistrationDao(ClinicRegistrationDao clinicRegistrationDao) {
		this.clinicRegistrationDao = clinicRegistrationDao;
	}
	public int ClinicRegistrationDetails(String ClinicName,String AddressLine1,String AddressLine2, String city,String state,String Zipcode,String Facility1,String contactNumber,String website,String pincode,String clinicID){
		return (clinicRegistrationDao.clinicRegistration(ClinicName,AddressLine1,AddressLine2, city,state,Zipcode,Facility1,contactNumber,website,pincode,clinicID));
	}
}
