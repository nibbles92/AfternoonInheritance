package sandwich.Controller;

import java.util.ArrayList;

import ctec.model.Gaymes;
import ctec.model.Ham;
import ctec.model.PBJ;
import sandwich.View.SandwichFrame;

public class SandwichController
	{

		private ArrayList<Gaymes> gaymesList;

		public SandwichController()
			{
				gaymesList = new ArrayList<Gaymes>();
				new SandwichFrame(this);
			}

		public void start()
			{
				setupGaymesList();

			}

		public void quicksort(int low, int high)
			{
				if(low < high)
				{
					int midPoint = partition(low, high);
					quicksort(low, midPoint-1);
					quicksort(midPoint+1, high);
				}
			}
			
			private int partition(int low, int high)
			{
				int position = low;
				Gaymes pivot = Gaymes.get(high);
				
				for(int spot = low; spot < high-1; spot++)
				{
					if(Gaymes.get(spot).compareTo(pivot) <= 0)
					{
						if(Gaymes.get(spot).compareTo(pivot) <= 0)
						{
							swap(position, spot);
							position++;
						}
					}
					swap(position, high);
					
					return position;
				}
			}

		
		private void setupGaymesList()
			{
				gaymesList.add(new PBJ());
				gaymesList.add(new Ham());
			}

		public String showInterfaceStuff()
			{
				String interfaceInfo = "";

				for (Gaymes currentGaymes : gaymesList)
					{
						interfaceInfo.concat("the current silly thing is"
								+ currentGaymes.toString());
						interfaceInfo.concat("\n" + "and it haa silly level of"
								+ currentGaymes.isFun());

					}
				return interfaceInfo;
			}

	}
