//Team BATwomen-- Bayan Berri, Alison Lee, Truc Dao
//APCS2 p4
//HW31-- That We May All Relax Harder

public class DequeTester{
    public static void main( String[] args){
	Euqed<String> tester= new Euqed<String>();
	
	tester.addFirst("a");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addFirst("b");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addFirst("c");
	System.out.println("updated deque:");
	System.out.println(tester);
	
	tester.addLast("l1");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addLast("l2");
	System.out.println("updated deque:");
	System.out.println(tester);

	tester.addLast("l3");
	System.out.println("updated deque:");
	System.out.println(tester);

	System.out.println("testing toString() now:");
	System.out.println(tester);

	System.out.println("testing pollLast() now:");
	System.out.println(tester.pollLast());

	System.out.println("testing toString() now:");
	System.out.println(tester);

	System.out.println("testing pollFirst() now:");
	System.out.println(tester.pollFirst());
	System.out.println("updated deque:");
	System.out.println(tester);
	
	System.out.println("testing peekFirst() now:");
	System.out.println(tester.peekFirst());
	System.out.println("peek doesn't update the deque::");
	System.out.println(tester);
	
	System.out.println("testing peekLast() now:");
	System.out.println(tester.peekLast());
	/*-----------------------------------------
	----------------------------------*/
    }
}
