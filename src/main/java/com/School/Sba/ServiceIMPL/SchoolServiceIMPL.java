package com.School.Sba.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.School.Sba.Entity.School;
import com.School.Sba.Repository.SchoolRepository;
import com.School.Sba.Service.SchoolService;

@Service
public class SchoolServiceIMPL implements SchoolService{
	@Autowired
	private SchoolRepository sr;
	School s=new School();
	@Override
	public String saveSchool(int schoolId,String schoolName,String emailId,Long contactNo,String address) {
		
		s.setSchoolId(schoolId);
		s.setSchoolName(schoolName);
		s.setAddress(address);
		s.setContactNo(contactNo);
		s.setEmailId(emailId);
		sr.save(s);
		return "Data inserted sucessfully";
	}
	public String delete(int schoolId) {
		sr.deleteById(schoolId);
		return "deleted sucessfully";
	}
}
