package Project;

import Tree.Tree;

public class Event {
	Tree<Attendee> attendees = new Tree<>();
	int day, month, year;
	String title;

	public Event(int day, int month, int year, String title) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.title = title;
	}

	public Event(Tree<Attendee> attendees, int day, int month, int year, String title) {
		super();
		this.attendees = attendees;
		this.day = day;
		this.month = month;
		this.year = year;
		this.title = title;
	}
	
	public void addAttendee(Attendee a) {
		this.attendees.insert(a.getId(), a);
	}
	public boolean search(int k) {};
	/

}
