import java.util.Observable;
import javax.swing.JOptionPane;


public class GameModel extends Observable
{
	public static final int ANTAL_BRICKOR = 9;
	private boolean cross = true;
	private String state= " ";
	private int board[];
	private int turn;

	GameController aController;
	public GameModel()
	{
		this.aController=aController;
		board = new int [ANTAL_BRICKOR];
	}
	public void doMove(int pos)
	{
		source
	}
	
	public void getBoard(GameController c)
	{
		for (int i=0; i<ANTAL_BRICKOR;i++)
		{
			board[i] = c.pos;
		}
	}
	

 public boolean isCross(G)  //ska vara Boolean!
 {
	// if (v.button[i].setText(isCross=="X");)
	 return cross;
 }

/* public String setCross()
 {
	 state= "X";
	 cross = true;
	 this.setChanged();
	 this.notifyObservers();
 }*/
 public void setRing(GameView v)
 {
	 
	 state= "O";
	 //v.button[i]=state;
	 cross = false;
	 this.setChanged();
	 this.notifyObservers();
 }
 
 public void nyttSpel()
 {

 }

 public static void main(String[] args)
	{
		GameModel m = new GameModel();
		GameController c = new GameController(m);
		GameView v = new GameView(c);
		m.addObserver(v);
		
		
	}
}
