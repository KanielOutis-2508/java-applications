public  class HelloWorld{
	public static void main(String[] agrgs){
		
		int num = 50 ;
		String name = "Jack";
		Float deci =9.9999F;
		boolean isFun = false;
		char symbol = '$';
		
		//using println method
		System.out.println("Hello World, This is my First Java Program");
		System.out.println("Learning java is fun");
		
		//using print method 
		System.out.print("The print method should be used to accept input ");
		System.out.print("Another Print Method \n");
		
		//using printf method
		System.out.printf("i bought %d quantity of bread%n",num);
		System.out.printf("My name is %s%n",name);
		System.out.printf("Your balance is %c%.2f million%n", symbol, deci);
		System.out.printf("Is java Fun? %b%n", isFun);
		System.out.printf("Do you Enjoy learning \"java\"%b", is Fun);
	
	}
}
		