package jsondriver;

public class DriverMember {

	String name;
	int num;
	String team;
	String nationality;
	int wins;
	int champ;
	String most_wins_circuit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getChamp() {
		return champ;
	}
	public void setChamp(int champ) {
		this.champ = champ;
	}
	public String getMost_wins_circuit() {
		return most_wins_circuit;
	}
	public void setMost_wins_circuit(String most_wins_circuit) {
		this.most_wins_circuit = most_wins_circuit;
	}
	
	public DriverMember() {
	}
	
	@Override
	public String toString() {
		return "driver [name=" + name + ", num=" + num + ", team=" + team + ", nationality=" + nationality + ", wins="
				+ wins + ", champ=" + champ + ", most_wins_circuit=" + most_wins_circuit + "]";
	}
	
	public DriverMember(String name, int num, String team, String nationality, int wins, int champ,
			String most_wins_circuit) {
		super();
		this.name = name;
		this.num = num;
		this.team = team;
		this.nationality = nationality;
		this.wins = wins;
		this.champ = champ;
		this.most_wins_circuit = most_wins_circuit;
	}
	
	
}
