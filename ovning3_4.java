import javax.swing.*;
/*
vissa kosnad
Mustafa abdulrazzaq
10/2/2017
*/
public class ovning3_4{
 	public static void main(String[] args) {

	String minuter, kosnad;
	int minuter2;
	Double kosnad2, pris;

	minuter = JOptionPane.showInputDialog(null," Hur manga minuter ringer du per manaf?");
	minuter2 = Integer.parseInt(minuter);

	kosnad = JOptionPane.showInputDialog(null,"Hur mycket kostar det per minut?");
	kosnad2 = Double.parseDouble(kosnad);

	pris=kosnad2*minuter2;

		JOptionPane.showMessageDialog(null, "Du betalar"+pris+"kr varje manad");
 	}
 }