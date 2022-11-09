package JDBC.Decorate;

public class RoadBike extends Bike {

	public RoadBike(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		setPrice(500000);
	}

	@Override
	protected void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("cost of  " + getName() + "" + getPrice());

	}

}
