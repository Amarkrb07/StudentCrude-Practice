package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student;
import com.tka.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/savedata")
	public String insertData( @RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}
	
	@DeleteMapping("/deletedata/{sid}")
	public String deleteData(@PathVariable int sid) {
		String msg = service.deleteData(sid);
		return msg;
	}
	
	@PutMapping("/updatedata/{sid}")
	public String updateData(@RequestBody Student s, @PathVariable int sid) {
		String msg = service.updateData(s, sid);
		return msg;
	}
	
}
