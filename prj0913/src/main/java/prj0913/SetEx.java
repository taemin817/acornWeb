package prj0913;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<String>();
		// 순서로 꺼낼 수 없고 중복허용 하지않음
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}
