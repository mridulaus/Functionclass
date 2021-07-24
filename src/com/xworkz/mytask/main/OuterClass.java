package com.xworkz.mytask.main;

public class OuterClass {
	String  name = "Mridula";
	
	class InnerClass{ // it can be private but it cant be accesed my main method
		
		String lastName = "Shetty";
		
		void coding() {
			System.out.println("she  knows java and sql");
		}
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass  fullName = outer.new InnerClass();
		System.out.println(outer.name + "  " + fullName.lastName);
		
		fullName.coding();
				

	}

}
