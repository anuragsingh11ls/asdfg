package com.anu.usermanagement.serviceimpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anu.usermanagement.bean.StudentPhoneBean;
import com.anu.usermanagement.core.dao.PhoneDao;
import com.anu.usermanagement.core.dao.StudentDao;
import com.anu.usermanagement.core.entitys.Phone;
import com.anu.usermanagement.core.entitys.Student;
import com.anu.usermanagement.service.StudentPhoneService;

@Service("studentPhoneService")
@Transactional
public class StudentPhoneServiceImpl implements StudentPhoneService{

	@Autowired
	private StudentDao studentDao;

	@Autowired
	private PhoneDao phoneDao;

	public void saveStudentPhone(StudentPhoneBean studentPhoneBean) {
		Phone phone=new Phone();
		Student student=new Student();
		phone.setPhoneNumber(studentPhoneBean.getPhoneNumber());
		phone.setPhoneType(studentPhoneBean.getPhoneType());
		student.setStudentName(studentPhoneBean.getStudentName());
		//student.setStudentPhoneNumbers(studentPhoneBean.getPhoneNumber());
		Set<Phone> phoneNumbers = new HashSet<Phone>();
		student.setStudentPhoneNumbers(phoneNumbers);
		phoneNumbers.add(phone);
		phoneDao.savePhone(phone);
		studentDao.saveStudent(student);

	}

}
