package com.lowleveldesign.practice;

public class CompanyEmployee {
	public static void main(String[] args) {
		Working human=new Human();
		Working robot=new Robot();
		Human human2=new Human();
		human.work();
		human2.eat();
		robot.work();
	}
}
interface Working{
	public void work();
}
interface Eating{
	public void eat();
}
class Human implements Working{
	public void work() {
		System.out.println("Human is working");
	}
	public void eat() {
		System.out.println("Human is eating");
	}
}
class Robot implements Working{
	public void work() {
		System.out.println("Robot is working");
	}
}
