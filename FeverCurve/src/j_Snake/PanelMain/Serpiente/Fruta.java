
package j_Snake.PanelMain.Serpiente;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Float;
import java.util.Random;



public class Fruta {
    
    
    public Fruta() {
    	Posicion_Fruta.setLocation((((int)((Math.random()*(4200)))%50)*20),((((int)(Math.random()*(1000)))%50)*20));
        int x=(int)Posicion_Fruta.getX();
        int y=(int)Posicion_Fruta.getY();
        
        while(x>1200||y>700) {
        	Posicion_Fruta.setLocation((((int)((Math.random()*(4200)))%50)*20),((((int)(Math.random()*(1000)))%50)*20));
            x=(int)Posicion_Fruta.getX();
            y=(int)Posicion_Fruta.getY();
        }
        
    }
    public void getFruta() {
       
    	Posicion_Fruta.setLocation((((int)((Math.random()*(4200)))%50)*20),((((int)(Math.random()*(4000)))%50)*20));
        
        
        
    }
    public double getX() {
        return Posicion_Fruta.getX();
    }
    public double getY() {
        return Posicion_Fruta.getY();
    }
    
    public int get_int_X() {
        return (int)Posicion_Fruta.x;
    }
    public int get_int_Y() {
        return (int)Posicion_Fruta.y;
    }
    
    
    Point2D.Float Posicion_Fruta =new Point2D.Float();
    Random Crear_Fruta =new Random();
    
    
}
