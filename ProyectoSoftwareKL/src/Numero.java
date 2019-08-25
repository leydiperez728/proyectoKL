/*Leer un numero e indicar si es positivo o negativo
 * el proceso se repetirá hasta que introduzca un cero
*/


import javax.swing.JOptionPane;

public class Numero {
	public static void main(String[] args) {
		int numero; 
				
		numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero "));
					
		while (numero !=0) {
			if(numero>0)
				JOptionPane.showMessageDialog(null,"El numero es positivo ");
			else {
				JOptionPane.showMessageDialog(null,"El numero es negativo ");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero "));
		}
	
	}
}