package biblioteca;

import javax.swing.*; 

public class InterfazVentana extends JFrame {
	

	public InterfazVentana() { 		//contructor para que la ventana se inicialice
	} 
	

	public static void main (String args[]) 
	{ 
	JFrame Ventana = new JFrame("Biblioteca Alejandrina" ); 	// se llama a la clase y se crea el objeto ventana
	Ventana.setVisible(true); 									//le decimos al compilador que queremos que la ventana sea visible 
	Ventana.setSize(680,480);  									// le configuro el tamño
	Ventana.setDefaultCloseOperation(EXIT_ON_CLOSE); 			// le decimos que al dar clic en la X se cierre nuestra ventana 
	} 
	
	
	private static final long serialVersionUID = 1L;
	
	} 
	
	
	


