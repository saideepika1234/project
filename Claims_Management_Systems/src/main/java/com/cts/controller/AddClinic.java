package com.cts.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cts.repository.ClinicRegistrationDao;
import com.cts.service.ClinicRegistrationService;
import com.cts.service.UpdateDoctorService;

@Controller
@SessionAttributes("userid")

public class AddClinic {
	
	
	@Autowired
	ClinicRegistrationService clinicRegistrationService;
	
	@Autowired
	UpdateDoctorService updateDoctorService;
	
	  @RequestMapping("/Clinic")
	  public String addClinic() {
		  
		  return "clinic";
		  
	  }

	  @RequestMapping(value="/addClinic1",method=RequestMethod.POST)
		public String clinicRegistration(@RequestParam String ClinicName,String AddressLine1,String AddressLine2, String city,String state,String Zipcode,String Facility1,String contactNumber,String website,String pincode,String clinicID){
			
			int nos = 0;
			
				nos = clinicRegistrationService.ClinicRegistrationDetails(ClinicName,AddressLine1,AddressLine2, city,state,Zipcode,Facility1,contactNumber,website,pincode,clinicID);
				
					return "clinicsuccess1";
				
			
			
	  }
	  @RequestMapping("godoctordash")
	  public String Clinicsuccess1() {
		  
		  return "doctordashboard";
		  
	  }
	  
	  @RequestMapping("/Update")
	  public String updateDetails() {
		  return "updatedoctordetails";
	  }
	  
	  @RequestMapping(value="/updateregister",method=RequestMethod.POST)
		public String updateDoctorDetails(@RequestParam String speciality,String addClinic,String availablity,ModelMap model/*,HttpServletRequest request*/){
			int nos = 0;
			//HttpSession session = request.getSession();
			String id=(String)model.get("userid");
			System.out.println(id);
			
				nos = updateDoctorService.UpdateDoctorRegDetails(speciality,addClinic,availablity,id);
				
					return "updatedoctorsuccess";
				
			
			
	  }
	  
}
