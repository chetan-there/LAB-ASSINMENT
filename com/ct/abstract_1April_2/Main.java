package com.ct.abstract_1April_2;

public class Main {

	public static void main(String[] args) {

		Lion lion = new Lion();
		Dog dog = new Dog();

		lion.roam();
		getAnimal(lion);
		dog.roam();
		getAnimal(dog);

	}

	public static void getAnimal(Animal animal) {
		if(animal instanceof Lion) {
			Lion lion = (Lion)animal;// down casting. 
			lion.roar();
		}
		else if(animal instanceof Dog) {
			Dog dog =(Dog)animal;
			dog.bark();
		}
	}
}