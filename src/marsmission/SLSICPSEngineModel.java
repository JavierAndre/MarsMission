package marsmission;

public class SLSICPSEngineModel extends Stage3EngineModel {

	/*
	 * Class Instance Variables
	 * 
	 */
	
	private LaunchVehicleStageAdapterModel	launchVehicleStageAdapterModel;
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final String	ICPS_ENGINE = "ICPS";
	
	/*
	 * Constructor
	 * 
	 */
	
	public SLSICPSEngineModel(int type, String model, String organization) {
		super(type, model, organization);
		
		launchVehicleStageAdapterModel = new LaunchVehicleStageAdapterModel();
	}
}
