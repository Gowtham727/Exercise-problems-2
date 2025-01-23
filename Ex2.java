package exercisee_problems2;
class Computer{
	private String brand;
	private String model;
	private int price;
	void display(String brand,String model,int price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Ex2 {

	public static void main(String[] args) {
		
		Computer computer=new Computer();
		computer.display("Dell","Dell vostro" , 60000);
		System.out.println("the brand is: "+computer.getBrand());
		System.out.println("the model is: "+computer.getModel());
		System.out.println("the price is: "+computer.getPrice());

	}

}
