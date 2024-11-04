package InheritancePractice;

public class InheritancePractice {

	public static void main(String[] args) {
		//inheritance: allowing for a parent to work with a child
		//using: extends 
		
		//Instantiate animal classes
		Animals myAnimals = new Animals();
		dogs myDog = new dogs();
		cats myCat = new cats();
		horses myHorse = new horses();
		
		System.out.println("helloworld");
		
		System.out.println(myHorse.shoeSize);
		System.out.println(myCat.meow + " True or false: I have claws: " + myCat.claws); 
	
	}

}

//make a new set of inheritance thing of our own 
//thats hw
//finish to do list
