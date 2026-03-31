package m1.submitDetails;

public class Source {
	public static void main(String[] args) {
		Person s = new Person("Steve","12-02-1998","Steve12@doselect.com");
		Implementation m = new Implementation();
		try {
			System.out.println(m.validator(s));
			System.out.println(m.submitDetails(s));
		} catch (InvalidEMailException | InvalidDateException e) {
			System.out.println(e.getMessage());
		}
	}
}
