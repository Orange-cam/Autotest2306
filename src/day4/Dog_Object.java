package day4;

public class Dog_Object {

	static String breed;
	static String size;
	static double age;
	static String color;
	
	public static void getInformation()
	{
		System.out.println("Breed is: "+breed + ", Size is: "+ size + ", Age is: "+ age + ", Color is: " + color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog_Object dog1 = new Dog_Object();
		dog1.breed = "Beggie";
		dog1.size = "big";
		dog1.age = 2.5;
		dog1.color = "black";
		getInformation();
		
		Dog_Object dog2 = new Dog_Object();
		dog2.breed = "Fox";
		dog2.size = "small";
		dog2.age = 3;
		dog2.color = "white";
		getInformation();

	}

}
