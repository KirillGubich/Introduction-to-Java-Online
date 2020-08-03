package by.jonline.simple_class.main;

public class StudentService {

	// Проверка, является ли студент отличником
	public boolean isExcelent(Student stud, int minMark) {

		for (int mark : stud.getAcademicPerformance()) {
			if (mark < minMark) {
				return false;
			}
		}

		return true;
	}

}
