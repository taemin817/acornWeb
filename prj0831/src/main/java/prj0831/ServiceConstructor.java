package prj0831;

import java.util.ArrayList;

public class ServiceConstructor {

	public ArrayList<constructor> getinfo(){
		ArrayList<constructor> cons = new ArrayList<>();
		//String nm, int since, String d1, String d2, int champions
		cons.add(new constructor("맥라렌", 1963, "랜도 노리스", "오스카 피아스트리", 8));
		cons.add(new constructor("페라리", 1929, "샤를 르끌레", "카를로스 사인츠 주니어", 16));
		cons.add(new constructor("메르세데스", 2010, "루이스 해밀턴", "조지 러셀", 8));
		cons.add(new constructor("레드불", 2005, "맥스 베르스타펜", "세르히오 페레즈", 5));
		
		return cons;
	}
}
