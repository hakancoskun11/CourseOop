package kodlamaIoOop;

public class InstructorManager extends UserManager {
	public void openCourse(Course course) {
		System.out.println(course.getName() + " kursu olu�turuldu");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.getName() + " kursu silindi");
	}
	
	
}
