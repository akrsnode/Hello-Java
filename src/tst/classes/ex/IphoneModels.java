package tst.classes.ex;

/********************************
 * Created by Alex S.
 * on 22.11.2020
 *******************************/

public enum IphoneModels {

	IPHONE_11("MDX11"), IPHONE_12("MDX12"), IPHONE_13("MDX13");

	String internalModelName;

	IphoneModels(String modelName) {
		this.internalModelName = modelName;
	}

	public Boolean isTheSame(IphoneModels model) {
		return model.toString().equals(this.internalModelName);
	}
}
