package ventanas;

import j_Snake.MainJuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ejecutar_Juego.ejecutarJuego;


public class panelDificultad extends JPanel implements ActionListener{
	

	 JPanel jp1, jp2, jp3;
	 JButton jb1, jb2, jb3, jbP1, jbP2, jbP3;    
	 
	    public panelDificultad(){
	 System.out.println("panelDificultad");
	        JFrame jfM = new JFrame("Elegir la dificultad");  
	        jfM.setLayout(null);
	 
	 
	        
	        jbP1 = new JButton("Facil");
	        jbP1.addActionListener(this);
	        jbP2 = new JButton("Medio");
	        jbP2.addActionListener(this);
	        jbP3 = new JButton("Dificil");
	        jbP3.addActionListener(this);
	 

	 
	        jbP1.setBounds(300, 100, 150, 50); jbP2.setBounds(300, 200, 150, 50); jbP3.setBounds(300,300, 150, 50); 
	 

	        jfM.add(jbP1); jfM.add(jbP2); jfM.add(jbP3);
	 
	        
	        jfM.setLocation(100, 50);
	        jfM.setResizable(false);
	        jfM.setVisible(true);
	        jfM.setSize(800, 600);
	        jfM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	    }
	    
	    public static void main(String[] args) {        
	        panelPrincipal mP = new panelPrincipal();//uso de constructor para la ventana
	    }
	    
	    public void empezar(int i){
	    	
	    	
	    	MainJuego my_Game=new MainJuego(i);
	        JFrame myFrame=new JFrame(" ¡¡A jugar!! ");
	        myFrame.setSize(1200,700);
	        myFrame.getContentPane().add(my_Game);
	        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        myFrame.addKeyListener(my_Game);
	        
	        my_Game.init();
	        my_Game.start();
	        my_Game.setVisible(true);
	        myFrame.setVisible(true);
	    }
	    
	 
	    public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
	   	 
	    	JButton botonPulsado = (JButton) e.getSource();
	    	if(botonPulsado== jbP1){
	    		this.setVisible(false);
	    		empezar(1);
	    	}
	    	if(botonPulsado== jbP2){
	    		this.setVisible(false);
	    		empezar(2);
	    	}
	    	if(botonPulsado== jbP3){
	    		this.setVisible(false);
	    		empezar(3);
	    	}
	    }
}
