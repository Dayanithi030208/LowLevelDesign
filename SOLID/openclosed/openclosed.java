package com.lowleveldesign.practice;

public class ShapeCalculator {
	public static void main(String[] args) {
		Shape circle=new Circle(3);
		Shape rectangle=new Rectangle(6,7);
		Shape square=new Square(5);
		System.out.println(circle.calculateArea());
	}
}
interface Shape{
	double calculateArea();
}
class Circle implements Shape{
	private double radious;
	public Circle(double radious) {
		this.radious=radious;
	}
	public double calculateArea() {
		double pi=3.14;
		return pi*radious*radious;
	}
}
class Rectangle implements Shape{
	private int length;
	private int  width;
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public double calculateArea() {
		return length*width;
	}
}
class Square implements Shape{
	private int side;
	public Square(int side) {
		this.side=side;
	}
	public double calculateArea() {
		return side*side;
	}
}
