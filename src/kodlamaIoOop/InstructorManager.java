package kodlamaIoOop;

public class InstructorManager extends UserManager {
	public void openCourse(Course course) {
		System.out.println(course.getName() + " kursu oluşturuldu");
	}
	
	public void deleteCourse(Course course) {
		System.out.println(course.getName() + " kursu silindi");
	}
	
	
}
