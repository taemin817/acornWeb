package jsondriver;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class DriverService {
	
	DriverDAO  dao = new DriverDAO();
	
	public JSONArray getDriverList() {
		
		ArrayList<DriverMember> list = dao.getDriverList();
		
		JSONArray arr = new JSONArray()	;
		
		for(int i=0; i<list.size();i++) {
			DriverMember d = list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", d.getName());
			o.put("num", d.getNum());
			o.put("team", d.getTeam());
			o.put("nationality", d.getNationality());
			o.put("wins", d.getWins());
			o.put("champ", d.getChamp());
			o.put("most_wins_circuit", d.getMost_wins_circuit());
			arr.put(o);
		}
		return arr;
		
	}
}
