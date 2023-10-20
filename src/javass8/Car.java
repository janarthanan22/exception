package javass8;

import java.util.Comparator;
import java.util.List;

public class Car {

	

		static String brand;
		int price;
		int model;
		String color;
		public static String getBrand() {
			return brand;
		}
		public static void setBrand(String brand) {
			Car.brand = brand;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getModel() {
			return model;
		}
		public void setModel(int model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		

		
		public static Car findprice(List<Car>cars) {
			return cars.stream().max(Comparator.comparing(Car::getPrice)).get();
		}
		@Override
		public String toString() {
			return "Car [price=" + price + ", model=" + model + ", color=" + color + ", getPrice()=" + getPrice()
					+ ", getModel()=" + getModel() + ", getColor()=" + getColor() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
		
		
		
	
		
		

}
