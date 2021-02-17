package getValues;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise1 {

	public static void main(String args[]) {
		Map<Integer, String> value = new HashMap<>();
		value.put(1001, "Amit");
		value.put(1003, "Raj");
		value.put(1002, "Sameer");
		value.put(1005, "Kunal");
		value.put(1004, "Priya");

		System.out.println("unsorted value: " + value);

		Set<Integer> ids = value.keySet();
		System.out.println(ids);

	}

}
