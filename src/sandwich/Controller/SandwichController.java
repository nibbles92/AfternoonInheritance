package sandwich.Controller;

import sandwich.View.SandwichFrame;

public class SandwichController
{

	public SandwichController()
	{
		new SandwichFrame(this);
	}
	
	public void start()
	{
			
			
	}
	
	private void setupGaymesList()
	{
		GaymesList.add(new PBJ());
		GaymesList.add(new Ham());
	}
	
	public String showInterfaceStuff()
	{
		String interfaceInfo = "";
		
		for(Gaymes currentGaymes : GaymesList)
			{
				interfaceInfo.concat("the current silly thing is" + currentGaymes.toString());
				interfaceInfo.concat("\n" + "and it haa silly level of" + currentGaymes.());
				
			}
		return interfaceInfo;
	}

}
