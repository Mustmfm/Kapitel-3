import javax.swing.*;
/*
Räkna moms på varor
Mustafa abdulrazzaq
10/2/2017
*/
public class ovning3_5{
 	public static void main(String[] args) {

 		String pris,moms;
 		int momsSats;
 		double pris2,prisUtanMoms,moms2, endastMoms;

	

 		pris=JOptionPane.showInputDialog(null, "Hur mycket kostar varan?");
		pris2= Double.parseDouble(pris); 

		moms=JOptionPane.showInputDialog(null,"Hur mycket procent ar momsen?");
		momsSats=Integer.parseInt(moms);

		moms2 = momsSats / 100.0;
		endastMoms = pris2 * moms2;
		prisUtanMoms = pris2 - endastMoms;

		JOptionPane.showMessageDialog(null, "Momsen pa varan ar " + endastMoms+ "kr" + 
										"\n Priset pa varan utan moms ar"+ prisUtanMoms+ "kr");

 	}
}





 		