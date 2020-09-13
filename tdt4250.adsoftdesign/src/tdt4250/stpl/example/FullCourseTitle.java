package tdt4250.stpl.example;

import tdt4250.stpl.Course;
import tdt4250.stpl.StplFactory;

public class FullCourseTitle {
	
	public static void main(String[] args) {
		Course course = StplFactory.eINSTANCE.createCourse();
		
		course.setCode("TDT4250");
		course.setName("Advanced Software Design");
		
		System.out.println(course.getCourse());
	}

}
