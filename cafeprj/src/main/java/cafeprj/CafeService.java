package cafeprj;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class CafeService {

	AcornDAO dao = new AcornDAO();
	

	// 전체 정보를 직접입력후 얻어옴
	public JSONArray getGoodsList(){
		ArrayList<Goods>  list = new ArrayList<>();
		list.add(new Goods("c001", "아이스아메리카노",2000));
		list.add(new Goods("c002", "바닐라라떼",2800));
		list.add(new Goods("c003", "카라멜마끼아또",3800));
		
		JSONArray arr = new JSONArray()	;
		for(int i=0; i<list.size();i++) {
			Goods g = list.get(i);
			JSONObject o = new JSONObject();
			o.put("id", g.getId());
			o.put("name", g.getName());
			o.put("price", g.getPrice());
			arr.put(o);
		}
		return arr;
	}
	
	// dao를 통해 얻은 배열을 json에 담아줌
	public JSONArray getGoodsList2(){
		ArrayList<Goods> list = dao.getGoodsList2();
		
		JSONArray arr = new JSONArray()	;
		for(int i=0; i<list.size();i++) {
			Goods g = list.get(i);
			JSONObject o = new JSONObject();
			o.put("id", g.getId());
			o.put("name", g.getName());
			o.put("price", g.getPrice());
			arr.put(o);
		}
		return arr;
	}
	// 단건 정보를 얻어옴
	public Goods getMember(String id) {
		Goods g = dao.selectOne(id);
		return g;
	}
	
	// 정보 수정
	public void modifyMember( Goods g) {
		dao.updateMember(g);
	}
	// 추가
	public void registerMember(String id, String name, int price) {
		dao.insert(id, name, price);
	}
	// 삭제
	public void deleteMember(String id) {
		dao.deleteOne(id);
	}
	
	public static void main(String[] args) {
		CafeService service = new CafeService();
		JSONArray list = service.getGoodsList2();
		System.out.println(list);
		
	}

}
