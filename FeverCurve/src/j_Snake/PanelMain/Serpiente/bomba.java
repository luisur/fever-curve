package j_Snake.PanelMain.Serpiente;

import java.awt.geom.Point2D;
import java.util.Random;

/**public class bomba {
	
	 public bomba() {
		 
		 posicion_Bomba.setLocation((((int)((Math.random()*(100)))%20)*20),((((int)(Math.random()*(10)))%20)*20));
	        int x=(int)posicion_Bomba.getX();
	        int y=(int)posicion_Bomba.getY();
	        
	        while(x>260||y>260) {
	        	posicion_Bomba.setLocation((((int)((Math.random()*(100)))%20)*20),((((int)(Math.random()*(10)))%20)*20));
	            x=(int)posicion_Bomba.getX();
	            y=(int)posicion_Bomba.getY();
	        }
	        
	    }
	    public void getbomba() {
	       
	    	posicion_Bomba.setLocation((((int)((Math.random()*(100)))%20)*20),((((int)(Math.random()*(10)))%20)*20));
	        
	        
	        
	    }
	    public double getX() {
	        return posicion_Bomba.getX();
	    }
	    public double getY() {
	        return posicion_Bomba.getY();
	    }
	    
	    public int get_int_X() {
	        return (int)posicion_Bomba.x;
	    }
	    public int get_int_Y() {
	        return (int)posicion_Bomba.y;
	    }
	    
	    
	    Point2D.Float posicion_Bomba =new Point2D.Float();
	    Random Crear_Bomba =new Random();
	    
	    
}
*/
