package tst.classes.ex;

/********************************
 * Created by Alex S.
 * on 19.11.2020
 *******************************/

public class Smartphone {

	// fields
	private String name;
	private String model;

	private int power;

	private boolean fiveGSupported;

	private final float minPerPower = 0.5f;

	// constructor
	public Smartphone(String name, String model, Integer power, Boolean fiveGSupported) {
		this.name = name;
		this.model = model;
		this.power = power;
		this.fiveGSupported = fiveGSupported;
	}

	//custom methods
	/**
	 * Ta metoda oblicza moc smartfonu
	 * @return ilość minut przed kolejnym ladowaniem
	 */
	public String getCalculatedTimeBeforeTheNextRecharge() {
		return power * minPerPower + " min";
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Boolean getFiveGSupported() {
		return fiveGSupported;
	}

	public void setFiveGSupported(Boolean fiveGSupported) {
		this.fiveGSupported = fiveGSupported;
	}

	public float getMinPerPower() {
		return minPerPower;
	}
}
