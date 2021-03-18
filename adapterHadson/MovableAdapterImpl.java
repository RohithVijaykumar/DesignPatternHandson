package adapterHadson;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;

	@Override
	public double getPrice() {
		return convertUSDtoEURO(luxuryCars.getPrice());
	}

	private double convertUSDtoEURO(double usd) {
		return usd * 0.84;
	}

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}
}
