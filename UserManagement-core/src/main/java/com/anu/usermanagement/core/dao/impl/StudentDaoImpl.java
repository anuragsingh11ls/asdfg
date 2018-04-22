/**
 * 
 */
package com.anu.usermanagement.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.anu.usermanagement.core.dao.StudentDao;
import com.anu.usermanagement.core.entitys.Student;

/**
 * @author Anurag Singh
 *
 */
@Repository("studentDao")
public class StudentDaoImpl extends AbstractDaoImpl<Student, String> implements StudentDao{

	protected StudentDaoImpl() {
		super(Student.class);
		// TODO Auto-generated constructor stub
	}

	public void saveStudent(Student student) {
		saveOrUpdate(student);
		
	}

}
