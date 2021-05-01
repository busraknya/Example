package workTwo;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# + Angular","Engin Demiro�","2 ay s�recek yaz�l�m geli�tirici...",32);
		

		Course course2 = new Course(2,"Java + React","Engin Demiro�","2 ay s�recek yaz�l�m geli�tirici...",12);
		Course[] courses = {course1,course2};
		
		
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Programlama";
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.chooseInstructor(course1);
		courseManager.chooseInstructor(course2);
	}

}
