package InheritancePractice;

public class Animals extends InheritancePractice{
	
	public int age;
	public String animalName;
	public int legs;
	public boolean living;
	public boolean vertebrate;
	//these are so that the other classes can see it/use it and be defined in here
	
	public void output(horses myHorse) {
		System.out.println(myHorse.animalName + " is " + myHorse.age + " years old and has shoe size " + myHorse.shoeSize);
	}
	public void Bark(dogs dog) {
		//System.out.println(dogs.bark);
	}
	
	public void output(cats myCat) {
		System.out.println(myCat.meow + "True or false: I have claws " + myCat.claws);
	}
}
