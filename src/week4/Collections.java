package week4;

//Imported java utilities to allow the collections to run
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
	
	//String ArrayList 
	//HashMap values
	List<String> employeeNames = new ArrayList<String>();
	employeeNames.add("Joe Swanberg");
	employeeNames.add("Holly Harper");
	employeeNames.add("French Montana");
	employeeNames.add("Thomas Jane");
	employeeNames.add("Bobby Hawk");
	employeeNames.add("Johnny Redcoat");
	employeeNames.add("Johnny Redcoat2");
	
	for(int i=0; i < employeeNames.size(); i+=2) {
		System.out.println("Employee Names: " + employeeNames.get(i));
	}
	
	System.out.println();
	
	//Integer HashSet
	//Soon to be the HashMap Keys
	Set<Integer> ids = new HashSet<Integer>();
	ids.add(1);
	ids.add(2);
	ids.add(3);
	ids.add(4);
	ids.add(5);
	ids.add(6);
	ids.add(7);
	//HashMap to hold the id key and name
	HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
	//Enhanced For Loop to tie the ids to the hashmap keys 
	for(int keys: ids) {
		//keys and employeenames now part of the hashmap
		employeeMap.put(keys, employeeNames.get(keys-1));
	}
	System.out.println("The newly added ids to the newly added employee names!\n" + employeeMap);
	System.out.println("\nPrinting keys alongside their values\n");
	for(int keys: employeeMap.keySet()) {
		//prints keys alongside value
		System.out.println(keys + ": " + employeeMap.get(keys));
	}
	//string builder turning the int keys into a string key for easier printing
	StringBuilder idsBuilder = new StringBuilder();
	for(int id: ids) {
		idsBuilder.append(id + "-");			
	}
	//printing out as toString so turning them into string
	System.out.println("\n" + idsBuilder);
	System.out.println("\n" + idsBuilder.toString());
	//same for the String statements now making them easier to shift into a sentence
	StringBuilder namesBuilder = new StringBuilder();
	for(String names: employeeNames) {
		namesBuilder.append(names + " ");			
	}
	System.out.println("\n" + namesBuilder);
	System.out.println("\n" + namesBuilder.toString());
	}
}
