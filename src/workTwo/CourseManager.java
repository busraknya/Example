package workTwo;

public class CourseManager {

	public void addToCourse(Course course) {
		System.out.println("Kursa kat�ld�n�z. "+course.courseName);
	}
	
	public void chooseInstructor(Course course) {
		System.out.println(course.instructorName+" hocan�n kursuna kat�ld�n�z.");
	}

}
