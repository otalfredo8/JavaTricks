
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class j20_Set {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(23);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(10);

		for (int element: hashSet) {
			System.out.println(element + " ");
		}

//		hashSet.isEmpty();      // returns true, if Set is empty
//		hashSet.contains(10);   // returns true, if the element is found
//		hashSet.remove(23);  // returns true, if the element was deleted
//		hashSet.clear();        // Deletes all element

		System.out.println();

		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(23);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(10);
		treeSet.add(1);

		for (int element: treeSet) {
			System.out.println(element + " ");
		}
	}
}

/*
 *  Set: Interface
 *  HashSet:
 * 		1. Unordered Collection
 *      2. Cannot store duplicate elements
 * 		3. Faster
 *  TreeSet:
 *		1. Ordered Collection (a-z, and 0-9)
 *      2. Cannot store duplicate elements
 * */
