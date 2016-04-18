package sandwich.View;

import javax.swing.JFrame;

import sandwich.Controller.SandwichController;

public class SandwichFrame extends JFrame
	{
		private SandwichController baseController;
		private SandwichPanel basePanel;

		public SandwichFrame(SandwichController baseController)
			{
				this.baseController = baseController;
				basePanel = new SandwichPanel(baseController);
				setupFrame();
			}

		private void setupFrame()
			{
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setContentPane(basePanel);
				this.setResizable(false);
				this.setTitle("Sandwiches");
				this.setSize(500, 500);
				this.setVisible(true);
			}
	}
