import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetTest {

	static int setSize = 100000;
	
	static HashSet<Integer> set = new HashSet<Integer>();
	static HashSet<Integer> otherSet = new HashSet<Integer>();
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> otherList = new ArrayList<Integer>();
	static Random rand = new Random();
	static long startTime;
	static long endTime;

	public static void main(String args[]) {
		
		while (set.size() < setSize) {
			
			int val = rand.nextInt();
			
			if (!set.contains(val)) {
			
				set.add(val);
				otherSet.add(val);
				list.add(val);
				otherList.add(val);
				
			}
			
		}
		
		System.out.println("Data structures initialized with " + set.size() + " variables");
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Beginning set.contains(o) testing");
		
		startTime = System.currentTimeMillis();
		
		for (Integer integer : otherSet) {
			
			set.contains(integer);
			
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("Ended set.contains(o) testing");
		System.out.println("Test run time: " + (endTime - startTime) + " ms");
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Beginning list.contains(o) testing");
		
		startTime = System.currentTimeMillis();
		
		for (Integer integer : otherList) {
			
			list.contains(integer);
			
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("Ended list.contains(o) testing");
		System.out.println("Test run time: " + (endTime - startTime) + " ms");
		
	}
	
}
