
public class CButtonFactory {
	public static CButton getButton(String buttonType) {
		if (buttonType == null) {
			return null;
		} else if (buttonType.equalsIgnoreCase("ADD")) {
			return new Add();
		} else if (buttonType.equalsIgnoreCase("SUBTRACT")) {
			return new Subtract();
		}	
		return null;
	}	
}
