package kodlamaIoOop;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.getName() + "eklendi");
	}
	public void add(Course[] courses) {
		for(Course course: courses) {
			add(course);	
	}
		
}
	public void update(Course course) {
		System.out.println(course.getName() + "güncellendi");
	}
	
	public void delete(Course course) {
		System.out.println(course.getName() + "silindi");
	}

}
