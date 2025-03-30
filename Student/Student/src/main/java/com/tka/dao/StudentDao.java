package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Student;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory factory;
	
	// save data 
	public String insertData(Student s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.persist(s);
		tr.commit();
		ss.close();
		return "Data is inserted....!";
	}
	
	// delete data
	public String deleteData(int sid) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Student s = ss.get(Student.class, sid);
		
		ss.remove(s);
		
		tr.commit();
		ss.close();
		
		return "data is deleted...!";
		
	}
	
	public String updatData(Student s, int sid) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Student s1 = ss.get(Student.class, sid);
		s1.setName(s.getName());
		s1.setCourse(s.getCourse());
		s1.setCity(s.getCity());
		
		ss.merge(s1);
		tr.commit();
		ss.close();
		
		return "data is updated..!";
	}

	
}
