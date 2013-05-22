import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;


public final class javatestproj extends JFrame{

	/**
	 * @param args
	 */
	//public members
	public final static int HEIGHT = 160;
	public final static int WIDTH = 390;

	//private members
	private static final long serialVersionUID = 1L;
	private static final String title = "TEST";
	
	public static void main(String[] args) {
		new javatestproj();
		
	}
	public javatestproj(){
		this.setSize(WIDTH, HEIGHT); //set the size
		this.setResizable(false); //make unresizable
		this.setLocationRelativeTo(null); //center it
		this.setTitle(title); //set title
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //make it close when it's closed.
		this.setVisible(true); //make visible
		
		JLabel itworks = new JLabel();
		itworks.setText("It works.");
		itworks.setLocation(180, 90);
		itworks.setFont(new Font("Arial", Font.BOLD, 72));
		this.add(itworks);
	}

}
