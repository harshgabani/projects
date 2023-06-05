package product;

class Product{
	String name;
	double price;
	int quantity;
	static int totalSold;
	
	public Product(String name , double price , int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	void sell(int q) {
		if(q<=quantity) {
		quantity = quantity - q;
		totalSold = totalSold + q;
		System.out.println(q+" "+name+"s is sold.");
		}else {
			System.out.println(q+" quantity for "+name+" is not available.");
		}
	}
	static int getTotalSold(){
		return totalSold;
	}
}
public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("apple",50,100);
		Product p2 = new Product("orange",40,50);
		Product p3 = new Product("banana",30,70);
		
		p1.sell(10);
		p2.sell(5);
		p3.sell(15);
		
		System.out.println("total products sold: "+Product.getTotalSold());
	}

}
