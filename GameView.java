import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class GameView extends JFrame implements Observer
{
	JLabel _player1, _player2; 
	JPanel _south,_spelPlan,_startPanel;
	JButton button[]=new JButton[ANTAL_BRICKOR], _nyttSpel;
	public static final int ANTAL_BRICKOR = 9;
	
	GameController aController;
	public GameView(GameController aController)
	{
		this.aController=aController;
		this.setLayout(new BorderLayout());
		this.setSize(1024,768);
		this.setTitle("Luffarshack av Jonas Nilsson");
		
		southPanel();
		spelPlan();
		mataInNamn();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void spelPlan()
	{
		_spelPlan = new JPanel(new GridLayout(0,3));
		this.add(_spelPlan);
		
		for(int i=0;i<button.length;i++)
		{
		button[i] = new JButton();
		button[i].addActionListener(aController);
		button[i].setActionCommand(Integer.toString(i));
		button[i].setBackground(Color.CYAN);
		button[i].setFont(new Font("Calibri", Font.BOLD, 200));
		_spelPlan.add(button[i]);
		}
		
	}
	public void southPanel()
	{
		_south = new JPanel(new BorderLayout());
		this.add(_south,BorderLayout.SOUTH);
		_south.setBackground(Color.ORANGE);
		_startPanel = new JPanel(new FlowLayout());
		_south.add(_startPanel,BorderLayout.CENTER);
		_startPanel.setBackground(Color.ORANGE);
		
		_player1 = new JLabel();
		_player2 = new JLabel();
		
		_nyttSpel = new JButton();
		_nyttSpel.setText("Nytt Spel");
		_nyttSpel.addActionListener(aController);
		_nyttSpel.setActionCommand("_nyttSpelCommand");
		
		_startPanel.add(_nyttSpel,BorderLayout.CENTER);
		_south.add(_player1,BorderLayout.WEST);
		_south.add(_player2,BorderLayout.EAST);
	}

	 public void mataInNamn()
	 {
		 String player1 = " ";
	     String player2 = " ";
	    
	     player1 = JOptionPane.showInputDialog(null, "Skriv in namnet på spelare 1: ");
	     _player1.setText(player1+" = X");
	 
	     
	     player2 = JOptionPane.showInputDialog(null, "Skriv in namnet på spelare 2: "); 
	     _player2.setText(player2+" = O");
	    
	 }

	
	public void update(Observable aModel, Object arg1) 
	{/*
		GameModel model = (GameModel) aModel;
			if(model.isCross())
				button.setText(aModel.);
				_spelPlan..setText("X");
			else
				_spelPlan.button[i].setText("0");
		
	}*/
}}


