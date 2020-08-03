package by.jonline.simple_class.main;

import java.util.Arrays;

public class Student {

	private String name;
	private int groupNumber;
	private final int MARKS_COUNT = 5;
	private int[] academicPerformance = new int[MARKS_COUNT];

	public Student(String name, int groupNumber, int[] academicPerformance) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.academicPerformance = academicPerformance;
	}

	public Student() {
		name = "default";
		groupNumber = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	@Override
	public String toString() {
		return "Student's name = " + name + ", group number = " + groupNumber + ", number of ratings = " + MARKS_COUNT
				+ ", academic performance = " + Arrays.toString(academicPerformance);
	}

}
