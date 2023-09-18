package prj0913;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx {
	public static void main(String[] args) {
	
		//	Map	: 키, 값의 형태로 데이터 저장
						//키	값
		HashMap<String, String> map = new HashMap<String, String>();
		HashMap<String, ArrayList<String>> map2 = new HashMap<>();
		
		map.put("key1", "apple");
		map.put("key2", "banana");
		map.put("key3", "mango");

		String result1 = map.get("key1");
		System.out.println(result1);
		String result2 = map.get("key2");
		System.out.println(result2);
		String result3 = map.get("key3");
		System.out.println(result3);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("mango");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("아메리카노");
		list2.add("라떼");
		list2.add("에스프레소");
		
		map2.put("fruit", list);
		map2.put("beverage", list2);
		
		ArrayList<String> resultList1 = map2.get("beverage");
		for(String f : resultList1) {
			System.out.println(f);
		}
	}
}
