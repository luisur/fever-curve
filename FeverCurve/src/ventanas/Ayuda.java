package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import j_Snake.PanelMain.Serpiente.Serpiente;

public class Ayuda extends JDialog implements ActionListener {

	private Ayuda ventana = this;
	private final JPanel panelAyuda = new JPanel();
	
	public Ayuda (){
		 setTitle("Ayuda");
	        //setBounds(x,y,a,b)
			setBounds(100, 100, 600, 465);
			// Indica el borde de el panel
			getContentPane().setLayout(new BorderLayout());
			panelAyuda.setLayout(new FlowLayout());
			panelAyuda.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(panelAyuda, BorderLayout.CENTER);
			{
				JScrollPane scrollPane = new JScrollPane();
				JTextArea textArea = new JTextArea();
				textArea.setEditable(false);
				//Indica el color, en caso de querer cambiar el color a el el fondo de el panel
				// cambiar los numeros
				textArea.setBackground(new Color(179, 236, 247));
				//El tipo de letra
				textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
				scrollPane.setViewportView(textArea);
				textArea.setRows(30);//largura del jpanel
				textArea.setColumns(50);//ancho de jpanel
				panelAyuda.add(scrollPane);
				textArea.setText("\n                                  Snake\n                               ---------------\n\n" +
						"     Pulsa jugar.\n" +
						"     Este boton te llevara a una ventana en la que tendras que elegir la dificultad. \n" +
						"     Los niveles se diferencian por el nuemro de bombas existentes. \n"+
						"     El ordenador genera estas bombas aleatoriamente. \n "+
						"     La mision de la serpiente es comer las maximas frutas posibles. \n"+
						"     Cada vez que la serpiente come una fruta se incrementa en uno su longitud. \n"+
						"     Cada vez que la serpiente come una fruta se suma 20 al contador.\n"+
						"     Al morir aparecera una ventana en la que se indique la puntuacion total obtenida.\n"); 
				
						     
				textArea.setCaretPosition(0);   

			}
			{
				// Creamos ademas de el panel, el boton OK
				// para cuando hayamos terminado de leer la ayuda cerrar el panel
				JPanel buttonPane = new JPanel();
				buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					JButton okButton = new JButton("OK");
					okButton.setActionCommand("ok");
					okButton.addActionListener(this);
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
				}
			}
			setVisible(true);
		}
		
		
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equalsIgnoreCase("ok")) {
				ventana.dispose();
			}		
		
	}
}
