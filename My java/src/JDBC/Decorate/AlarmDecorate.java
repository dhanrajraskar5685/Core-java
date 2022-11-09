package JDBC.Decorate;

public class AlarmDecorate extends BikeDecorator {

	protected Bike bike;

	public AlarmDecorate(Bike bike) {
		super(bike);
		this.bike = bike;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("add Alarm to " + bike.getName());
	}

	@Override
	protected String addnewFeatureName() {
		// TODO Auto-generated method stub

		return "Alarm";
	}

	@Override
	protected int addnewFeaturePrice() {
		// TODO Auto-generated method stub
		return 4000;
	}

}
