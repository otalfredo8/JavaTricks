public class j23_Interface {

	public static void main(String[] args) {

//		new Animal(); // Not Allowed.
		Animal animal = new Dog();
		animal.eat();
		animal.run();
	}
}

interface Animal {

	public static final float pi = 3.14f;

	abstract void run();

	abstract public void eat();
	void has();

}

class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("Dog is running");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	public void has() {
		System.out.println("Dog has");
	}
}

/*
 *   Rules of Interface
 *       * Cannot create an object because it's only a blueprint of a class.
 *       * Can contain abstract, default, and static methods, all public.
 *		 * Methods don't contain
 *
 *       2. For Variables
 *           * Avoid using field variables
 *           * But they are public, static and final
 * */
