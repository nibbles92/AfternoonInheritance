package ctec.model;

import java.util.ArrayList;

public abstract class sandwich implements Gaymes
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

		public String toString()
			{
				String sandwichDescription = "this is sandwich of type"
						+ this.getClass().getName() + "and serving size of"
						+ getServingSize();

				return sandwichDescription;
			}

		// public int compareTo(Object compared)
		// {
		// int comparedValue = Integer.MIN_VALUE;
		//
		// if(compared instanceof Gaymes)
		// {
		// if(this.Ingredients() < ((Gaymes) compared).Ingredients())
		// {
		// comparedValue = -1;
		// }
		// else if(compared instanceof Gaymes)
		// {
		// if(this.Ingredients() < ((Gaymes) compared).Ingredients())
		// {
		// comparedValue = 0;
		// }
		// }
		//
		// return comparedValue;
		// }
	}
