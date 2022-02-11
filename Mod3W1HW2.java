package HW;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Mod3W1HW2 {

	public static void main(String[] args) {

			ArrayList<String> toys = new ArrayList<String>();
			toys.add("Cars");
			toys.add("Puzzles");
			toys.add("Dolls");
			toys.add("Coloring Books");
			toys.add("Magnet Tiles");
			toys.add("Legos");

			System.out.println(toys);


// Write a Java program to copy one array list into another
// make a new empty array and add all of the same components
			ArrayList<String> newToys = new ArrayList<String>();
			newToys.addAll(toys);

			System.out.println(newToys);

// Write a Java program to extract a portion of an array list
			String str = toys.get(0);
			System.out.println(str);

			// portion is 3rd to 5th items
			ArrayList<String> someToys = new ArrayList<String>();
			someToys.add(toys.get(2));
			someToys.add(toys.get(3));
			someToys.add(toys.get(4));

			System.out.println(toys);

			// use subList
			List<String> someMoreToys = new ArrayList<String>();

			someMoreToys = toys.subList(2, 5);

			System.out.println(someMoreToys);


			// random number of items and random starting point
			Random rd = new Random();
			// between 1 and length, inclusive
			int numItems = (Math.abs((rd.nextInt()) % toys.size()) + 1);
			System.out.println(numItems);
			// between 0 and length-numItems
			int maxVal = toys.size()-numItems;
			int startIndex;
			if (maxVal == 0) {
				startIndex = 0;
			} else {
				startIndex = (Math.abs((rd.nextInt()) % maxVal));
			}
			System.out.println(startIndex);
			List<String> randomMoreToys = new ArrayList<String>();
			for (int i = startIndex; i < (startIndex+numItems); i++) {
				randomMoreToys.add(toys.get(i));
			}
			System.out.println("this array is the random subset of subjects");
			System.out.println(randomMoreToys);

			// swap two items in an arrayList
			// swap first and second items
			// save first element
			str = toys.get(0);
			// put second element in first position
			toys.set(0, toys.get(1));
			// put saved first element in second position
			toys.set(1, str);
			System.out.println(toys);


			// test an array list is empty or not
			List<String> emptyList = new ArrayList<String>();

			if (emptyList.size() != 0) {
				System.out.println("not empty");
			} else {
				System.out.println("empty");
			}

			// swap two items in an arrayList
			// swap second item and a specified element
			// specify
			int swap = (Math.abs((rd.nextInt()) % toys.size()));
			while (swap == 1) {
				swap = (Math.abs((rd.nextInt()) % toys.size()));
			}
			System.out.println("swap is " + swap);
			// save second element
			str = toys.get(1);
			// put second element in first position
			toys.set(1, toys.get(swap));
			// put saved first element in second position
			toys.set(swap, str);
			System.out.println(toys);

			// trim the capacity of an array list to the current size
			toys.trimToSize();
			System.out.println(toys);

			// empty hashset AND print out size if not empty
			HashSet<Integer> testSet = new HashSet();
			testSet.add(1);
			testSet.add(2);
			testSet.add(3);
			testSet.add(4);
			testSet.add(5);
			testSet.add(6);

			if (testSet.size() == 0) {
				System.out.println("empty hash set");
			} else {
				System.out.println("non-empty hash set, size is " + testSet.size());
			}

			// iterate through all of the elements in a hash set
			// convert the hash set to an array
			Iterator<Integer> iter = testSet.iterator(); 
			ArrayList<Integer> hashToArray = new ArrayList<Integer>();

			while(iter.hasNext()) {
				Integer tempInt = iter.next();
				System.out.println(tempInt);
				hashToArray.add(tempInt);
			}
			System.out.println(hashToArray);

			//compare two sets and retain elements that are the same on both sides
			HashSet<Integer> compareSet = new HashSet();
			compareSet.add(1);
			compareSet.add(3);
			compareSet.add(5);
			compareSet.add(7);
			compareSet.add(9);
			compareSet.add(11);

			HashSet<Integer> savedSet = new HashSet();


			iter = testSet.iterator(); 
			Iterator<Integer> iter2 = compareSet.iterator(); 

			while (iter.hasNext()) {
				Integer tempInt = iter.next();
				while(iter2.hasNext()) {
					if (tempInt == iter2.next()) {
						System.out.println(tempInt);
						savedSet.add(tempInt);
						break;
					}
//					System.out.println(tempInt);
				}
				iter2 = compareSet.iterator();
			}
			System.out.println(savedSet);
		}

	}
