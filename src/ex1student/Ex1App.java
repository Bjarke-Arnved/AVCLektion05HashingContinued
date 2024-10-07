package ex1student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex1App {
	public static void main(String[] args) {
		Map<String, Customer> map = new HashMap<>();
//        Map<String, Customer> map = new LinkedHashMap<String, Customer>();
//        Map<String, Customer> map = new TreeMap<String, Customer>();

		map.put("11111111", new Customer("11111111", "12121212", "Bob", "Kennedy"));
		map.put("22222222", new Customer("22222222", "23232323", "Alice", "Gordon"));
		map.put("77777777", new Customer("77777777", "78787878", "Burt", "Cassidy"));
		map.put("44444444", new Customer("44444444", "45454545", "John", "Farmer"));
		map.put("88888888", new Customer("88888888", "89898989", "George", "Smith"));

		// TODO
		for(String key : map.keySet()) {
			System.out.println(key);
		};
		System.out.println();
		for(Customer customer : map.values()) {
			System.out.println(customer.toString());
		}
		System.out.println();
	}
}
