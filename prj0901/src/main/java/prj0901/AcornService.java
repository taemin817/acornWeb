package prj0901;

import java.util.ArrayList;

public class AcornService {

	AcornDAO dao = new AcornDAO();
	
	// 3명의 정보를 얻어옴
	public ArrayList<String> getMemList(){
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("곽단야");
		list.add("김민규");
		list.add("김민지");
		return list;
	}
	
	// 전체 정보를 얻어옴
	public ArrayList<String> getMemberRealList(){
		ArrayList<String> list = dao.selectAll();
		return list;
	}

	// 단건 정보를 얻어옴
	public Customer getMember(String id) {
		Customer c = dao.selectOne(id);
		return c;
	}
	
	// 등록방법1
	public void registerMember(Customer c) {
		dao.insertMember3(c);
	}
	
	// 등록방법2
	public String insertMember2(String id, String pw, String name) {
		dao.insertMember2(id, pw, name);
		return id+", "+pw+", "+name;
	}
	
	// 삭제
	public void deleteMember(String id) {
		dao.deleteOne(id);
	}
	
	// 수정
	public void modifyMember( Customer c) {
		dao.updateMember(c);
	}
}
