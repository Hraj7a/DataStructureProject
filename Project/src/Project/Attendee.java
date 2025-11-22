	package Project;
	
	import java.util.ArrayList;
	
	public class Attendee {
		int id;
		String name;
		static ArrayList<Attendee> AttendeesPresent = new ArrayList<>();
	
		public Attendee(int id, String name) {
			this.id = id;
			this.name = name;
		}
	
		public int getId() {
			return id;
		}
	
		public void setId(int id) {
			this.id = id;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
		public String Display() {
			AttendeesPresent.add(this);
			return getName();
		}
		
	}
