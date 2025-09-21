package com.lowleveldesign.practice;

public class BirdFeatues {
	public static void main(String[] args) {
		SoundBird sparrow=new Sparrow();
		SoundBird crow=new Crow();
		SoundBird penguin=new Penguin();
		penguin.makesound();
		Penguin penguin2=new Penguin();
		penguin2.fly();
		sparrow.makesound();
		crow.makesound();
		FlyBird sparrow2=new Sparrow();
		sparrow2.fly();
	}
}
abstract class SoundBird{
	abstract void makesound();
}
interface FlyBird{
	void fly();
}
class Sparrow extends SoundBird implements FlyBird{
	public void makesound() {
		System.out.println("chirp chirp");
	}
	public void fly() {
		System.out.println("sparrow is flying");
	}
}
class Crow extends SoundBird implements FlyBird{
	public void makesound() {
		System.out.println("craw craw");
	}
	public void fly() {
		System.out.println("crow is flying");
	}
}
class Penguin extends SoundBird{
	public void makesound() {
		System.out.println("chup chup");
	}
	public void fly() {
		System.out.println("Penguin can't fly");
	}
}
