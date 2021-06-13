package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cts.model.DoctorSearch;
import com.cts.service.DoctorRegistrationService;
import com.cts.service.SearchService;

@Controller
@SessionAttributes({"addclinic","userid"})
public class SearchFacility {

	
	@Autowired
	SearchService ss;
	
	@Autowired
	DoctorRegistrationService drs;
	
	@RequestMapping("/searchfacility")
	public String Search() {
		return "searchfacility";
	}
		
		
		@RequestMapping("/appointmentfacility")
		public String Appointment() {
			
			return "appofacility";
}
		@RequestMapping("/bookappointment1")
		public String BookAppointment() {
			
			return "appo1";
		}
		
		
		/*@RequestMapping(value="/appoint1",method=RequestMethod.POST)
		public ModelAndView Approve1(@RequestParam String Doctor,ModelMap model) {
			List<DoctorSearch> list = ss.displayDoctorAppo(Doctor);
			model.put("Doctor",Doctor);
			ModelAndView mv=new ModelAndView();
			/*for(DoctorSearch in:list) {
				 System.out.println(in.getDoctorFirstName());
				 System.out.println(in.getDoctorLastName());
				 }*/
		/*	mv.addObject("list",list);
			mv.setViewName("appo1");
			return mv;
		}*/
	}


	

