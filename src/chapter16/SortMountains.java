package chapter16;

import java.util.*;

public class SortMountains {
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	
	class NameCompare implements Comparator<Mountain> {
		@Override
		public int compare(Mountain one, Mountain two) {
			return one.name.compareTo(two.name);
		}
		
	}
	
	class HeightCompare implements Comparator<Mountain> {
		@Override
		public int compare(Mountain one, Mountain two) {
			return (two.height - one.height);
		}
		
	}
	
	
	public static void main(String[] args) {
		new SortMountains().go();
	}
	
	public void go() {
		mtn.add(new Mountain("한라산 ", 1950));
		mtn.add(new Mountain("지리산 ", 1915));
		mtn.add(new Mountain("덕유산 ", 1614));
		mtn.add(new Mountain("설악산 ", 1708));
		mtn.add(new Mountain("반야봉 ", 1732));	
		
		System.out.println("as entered:\n" + mtn);
		
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("by name:\n" + mtn);
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("by height:\n" + mtn);
	}
}
