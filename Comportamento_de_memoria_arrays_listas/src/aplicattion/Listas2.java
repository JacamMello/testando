package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas2 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("dudu");
		list.add("Luizael");
		list.add("Victor");
		list.add("Tui");
		list.add(2, "jacam");
		list.add("Amora");
		list.add("Artchui");
		list.add("wagner");
		
		System.out.println(list.get(2));
		
		list.remove("wagner");
		
		System.out.println(list.size());
		
		System.out.println("------------------------");
		
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		list.remove("dudu");
		list.removeIf(i -> i.charAt(0) == 'l'|| i.charAt(0)== 'L');
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		//list.removeIf(i -> i.charAt(0) != 'a'&& i.charAt(0)!= 'A');
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A' || x.charAt(0) == 'a').collect(Collectors.toList());
		for(String i : result) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		name = list.stream().filter(x -> x.charAt(0) == 'w').findFirst().orElse(null);
		System.out.println(name);
	}
}
