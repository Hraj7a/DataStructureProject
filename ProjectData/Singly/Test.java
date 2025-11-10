package Singly;

public class Test {
public static void main(String arg[])
{
	SinglyLinkedList<Student> myList=new SinglyLinkedList<>();
	myList.addFirst(new Student(1,"Ahmed"));
	myList.addFirst(new Student(2,"Khaled"));
	myList.addLast(new Student(3,"Ali"));
	Student x=myList.removeLast();
	
	myList.display();
	System.out.println(myList.size());
	
}
}
