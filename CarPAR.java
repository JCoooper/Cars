
public abstract class CarPAR {
	private double price;

	public CarPAR(double cost) {
		price = cost * 2;
	}

	public double getPrice() {
		return price;
	}
}