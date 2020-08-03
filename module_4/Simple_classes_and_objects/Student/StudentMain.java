package by.jonline.simple_class.main;

/*
    Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
    успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
    Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.  
*/

public class StudentMain {

	public static void main(String[] args) {

		int studentCount = 10;
		Student[] studentList = new Student[studentCount];

		studentList[0] = new Student("Ivanov I.I.", 851050, new int[] { 8, 9, 6, 8, 10 });
		studentList[1] = new Student("Petrov P.P.", 951001, new int[] { 9, 6, 7, 7, 8 });
		studentList[2] = new Student("Smirnov S.S.", 851052, new int[] { 9, 9, 9, 10, 9 });
		studentList[3] = new Student("Sidorov S.I.", 951008, new int[] { 9, 10, 10, 9, 9 });
		studentList[4] = new Student("Korolev K.V.", 851059, new int[] { 8, 8, 9, 9, 8 });
		studentList[5] = new Student("Sokolov D.E.", 951003, new int[] { 6, 4, 8, 7, 5 });
		studentList[6] = new Student("Frolov A.V.", 950501, new int[] { 9, 9, 9, 9, 9 });
		studentList[7] = new Student("Orlov F.A.", 950702, new int[] { 7, 7, 7, 8, 7 });
		studentList[8] = new Student("Bobrov S.L.", 760402, new int[] { 9, 10, 10, 10, 10 });
		studentList[9] = new Student("Komarov S.M.", 950504, new int[] { 7, 8, 8, 9, 8 });

		StudentView studentView = new StudentView();

		studentView.viewStudentList(studentList);
		System.out.println();
		studentView.viewExcelentStudents(studentList);

	}

}
