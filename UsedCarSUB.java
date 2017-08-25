import java.text.NumberFormat;
import java.util.Locale;

public class UsedCarSUB extends CarPAR {

	private int mileage;

	public UsedCarSUB(double cost, int miles) {
		super(cost);
		mileage = miles;

	}

	public int getUsedCarSUBMile() {
		return mileage;
	}

	public boolean equals(UsedCarSUB new2) {
		boolean objectsEqual;
		// int use ==
		boolean condition1 = (this.getPrice() == new2.getPrice());
		// int use ==
		boolean condition2 = (this.getUsedCarSUBMile() == new2.getUsedCarSUBMile());

		if (condition1 && condition2) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}

	public void display() {
		System.out.println("price = $" + NumberFormat.getNumberInstance(Locale.US).format(this.getPrice())
				+ ", milegae = " + NumberFormat.getNumberInstance(Locale.US).format(this.getUsedCarSUBMile()));
	}
}
