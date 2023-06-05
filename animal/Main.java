package animal;

abstract class Animal{
	String name;
	int age;
	abstract void makeSound();
}
class Dog extends Animal{
	public Dog(String name , int age) {
		super.name = name;
		super.age = age;
		}
	@Override
	void makeSound() {
		System.out.println("woof!");
	}
}

class Cat extends Animal{
	public Cat(String name , int age) {
		super.name = name;
		super.age = age;
		}
	@Override
	void makeSound() {
		System.out.println("meow!");
	}
}
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("dog",10);
		Cat cat = new Cat("cat",7);
		
		dog.makeSound();
		cat.makeSound();
	}

}
