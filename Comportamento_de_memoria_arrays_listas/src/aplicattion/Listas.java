package aplicattion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		
		List<Integer> x = new ArrayList<>();
		x.add(32);
		x.add(12);
		
		x.set(1, 451);
		
		System.out.println(x.get(0));
		
		System.out.println(x.get(1));
		
		List<Integer> y = new LinkedList<>();
		y.add(14);
		y.add(14);
		y.add(18);
		y.add(17);
		y.add(19);
		y.add(2, 16);
		y.remove(Integer.valueOf(18));
		
		for(Integer i: y) {
			System.out.println(i);
		}
	}
}
