import java.util.*;

class Product {
	public double price;
	private int id;
	private int quantity;
	
	public Product(int id, double price,  int quantity){
		this.price = price;
		this.id = id;
		this.quantity = quantity;
	}
	
	public void incQuantity(int qnt) {
		this.quantity +=qnt;
	}
	
	public void decQuantity(int qnt) {
		this.quantity = Math.max(this.quantity-qnt, 0);
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public String toString(){
		return String.format("%d\t%.2f\t%d",id,price,quantity);
	}
}

class Inventory {
	private List<Product> products;
	
	public Inventory(){
		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product p){
		products.add(p);
	}
	
	public void printInventory(){
		double sum = 0;
		for(Product p : products){
			System.out.println(p.toString());
			sum+=p.price*p.getQuantity();
		}
		System.out.println("Average is: " + sum);
	}
}

public class ProductInventory{
	public static void main(String args[]) {
		Product p1 = new Product(1, 12.60, 4);
		Product p2 = new Product(2, 23, 2);
		Product p3 = new Product(3, 9.99, 2);
		
		Inventory inv = new Inventory();
		inv.addProduct(p1);
		inv.addProduct(p2);
		inv.addProduct(p3);
		
		p1.decQuantity(1);
		p2.incQuantity(2);
		
		inv.printInventory();
	}
}