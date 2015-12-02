package marsmission;

public class DragonModel extends CrewModuleModel {

	/*
	 * Class Instance Variables
	 * 
	 */
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final String 				DRAGON_MODEL 		= "Crew Dragon";
	public static final String 				DRAGON_ORGANIZATION	= "SpaceX";
	public static final int					DRAGON_CREW			= 7;
	
	/*
	 * Constructor
	 * 
	 */
	
	public DragonModel() {
		super(PayloadModel.CREW_PAYLOAD, DRAGON_MODEL, DRAGON_ORGANIZATION, DRAGON_CREW);
	}
}
