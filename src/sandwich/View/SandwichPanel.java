package sandwich.View;

import javax.swing.*;

import sandwich.Controller.SandwichController;

public class SandwichPanel extends JPanel
{
	private JButton PBJButton;
	private SandwichController baseController;
	private JButton HamButton;
	private SpringLayout baseLayout;
	
	public SandwichPanel(SandwichController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		PBJButton = new JButton("PBJ Sandwich");
		HamButton = new JButton("Ham Sandwich");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.add(PBJButton);
		this.add(HamButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
