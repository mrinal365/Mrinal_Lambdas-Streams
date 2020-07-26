package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Two {
	public static void main(String args[]) {
        List<String> list1 = new ArrayList<String>();

        list1.add("isha");
        list1.add("Amisha");
        list1.add("sharue");
        list1.add("sarukh");

        list1=search(list1);

        for(String i:list1) {
            System.out.println(i);
        }
    }
    static List<String> search(List<String> l1) {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }

}
