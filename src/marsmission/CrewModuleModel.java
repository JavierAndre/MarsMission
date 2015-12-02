package marsmission;

public class CrewModuleModel extends PayloadModel {

	/*
	 * Class Instance Variables
	 * 
	 */
	
	private int		crewMembers;
	
	/*
	 * Class Constants
	 * 
	 */
	
	
	
	/*
	 * Constructors
	 * 
	 */
	
	public CrewModuleModel(int type, String model, String organization, int crewMembers) {
		
		super(type, model, organization);
		
		this.crewMembers	= crewMembers;
	}
}
