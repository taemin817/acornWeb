package Consprj;
import java.util.ArrayList;

public class ConsService {

	public ArrayList<Member> getinfo(){
		ArrayList<Member> constructor = new ArrayList<>();
		constructor.add(new Member("맥라렌", 1963, "랜도 노리스", "오스카 피아스트리", 8));
		constructor.add(new Member("페라리", 1929, "샤를 르끌레", "카를로스 사인츠 주니어", 16));
		constructor.add(new Member("메르세데스", 2010, "루이스 해밀턴", "조지 러셀", 8));
		constructor.add(new Member("레드불", 2005, "맥스 베르스타펜", "세르히오 페레즈", 5));
		return constructor;
	}
	
	ConDAO dao = new ConDAO();
	
	// 전체 정보를 얻어옴
	public ArrayList<String> getMemberRealList(){
		ArrayList<String> list = dao.selectAll();
		return list;
	}
}
