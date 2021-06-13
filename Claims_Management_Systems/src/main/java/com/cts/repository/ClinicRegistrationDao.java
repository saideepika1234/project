package com.cts.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClinicRegistrationDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int clinicRegistration(String ClinicName,String AddressLine1,String AddressLine2, String city,String state,String Zipcode,String Facility1,String contactNumber,String website,String pincode,String clinicID){
		String sql = "insert into addclinic(clinicname,addressline1,addressline2,city,state,zipcode,facilities,contactnumber,website,locality,clinicid) values(?,?,?,?,?,?,?,?,?,?,?)";
		int row = jdbcTemplate.update(sql, new Object[] {ClinicName,AddressLine1,AddressLine2, city,state,Zipcode,Facility1,contactNumber,website,pincode,clinicID});
		return row;
	}
}
