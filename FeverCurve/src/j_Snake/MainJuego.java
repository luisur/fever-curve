

package j_Snake;
import j_Snake.PanelMain.miPanel;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;
import javax.swing.JFrame;


public class MainJuego extends JApplet implements KeyListener{
     
	private final int IZQUIERDA = 37;
    private final int DERECHA = 39;
    private final int ARRIBA = 38;
    private final int ABAJO = 40;
    
   
	private int nivel;
	public MainJuego(int i){
		nivel=i;
	}
    public void init() {
        setSize(540,540);
        Container cpane=getContentPane();
        
        
        
        cpane.add(snakePanel);
        addKeyListener(this);
              
    }
   
    public static void main(String[] args) {
        
        MainJuego my_Game=new MainJuego(1);
        JFrame myFrame=new JFrame(" Juego Snake ");
        myFrame.setSize(300,300);
        myFrame.getContentPane().add(my_Game);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.addKeyListener(my_Game);
        my_Game.init();
        my_Game.start();
        my_Game.setVisible(true);
        myFrame.setVisible(true);
        
    }
    
    public void keyTyped(KeyEvent e) {
    }
    
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==ARRIBA) {
            snakePanel.set_Direction(1);
        } else if (e.getKeyCode()==DERECHA) {
            snakePanel.set_Direction(2);
        } else if(e.getKeyCode()==ABAJO) {
            snakePanel.set_Direction(3);
        } else if(e.getKeyCode()==IZQUIERDA) {
            snakePanel.set_Direction(4);
        }
    }
    
    public void keyReleased(KeyEvent e) {
    }
   
    private   miPanel snakePanel=new miPanel(nivel);
}
