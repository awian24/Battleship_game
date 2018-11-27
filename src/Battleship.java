import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
	private JLabel jLabel1 = null;
	private JLabel jLabel5M = null;
	private JLabel jLabel4M = null;
	private JLabel jLabel3M = null;
	private JLabel jLabel2M = null;
	private JLabel jLabel1M = null;
	private JLabel jLabelend = null;
	private Board boardGame = null;
	private JButton nowaGra = null;
	private int Statki_1M = 4;
	private int Statki_2M = 3;
	private int Statki_3M = 2;
	private int Statki_4M = 2;
	private int Statki_5M = 1;
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(12, 10, 117, 16));
			jLabel1.setText("Statki:");
			jLabel1M = new JLabel();
			jLabel1M.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel1M.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel1M.setSize(new Dimension(52, 23));
			jLabel1M.setLocation(new Point(45, 7));
			jLabel1M.setText("1M:4");
			jLabel2M = new JLabel();
			jLabel2M.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel2M.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel2M.setSize(new Dimension(52, 23));
			jLabel2M.setLocation(new Point(100, 7));
			jLabel2M.setText("2M:3");
			jLabel3M = new JLabel();
			jLabel3M.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel3M.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel3M.setSize(new Dimension(52, 23));
			jLabel3M.setLocation(new Point(150, 7));
			jLabel3M.setText("3M:2");
			jLabel4M = new JLabel();
			jLabel4M.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4M.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel4M.setSize(new Dimension(52, 23));
			jLabel4M.setLocation(new Point(200, 7));
			jLabel4M.setText("4M:2");
			jLabel5M = new JLabel();
			jLabel5M.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel5M.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabel5M.setSize(new Dimension(52, 23));
			jLabel5M.setLocation(new Point(250, 7));
			jLabel5M.setText("5M:1");
			jLabelend = new JLabel();
			jLabelend.setFont(new Font("Dialog", Font.BOLD, 28));
			jLabelend.setHorizontalAlignment(SwingConstants.RIGHT);
			jLabelend.setSize(new Dimension(200, 80));
			jLabelend.setLocation(new Point(350, 150));
			jLabelend.setText("KONIEC GRY");
			jLabelend.setVisible(false);
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel1M, null);
			jContentPane.add(jLabel2M, null);
			jContentPane.add(jLabel3M, null);
			jContentPane.add(jLabel4M, null);
			jContentPane.add(jLabel5M, null);
			jContentPane.add(jLabelend, null);
			jContentPane.add(getBoardGame(), null);
			jContentPane.add(getNowaGra(), null);
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
	
	private JButton getNowaGra() {
		if (nowaGra == null) {
			nowaGra = new JButton();
			nowaGra.setLocation(new Point(20, 350));
			nowaGra.setEnabled(true);
			nowaGra.setText("Nowa gra");
			nowaGra.setSize(new Dimension(131, 23));
			nowaGra.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if (boardGame != null) {
						boardGame.rozkladLosowy();
						jLabelend.setVisible(false);
						Statki_1M = 4;
						Statki_2M = 3;
						Statki_3M = 2;
						Statki_4M = 2;
						Statki_5M = 1;
						jLabel1M.setText("1M:4");
						jLabel2M.setText("2M:3");
						jLabel3M.setText("3M:2");
						jLabel4M.setText("4M:2");
						jLabel5M.setText("5M:1");
					}
				}
			});
		}
		return nowaGra;
	}
	
	public void setShipShot(int masztowiec)
	{
		switch (masztowiec)
		{
			case 1:
				jLabel1M.setText("1M:" + --Statki_1M);
			break;
			case 2:
				jLabel2M.setText("2M:" + --Statki_2M);
			break;
			case 3:
				jLabel3M.setText("3M:" + --Statki_3M);
			break;
			case 4:
				jLabel4M.setText("4M:" + --Statki_4M);
			break;
			case 5:
				jLabel5M.setText("5M:" + --Statki_5M);
			break;
		}
	}
	
	public void checkShip()
	{
		if(Statki_1M == 0 && Statki_2M == 0 && Statki_3M == 0 && Statki_4M == 0 && Statki_5M == 0)
		{
			jLabelend.setVisible(true);
			System.out.println("KONIEC GRY");
		}
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
		this.setSize(694, 547);
		this.setContentPane(getJContentPane());
		this.setResizable(false);
		this.setTitle("Battleship");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screenSize.width/2-450),(screenSize.height/2-450));
//		this.resetujPlansze();
	}

}
