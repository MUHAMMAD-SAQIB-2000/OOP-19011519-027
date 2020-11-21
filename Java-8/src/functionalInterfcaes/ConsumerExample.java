package functionalInterfcaes;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

public class ConsumerExample {
	
	static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
	static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities()); 
	static Consumer<Student> c2 = (s) -> System.out.println(s.getName());
	public static void printName() {
		List<Student> s = StudentDataBase.getAllStudents();
		s.forEach(c2);
	}
	
	public static void printNameAndActivities() {
		List<Student> s = StudentDataBase.getAllStudents();
		s.forEach(c3.andThen(c4));
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		List<Student> s = StudentDataBase.getAllStudents();
		s.forEach((student) -> {
			if(student.getGradeLevel()>=3 && student.getGpa()>3.5) {
				c3.andThen(c4).andThen(c2).accept(student);
			}
		});
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("Hello Dear");
		printName();
		System.out.println();
		printNameAndActivities();
		System.out.println();
		printNameAndActivitiesUsingCondition();
	}
	
}
