package ctec.model;

import java.util.ArrayList;

public abstract class sandwich
	{
		private double servingSize;
		private ArrayList<String> ingredients;
		private boolean isTasty;

		public double getServingSize()
		{
			return servingSize;
		}

		public void setServingSize(double servingSize)
		{
			this.servingSize = servingSize;
		}

		public ArrayList<String> getIngredients()
		{
			return ingredients;
		}

		public void setIngredients(ArrayList<String> ingredients)
		{
			this.ingredients = ingredients;
		}

		public boolean isTasty()
		{
			return isTasty;
		}

		public void setTasty(boolean isTasty)
		{
			this.isTasty = isTasty;
		}

		
	}
