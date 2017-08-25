import java.text.NumberFormat;
import java.util.Locale;

public class NewCarSUB extends CarPAR {

	private String color;

	public NewCarSUB(double cost, String col) {
		super(cost);
		color = col;

	}

	public String getNewCarSUBColor() {
		return color;
	}

	public boolean equals(NewCarSUB new2) {
		boolean objectsEqual;
		// int use ==
		boolean condition1 = (this.getPrice() == new2.getPrice());
		// string
		boolean condition2 = this.getNewCarSUBColor().equals(new2.getNewCarSUBColor());

		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}

	void display() {
		System.out.println(
				"price = $" + NumberFormat.getNumberInstance(Locale.US).format(this.getPrice()) + ", color = " + color);
	}
}
