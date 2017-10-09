import javax.swing.*;
/*
Räkna sec till h och min och sec 
Mustafa abdulrazzaq
10/2/2017
*/
public class ovning3_6{
 	public static void main(String[] args) {
 		String h; 
 		int tid;
 		double h2,min2,sec2;

 		h = JOptionPane.showInputDialog(null, "Hur många secunder?");
 		tid = Integer.parseInt(h);



 		h2 = tid/3600;
 		tid = tid%3600;
 		min2 = tid / 60;
 		sec2= tid%60;

 		JOptionPane.showMessageDialog(null, h2 +" Timmar"+min2 + " minuter"+sec2 + " Secunder");
 	}
}