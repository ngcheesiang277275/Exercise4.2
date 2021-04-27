import java.util.Scanner;

//Parent class Fruit
class Fruit {
	//only accessible in the class Fruit but can be accessed in other class by accessor
	private String name;
	
	Scanner s = new Scanner(System.in);
	
	//parameterized constructor
	public Fruit(String name) {
			this.name = name;
			System.out.println("Fruit constructor is invoked");
			
	}
		
	//accessor
	public String getName() {
		return this.name;
	}
}


//Subclass of Fruit
class Watermelon extends Fruit {
	String colour;
	int stock;
	double weight;
	
	//parameterized constructor
	public Watermelon(String name, String colour, int stock) {
		super(name);
		this.colour = colour;
		System.out.println("Watermelon constructor is invoked");
	}
	
	//method
	public void calculatePrice(double pricePerKg) {
		
		System.out.printf("%-20s: ", "Enter Weight(kg)");
		weight = s.nextDouble();
		
		double finalPrice = weight * pricePerKg;
		System.out.printf("%-20s: RM%.2f%n", ">>>Total price", finalPrice);
	}
}

//Subclass of Fruit
class Apple extends Fruit{
	String flavour;
	String type;
	int amount;
	
	//parameterized constructor
	public Apple(String name, String flavour, String type) {
		super(name);
		this.flavour = flavour;
		this.type = type;
		System.out.println("Apple constructor is invoked");

	}
	
	//method
	public void purchase(double price) {
		System.out.println("-----BUY 5 OR MORE FOR 20% DISCOUNT-----");
		System.out.printf("%-20s: ", "Enter amount");
		amount = s.nextInt();
		
		double priceApple = amount * price;
		System.out.printf("%-20s: RM%.2f%n", ">>>Total price", priceApple);	
		
		if(amount >= 5) {
			double discountPriceApple = priceApple * 0.90;
			System.out.printf("%-20s: RM%.2f%n", ">>>Final price", discountPriceApple);	

		}else {
			double discountPriceApple = priceApple * 0.90;
			System.out.printf("%-20s: RM%.2f%n", ">>>Final price", priceApple);	


		}
	}
}

//Subclass of Apple
class RedApple extends Apple{
	String colour;
	double price;
	
	//parameterized constructor
	public RedApple(String name, String flavour,String type, String colour) {
		super(name,flavour,type);
		this.colour = colour;
		this.type = type;
		this.colour = colour;
	}
		
}

//Subclass of Apple
class GreenApple extends Apple{
	String colour;
	double price;
	
	//parameterized constructor
	public GreenApple(String name, String flavour, String type, String colour) {
		super(name,flavour,type);
		this.colour = colour;
		this.type = type;
		this.colour = colour;
	}

}

//Main class
class Main {
	public static void main(String[] args) {
		System.out.println("-----WELCOME TO HAWAIIAN FRUIT SHOP-----");
		Watermelon a = new Watermelon("Watermelon", "Red", 22);
		System.out.printf("%-20s: %s%n", "Fruit", a.getName());
		System.out.printf("%-20s: %s%n", "Colour", a.colour);
		a.calculatePrice(4.50);
		System.out.println("-----------------------------------------");
		
		Apple b = new Apple("Apple", "Sweet", "Red Apple & Green Apple");
		System.out.printf("%-20s: %s%n", "Fruit", b.getName());
		System.out.printf("%-20s: %s%n", "Flavour", b.flavour);
		System.out.printf("%-20s: %s%n", "Type available", b.type);
		System.out.println("");
		System.out.println("-----------------------------------------");

		
		GreenApple c = new GreenApple("Green Apple", "Sour", "Granny Smith" , "Green");
		System.out.printf("%-20s: %s%n", "Fruit", c.getName());
		System.out.printf("%-20s: %s%n", "Flavour", c.flavour);
		System.out.printf("%-20s: %s%n", "Type available", c.type);
		System.out.printf("%-20s: %s%n", "Colour", c.colour);
		System.out.printf("%-20s: RM%.2f%n", "Price per unit", 3.50);
		c.purchase(3.50);
		System.out.println("-----------------------------------------");


		System.out.println("");
		
		RedApple d = new RedApple("Red Apple", "Sweet", "Pink Lady" , "Red");
		System.out.printf("%-20s: %s%n", "Fruit", d.getName());
		System.out.printf("%-20s: %s%n", "Flavour", d.flavour);
		System.out.printf("%-20s: %s%n", "Type available", d.type);
		System.out.printf("%-20s: %s%n", "Colour", d.colour);
		System.out.printf("%-20s: RM%.2f%n", "Price per unit", 4.50);
		d.purchase(4.50);
		System.out.println("-----------------------------------------");
		
	}

}
