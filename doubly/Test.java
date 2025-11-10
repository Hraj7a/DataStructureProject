package doubly;

public class Test {
public static void main(String arg[])
{
	DoublyLinkedList<Student> myList=new DoublyLinkedList<>();
	myList.addFirst(new Student(1,"Ahmed"));
	myList.addFirst(new Student(2,"Khaled"));
	myList.addLast(new Student(3,"Ali"));
	myList.removeLast();
	myList.printForward();
	
	
	
	
}
}
