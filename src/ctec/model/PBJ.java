package ctec.model;

import java.util.ArrayList;

public class PBJ extends sandwich
	{
		public PBJ()
			{
				super();
				this.setIngredients(PBJIngredients());
				this.setTasty(true);
				this.setServingSize(2);
			}

		private ArrayList<String> PBJIngredients()
			{
				ArrayList<String> PBJ = new ArrayList<String>();
				PBJ.add("jam");
				PBJ.add("PeanutButter");
				PBJ.add("Bread");

				return PBJ;
			}

		@Override
		public boolean isFun()
			{

				return false;
			}

		@Override
		public boolean isSeries()
			{

				return false;
			}

		@Override
		public boolean isMulitplayer()
			{

				return false;
			}

		@Override
		public void gameRate(int rating)
			{

			}

		@Override
		public void gameCatagory(String catagory)
			{

			}
	}
