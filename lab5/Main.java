package lab5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupGeneric<Integer> test = new GroupGeneric<Integer>();
		
		// linked test
		LinkedList<String> linked = new LinkedList<String>();
		linked.add("a");
		linked.add("b");
		linked.add("c");
		linked.add("d");
		linked.add("e");
		
		System.out.println(GroupGeneric.<String>getOdd(linked));
		List<Integer> testTwo = new ArrayList<Integer>();
		testTwo.add(1);
		testTwo.add(2);
		testTwo.add(3);
		testTwo.add(4);
		testTwo.add(5);
		// создаем
		test.add(testTwo); // аж с коллекцией
		//тест статического метода.
		List<Integer> testL = new ArrayList<Integer>();
		testL.add(1);
		testL.add(2);
		testL.add(3);
		testL.add(4);
		testL.add(5);
		// добавляем к предыдуще-добавленной группе
		test.addToFinished(testL);
		System.out.println(GroupGeneric.<Integer>getOdd(testL));
		test.printObjects();
		
		test.add(123); // просто добавляем элемент
		test.printObjects();
	}

}
