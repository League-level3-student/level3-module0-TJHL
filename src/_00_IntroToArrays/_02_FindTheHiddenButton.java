package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.Messaging.SyncScopeHelper;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	String tempToInt ;
	int numOfButtons=0;
	int hiddenButtons;
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	// 2 create an integer variable called hiddenButton
		// 3. Ask the user to enter a positive number and convert it to an int
				// 4. Initialize the array of JButtons to be the size of the int created in step 3
						// 5. Make a for loop to iterate through the JButton array
								// 6. initialize each JButton in the array
								// 7. add the ActionListener to each JButton
								// 8. add each JButton to the panel

								// 9 add the panel to the window
	// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
	// 11. set the JFrame to visible.
	JButton[] buttonFormation;
	int hiddenButton;
	

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		tempToInt=JOptionPane.showInputDialog("Enter a positive number");
		numOfButtons= Integer.parseInt(tempToInt);
	
		
		if(numOfButtons>673) {
			numOfButtons=672;
		}
	
		
		buttonFormation= new JButton[numOfButtons];
		for (int i = 0; i < buttonFormation.length; i++) {
			buttonFormation[i]=new JButton();
			 buttonFormation[i].addActionListener(this);
			 panel.add(buttonFormation[i]);
		}
		
		
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		
		
		// 12. Give the user the instructions for the game.
	
		JOptionPane.showMessageDialog(null, "START?");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		Random randomButton = new Random();
		hiddenButton=randomButton.nextInt(numOfButtons);
		System.out.println(hiddenButton);
		buttonFormation[hiddenButton].setText("HELP");
		// 14. Set the text of the JButton located at hiddenButton to read "ME"
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		// 15. Use Thread.sleep(100); to pause the program.
		buttonFormation[hiddenButton].setText("");
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		if(e.getSource()==buttonFormation[hiddenButton]) {
			JOptionPane.showMessageDialog(null,"Congragul-*****-lations, you won");
		}
		if(e.getSource()!=buttonFormation[hiddenButton]) {
			JOptionPane.showMessageDialog(null,"Oh gee darn, you suck");
		}
		// 17. if the hiddenButton is clicked, tell the user that they win.

		// 18. else tell them to try again
		
	}
}
