package kodlamaIoOop;

public class StudentManager extends UserManager {
	public void joinCourse(Student student, Course course) {
		System.out.println(course.getName() + "kursuna katýldýnýz: " + student.getFirstName() + student.getLastName());
	}
	
	public void removeCourse(Course course) {
		System.out.println(course.getName() + "isimli kurs kaldýrýldý");
	}
}
