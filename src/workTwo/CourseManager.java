package workTwo;

public class CourseManager {

	public void addToCourse(Course course) {
		System.out.println("Kursa katýldýnýz. "+course.courseName);
	}
	
	public void chooseInstructor(Course course) {
		System.out.println(course.instructorName+" hocanýn kursuna katýldýnýz.");
	}

}
