package test;

public class CafeMenu {
	String code;
	String name;
	int price;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CafeMenu [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	public CafeMenu(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	public CafeMenu() {
		// TODO Auto-generated constructor stub
	}
}
