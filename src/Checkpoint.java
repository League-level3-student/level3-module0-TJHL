import javax.swing.JOptionPane;

public class Checkpoint {

	public static void main(String[] args) {
		double number=0;
		int numOfInts=0;
		String input;
		double total=0;
		double average=0;
		input=JOptionPane.showInputDialog("How many things do you want to calculate");
		numOfInts=Integer.parseInt(input);
		double[] whank = new double[numOfInts];
		for (int i = 0; i < whank.length; i++) {
		input=	JOptionPane.showInputDialog("GIVE ME CRAP");
		
		number=Integer.parseInt(input);
		
		whank[i]=number;
		}
		for (int i = 0; i < whank.length; i++) {
			total =total+ whank[i];
		}
	
		average=total/(whank.length);
		
		JOptionPane.showMessageDialog(null,"TOTAL: "+total +"\n Average: "+average);
	}
}
