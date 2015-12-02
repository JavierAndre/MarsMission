package marsmission;

public class OrionModel extends CrewModuleModel {

	/*
	 * Class Instance Variables
	 * 
	 */
	
	private LaunchAbortSystemModel			launchAbortSystem;
	private ServiceModuleModel				serviceModule;
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final String 				ORION_MODEL 		= "Orion";
	public static final String 				ORION_ORGANIZATION	= "NASA";
	public static final int					ORION_CREW			= 4;
	
	/*
	 * Constructors
	 * 
	 */
	
	
	public OrionModel() {
		super(PayloadModel.CREW_PAYLOAD, ORION_MODEL, ORION_ORGANIZATION, ORION_CREW);
		
		launchAbortSystem 	= new LaunchAbortSystemModel();
		serviceModule 		= new ServiceModuleModel();
	}
}
