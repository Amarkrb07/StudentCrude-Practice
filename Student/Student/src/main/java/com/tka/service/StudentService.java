package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}
	
	
	public String deleteData(int sid) {
		String msg = dao.deleteData(sid);
		return msg;
	}
	
	// update data
	public String updateData(Student s, int sid) {
		String msg = dao.updatData(s, sid);
		return msg;
		
	}

}
