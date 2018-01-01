package com.jigyasa.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; // get path of application context

import com.jigyasa.model.*;
import com.jigyasa.dao.*;
public class TestStudentSpring {
	
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		ApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		StudentDAO studDAO = (StudentDAO)c.getBean("studentDAO");
		
		Student studentObj = (Student)c.getBean("stud"); // stud bean reference it is used to get reference of Student object and then reference is typecasted to object of student dao
		//now inserting the name in the student object using setter
		studentObj.setName("shashank");
		//now inserting the value in the studnet table using the DAO method setEmployee
		int status = studDAO.setStudent(studentObj);
		System.out.println("The status is "+status);
		
	}

}
