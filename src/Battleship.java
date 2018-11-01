import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Battleship  extends JFrame{
	
	
	private static Battleship instance = null;

	public static Battleship getInstance() {
		return instance;
	}

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private Board boardGame = null;
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getBoardGame(), null);
		}
		return jContentPane;
	}

	private Board getBoardGame() {
		if (boardGame == null) {
			boardGame = new Board();
			boardGame.setLocation(new java.awt.Point(13, 34));
		}
		return boardGame;
	}
/*	
	private void startGame()
	{
		DownloadSigns download = new DownloadSigns();
		int x;
		int y;
		while(true)
		{
			String shot = download.inputDate("Podaj pole:");
			
			if(shot.length() == 3){
				y = (((int)(shot.charAt(2)-49) + 10));
			}
			else{
				y = ((int)(shot.charAt(1)-49));
			}
			x = ((int)(shot.charAt(0)-97));
			WynikStrzalu strzal = boardGame.sprawdzStrzal(x,y);
//			System.out.println(x);
//			System.out.println(y);
			System.out.println(strzal);
			System.out.println(" ");
			System.out.println(" ");
			boardGame.zaznaczStrzal(x, y, strzal);
		}
//		endGame();
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Battleship game = new Battleship();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setVisible(true);
//		game.startGame();
		System.out.println("KONIEC GRY");
	}

	/*
	 * Konstruktor klasy Battleship
	 */
	
	private Battleship(){
		super();
		instance = this;
		initialize();
		System.out.println("Start...");		
	}
	
	private void initialize() {
		this.setSize(900, 900);
		this.setContentPane(getJContentPane());
		this.setResizable(false);
		this.setTitle("Battleship");

//		this.resetujPlansze();
	}

}
