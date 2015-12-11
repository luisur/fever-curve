package ventanas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ventanas.Ayuda;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class panelPrincipal extends JPanel implements ActionListener{


	
	 JPanel jp1, jp2, jp3;
	 JButton jbP1, jbP2, jbP3;    
	 
	    public panelPrincipal(){
	 System.out.println("panelPrincipal");
	        JFrame jfM = new JFrame("Juego snake");  
	        jfM.setLayout(null);
	 
	        
	       
	        jbP1 = new JButton("JUGAR");
	        jbP1.setBackground(java.awt.Color.yellow);
	        jbP1.addActionListener(this);
	        jbP2 = new JButton("Salir");
	        jbP2.setBackground(java.awt.Color.cyan);
	        jbP2.addActionListener(this);
	        jbP3 = new JButton("Ayuda"); 
	        jbP3.setBackground(java.awt.Color.green);
	        jbP3.addActionListener(this);
	 

	        
	        jbP1.setBounds(300, 100, 150, 50); jbP2.setBounds(300, 350, 150, 50); jbP3.setBounds(300,215, 150, 50); 
	 

	        jfM.add(jbP1);
	        jfM.add(jbP2); 
	        jfM.add(jbP3);
	        
	        
	        jfM.setLocation(200, 50);
	        jfM.setResizable(false);
	        jfM.setVisible(true);
	        jfM.setSize(800, 600);
	        jfM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	 
	   
	    public static void main(String[] args) {        
	        panelPrincipal mP = new panelPrincipal();//uso de constructor para la ventana
	    }
	 
	    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
	 
	    	JButton botonPulsado = (JButton) e.getSource();
	    	if(botonPulsado== jbP1){
	    		
	    		this.setVisible(false);
	    		new panelDificultad();
	    	}
	    	if(botonPulsado== jbP3){
	    		
	    		this.setVisible(false);
	    		new Ayuda();
	    	}
	    	if(botonPulsado== jbP2){
	    		
	    		this.setVisible(false);
	    	    System.exit(0);
	    	  
	    }

}
}
	

