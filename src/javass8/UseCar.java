package javass8;

import java.util.ArrayList;

public class UseCar {

	public static void main(String[] args) {

		
		Car c1=new Car();
		c1.brand="bmw";
		c1.price=4566;
		c1.model=6765;
		c1.color="red";
		
		
		Car c2=new Car();
		c1.brand="jaguwar";
		c1.price=2566;
		c1.model=65;
		c1.color="black";
		
		
		
		Car c4=new Car();
		c1.brand="audi";
		c1.price=416;
		c1.model=2020;
		c1.color="white";
		
		Car c5=new Car();
		c1.brand="maruthi";
		c1.price=4566;
		c1.model=6765;
		c1.color="red";
		
		ArrayList<Car>cars=new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c4);
		cars.add(c5);
		
		System.out.println(Car.findprice(cars).getBrand());
		
		
		
		
		
		
		
		
		
	}

}
