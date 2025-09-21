package com.lowleveldesign.practice;
// Student Report
import java.util.Arrays;

// Task is Collect student marks and calculate average and grade and store the report
public class StudentReport {
	public static void main(String[] arges) {
		int[] marks= {91,82,73,64,55};// marks earned by student in subject
		Students s=new Students("Dayanithi",marks);
		Calculate c=new Calculate();
		double average=c.calculateAverage(s);
		char grade=c.calculateGrade(average);
		Report r=new Report();
		r.PrintStudentDetails(s);
		r.PrintMarkDetails(average,grade);
	}
}
class Students{
	private String name;
	public int totalsubjects=5;
	private int[] marks=new int[totalsubjects];
	public String getName() {
		return name;
	}
	public int[] getMarks() {
		return marks;
	}
	public Students(String name,int[] marks) {
		this.name=name;
		this.marks=marks;
	}
}
class Calculate{
	public double average;
	public double calculateAverage(Students s) {
		int[] marktotal=s.getMarks();
		int no_of_subjects=s.totalsubjects;
		int sum=0;
		for(int mark:marktotal) sum+=mark;
		return (double)sum/no_of_subjects;
		
	}
	public char calculateGrade(double avergae) {
		if(average>90) return 'A';
		else if(average>80) return 'B';
		else if(average>70) return 'C';
		else if(average>60) return 'D';
		else return 'E';
	}
}
class Report{
	public void PrintStudentDetails(Students s) {
		System.out.println(s.getName());
		System.out.println(Arrays.toString(s.getMarks()));
	}
	public void PrintMarkDetails(double average,char grade) {
		System.out.println(average+" "+grade);
	}
}
