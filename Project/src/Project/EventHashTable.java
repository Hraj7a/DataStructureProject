package Project;
import java.time.LocalDate;
import Hash.*;

public class EventHashTable {
	ChainingHashTable<Event> EventHashTable = new ChainingHashTable<>(367);
	
	
	public void addEvent(int day, int month, int year, String name) {
		Event temp = new Event(day,month,year,name);
		int key = getDayOfYear(day,month,year);
		EventHashTable.insert(key, temp);
	}
	private int getDayOfYear(int day, int month, int year) {
		LocalDate eventDate = LocalDate.of(year, month, day);
		return eventDate.getDayOfYear();
	}
	
	public String addAttendee(String eventName, int id, String name) {
		for (int i=1;i<=366;i++) {
			Event temp = EventHashTable.find(i);
			if (temp!= null && temp.title.equals(eventName)) {
				temp.addAttendee(new Attendee(id, name));
				return "Added "+name+" to "+eventName;
			}
		}
			return "Event: "+eventName+" was not found!";
		}
//-----------------------------------------
public static void main(String args[]) {
	EventHashTable table = new EventHashTable();
	int i = table.EventHashTable.hashFunc(2);
	System.out.println(i);
}

}