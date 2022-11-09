package JDBC.Decorate;

public abstract class BikeDecorator extends Bike {
	protected Bike bike;

	public BikeDecorator(Bike bike) {
		this.bike = bike;

		setName(bike.getName() + " " + addnewFeatureName());
		setPrice(bike.getPrice()+ addnewFeaturePrice());

	}

	protected abstract String addnewFeatureName();

	protected abstract int addnewFeaturePrice();

	@Override
	protected void showDetails() {
		bike.showDetails();
		System.out.println("cost of " + getName() + " " + getPrice());

	}

}
