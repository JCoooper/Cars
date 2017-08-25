
public class CarTES {

	public static void main(String[] args) {
		NewCarSUB new1 = new NewCarSUB(8000.33, "silver");
		NewCarSUB new2 = new NewCarSUB(8000.33, "silver");

		if (new1.equals(new2)) {
			new1.display();
		}

		UsedCarSUB used1 = new UsedCarSUB(2500, 100000);
		UsedCarSUB used2 = new UsedCarSUB(2500, 100000);

		if (used1.equals(used2)) {
			used1.display();
		}
	}

}
