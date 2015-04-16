import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class GameController implements ActionListener
{
	int pos;
	GameModel model;
	public GameController(GameModel aModel)
	{
		model= aModel;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		JButton pos = (JButton) e.getSource();
		if(pos.getActionCommand()=="_nyttSpelCommand")
		{
			
		//anropa new game
		}

		else
		{
			model.doMove(Integer.parseInt(pos.getActionCommand()));
		}
	}
}
