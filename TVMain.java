package session9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class HDTV {
	String brandname;
	int size;

	public HDTV(String brandname, int size) {
		// TODO Auto-generated constructor stub
		this.brandname = brandname;
		this.size = size;
	}

	public String toString() {
		return brandname + " " + size;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}

class SortBySize implements Comparator<HDTV> {
	public int compare(HDTV a, HDTV b) {
		return a.size - b.size;
	}
}

class HDTVList {
	ArrayList<HDTV> TVs;

	public HDTVList(ArrayList<HDTV> TVs) {
		// TODO Auto-generated constructor stub
		this.TVs = TVs;
	}

	void displayTVs() {
		System.out.println(TVs.toString());
	}

	void sortComparator() {
		Collections.sort(TVs, new SortBySize());
	}
}

public class TVMain {

	public static void main(String[] args) {
		ArrayList<HDTV> TVs = new ArrayList<HDTV>();
		HDTV TV;

		TV = new HDTV("Samsung", 55);
		TVs.add(TV);
		TV = new HDTV("LG", 65);
		TVs.add(TV);
		TV = new HDTV("Sony", 50);
		TVs.add(TV);

		HDTVList TVList = new HDTVList(TVs);

		TVList.displayTVs();
		TVList.sortComparator();
		TVList.displayTVs();

	}

}
