package prj0831;

public class constructor {
	String nm;
	int since;
	String d1;
	String d2;
	int champions;
	
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public int getSince() {
		return since;
	}
	public void setSince(int since) {
		this.since = since;
	}
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public int getChampions() {
		return champions;
	}
	public void setChampions(int champions) {
		this.champions = champions;
	}
	public constructor(String nm, int since, String d1, String d2, int champions) {
		super();
		this.nm = nm;
		this.since = since;
		this.d1 = d1;
		this.d2 = d2;
		this.champions = champions;
	}
	
	public constructor() {
	}
	@Override
	public String toString() {
		return "constructor [nm=" + nm + ", since=" + since + ", d1=" + d1 + ", d2=" + d2 + ", champions=" + champions + "]<br>";
	}
	
	
	
}
