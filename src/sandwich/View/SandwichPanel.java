package sandwich.View;

import javax.swing.*;

import sandwich.Controller.SandwichController;

public class SandwichPanel extends JPanel
	{
		private JButton PBJButton;
		private SandwichController baseController;
		private JButton HamButton;
		private SpringLayout baseLayout;
		private JTextArea typingField;

		public SandwichPanel(SandwichController baseController)
			{
				this.baseController = baseController;
				baseLayout = new SpringLayout();
				PBJButton = new JButton("PBJ Sandwich");
				HamButton = new JButton("Ham Sandwich");
				typingField = new JTextArea(10,15);
				typingField.setEditable(false);

				setupPanel();
				setupLayout();
				setupListeners();
			}

		private void setupPanel()
			{
				this.add(PBJButton);
				this.add(HamButton);
				this.add(typingField);
			}

		private void setupLayout()
			{

			}

		private void setupListeners()
			{

			}
	}
