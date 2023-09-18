package prj0901;

// 고객정보를 담을 수 있는 자료형을 만드는 것 -> class type정의
// class type으로 변수를 만들 때는 반드시 new를 통해 생성되고 변수를 객체라고 부름

public class Customer {
	
	String id;
	String pw;
	String name;

	// 생성자
	public Customer(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public Customer(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public Customer() {
		
	}

	// setter getter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString()
	@Override
	public String toString() {
		return "Customer [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
	
}
