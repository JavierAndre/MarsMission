package marsmission;

public class ServiceModuleModel {

	/*
	 * Class Instance Variables
	 * 
	 */
	
	private ServiceModulePanelsModel serviceModulePanels;
	private SpacecraftAdapterModel	 spacecraftAdapter;
	
	/*
	 * Class Constants
	 * 
	 */
	

	
	/*
	 * Constructors
	 * 
	 */
	
	public ServiceModuleModel() {
		serviceModulePanels = new ServiceModulePanelsModel();
		spacecraftAdapter	= new SpacecraftAdapterModel();
	}
}
