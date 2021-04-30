package kodlamaIoOop;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		Student student = new Student();
		student.setFirstName("Hakan");
		student.setLastName("Co�kun");
		student.setStudentNumber("12345678910");
		StudentManager studentManager = new StudentManager();
		studentManager.signUp(student);
		studentManager.signIn(student);
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		userManager.signIn(instructor);
		InstructorManager instructorManager = new InstructorManager();
		
		
		Course course1 = new Course(1,"Yaz�l�mc� Yeti�tirme Kamp� | Java ve React ");
		Course course2 = new Course(2,"Yaz�l�mc� Yeti�tirme Kamp� | C# ");
		Course course3 = new Course(3,"Yaz�l�mc� Yeti�tirme Kamp� | Python");
		
		Course[] courses = {course1,course2,course1};
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(courses);
		
		instructorManager.openCourse(course2);
		
		studentManager.joinCourse(student, course2);
		
	}

}
