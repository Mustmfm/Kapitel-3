import javax.swing.*;
/*
rita ut cirkelns radie
Mustafa abdulrazzaq
10/2/2017
*/
public class ovning3_3{
 	public static void main(String[] args) {
 		String radien;
 		int radien2;
 		double pi, area, omkrets;

	pi=3.1415926536;

 		radien=JOptionPane.showInputDialog(null, "Skriv radien på din cirkel");
		radien2= Integer.parseInt(radien); 		




 		area = radien2 * radien2 * pi;
 		omkrets = radien2 * 2 * pi;
 		JOptionPane.showMessageDialog(null," area ar " + area +"\n omkretsen ar "+ omkrets);
 	}
 }