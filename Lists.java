import java.util.ArrayList; // Better for storing and accessing data
import java.util.LinkedList; // Better for manipulating data, each element contains a link (memory address) for the next element
import java.util.HashMap; // Stores the data as KEY <-> VALUE
import java.util.HashSet; // Sets cannot containt duplicate values
import java.util.LinkedHashSet; // To keep the order of adding the elements
import java.util.Collections; // Includes algorithms like: sort, shuffle, min, max, reverse
import java.util.Iterator; // Lets you create the iterators

public class Lists {
    public static void main(String[] args){

        // ARRAY LIST
        // Specified size and type (needs to be the class type - Integer, String, Double etc.)
        ArrayList<Integer> numbers = new ArrayList<Integer>(5); 

        System.out.println("Array \"numbers\" is empty: " + numbers.isEmpty());
        for(int i = 0; i < 5; i++) numbers.add(i * 10);
        numbers.remove(4);
        System.out.println("Array does contain 50: " + numbers.contains(50));
        System.out.println(numbers.get(2));
        Collections.shuffle(numbers); // Use of Collections
        System.out.println(numbers);
        numbers.clear();

        // LINKED LIST better for lot of insertions and deletions
        LinkedList<Integer> nums = new LinkedList<Integer>();
        for(int i = 0; i < 100; i++) nums.add(i * 10 - i * 3);
        for(int i = 0; i < nums.size(); i += 3) nums.remove(i); 

        // HASH MAP
        HashMap<String, Integer> age = new HashMap<String, Integer>(3);
        age.put("Kris", 24);
        age.put("Jacob", 27);
        age.put("Thomas", 35);
        System.out.println(age.get("Kris"));

        // SET
        HashSet<Character> set = new HashSet<Character>();
        set.add('b'); set.add('c'); set.add('a');
        System.out.println(set); // a, b, c

        LinkedHashSet<Character> set_2 = new LinkedHashSet<Character>();
        set_2.add('b'); set_2.add('c'); set_2.add('a');
        System.out.println(set_2); // b, c, a

        // ITERATOR
        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()) System.out.print(it.next() + " ");
    }
}
