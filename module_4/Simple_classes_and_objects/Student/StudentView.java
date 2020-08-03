package by.jonline.simple_class.main;

public class StudentView {

	// Вывод списка студентов
	public void viewStudentList(Student[] students) {
		System.out.println("Students: ");

		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	// Вывод отличников
	public void viewExcelentStudents(Student[] students) {
		System.out.println("Excelent students: ");

		StudentService studentService = new StudentService();
		final int minExcelentMark = 9;

		for (Student student : students) {
			if (studentService.isExcelent(student, minExcelentMark)) {
				System.out.println(student.toString());
			}
		}
	}

}
