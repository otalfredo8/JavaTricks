public class j22_AbstractKeyword {

	public static void main(String[] args) {

//		Animal1 animal0 = new Animal1();	// Not Allowed to create instance of abstract class.

		Animal1 animal0;  					// Allowed to create reference of abstract class.

		Animal1 animal1 = new Dog1();  		// Parent class reference --> Child class object
		animal1.eat();
		animal1.run();
	}
}

abstract class Animal1 {

	public void run() {
		System.out.println("Animal is running");
	}

	abstract public void eat();

}

class Dog1 extends Animal1 {

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}

/*
 *   Rules for abstract keyword:
 *       1. abstract class:
 *           * Cannot be instantiated
 *           * May or may not contain abstract methods
 *
 *       2. abstract method:
 *           * doesn't contain implementation. You cannot write code in abstract method.
 *           * MUST override the abstract method in child class.
 * */
