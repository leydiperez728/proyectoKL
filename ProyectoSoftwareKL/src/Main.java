import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int uno;
		int dos;
		int rta;
		
		uno = Integer.parseInt(JOptionPane.showInputDialog("digite un numero "));
		dos = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero "));
		
		rta=uno+dos;
		
		System.out.println("la rta es: " +rta);
	}

}
