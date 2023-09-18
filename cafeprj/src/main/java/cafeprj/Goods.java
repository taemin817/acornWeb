package cafeprj;

public class Goods {

	String id;
	String name;
	int price;
	
	//생성자
	public Goods() {
		
	}
	
	public Goods(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Goods(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	//getter setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	// toString
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
	
	
}
