package JDBC.Decorate;

public class MountainBike extends Bike {

	public MountainBike(String name) {
		super(name);

		setPrice(500000);
	}

	@Override
	protected void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("cost of:" + getName() + " " + getPrice());

	}

}
