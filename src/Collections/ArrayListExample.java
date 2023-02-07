package Collections;

import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		/*Array list uses the dynamic array when the elements increase the size of the array also increases.S
		 */
		for(int i=0;i<5;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Value");
			String j = sc.next();
			list.add(j);
		}
		System.out.println(list);
		//Iterator used to iterate the Elements
		Iterator<String> i = list.iterator();
		
		//HasNext Checks whether the next element is there or not if exists Returns true orelse false
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		System.out.println();
		
		//Foreach loop
		for(String s : list) {
			System.out.print(s);
		}
		/*Get and Set array used to get the element from the specified Index and set the value in the specified index
		 * If the element in the set index isn't there it throws a exception at runtime
		 */
		
		System.out.println(list.get(4));
		try {
		list.set(5, "SixIndies");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(list);
		
		// To sort the elements 
		Collections.sort(list);
		System.out.println(list);
	}
}
