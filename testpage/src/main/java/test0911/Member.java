package test0911;

public class Member {
	String id;
	String name;
	String pw;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPw() {
		return pw;
	}

	public Member(String id, String name, String pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", pw=" + pw + "]";
	}
	
	
}
