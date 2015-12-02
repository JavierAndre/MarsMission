package marsmission;

public class PayloadModel {

	/*
	 * Class Instance Variable
	 * 
	 */
	
	private int 	type;
	private String	model;
	private String	organization;
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final int	CREW_PAYLOAD	= 1;
	public static final int	CARGO_PAYLOAD	= 2;
	
	/*
	 * Constructors
	 * 
	 */
	
	public PayloadModel(int type, String model, String organization) {
		this.type 			= type;
		this.model 			= model;
		this.organization 	= organization;
	}
}
