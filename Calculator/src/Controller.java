import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller 
{
	
	View window;
	Model module;
	
	Controller()
	{
		module=new Model();
		window=new View();
		window.setActionListeners(new ButtonHandler());
		
		
		
	}
	
	
	class ButtonHandler implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource()==window.C)
			{
				window.Result.setText(window.Input.getText());
			}
			
		}
		
	}
	
	
}
