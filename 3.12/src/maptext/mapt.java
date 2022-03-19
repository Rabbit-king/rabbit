package maptext;

import java.util.HashMap;
import java.util.Map;

public class mapt {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<>();
	
	m.put(1,"abc");
	m.put(2, "bbb");
	m.put(5, "hub");
	m.get(2);
	System.out.println(m.get(5));
}
}
