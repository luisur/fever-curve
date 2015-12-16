package j_Snake.PanelMain.Serpiente;

import javax.swing.JOptionPane;

public class Serpiente2 {

	
	
	private int headZ=60;
    private int headJ=60;
    private int[] PostionsZ=new int[300];
    private int[] PostionsJ=new int[300];
    private int snake_length2=5;
    private final int tamaño_Objeto=20;
	    
	    
    public Serpiente2() {
        for(int i=0;i<snake_length2;i++) {
            PostionsZ[i]=60;
            PostionsJ[i]=60;
	            
        }
    }
	    
	    public   void Mover_snake2() {
	        for(int i=0;i<snake_length2;i++) {
	            PostionsZ[snake_length2-i]=PostionsZ[snake_length2-(i+1)];
	            PostionsJ[snake_length2-i]=PostionsJ[snake_length2-(i+1)];
	            
	            
	        }
	        
	        PostionsZ[0]=headZ;
	        PostionsJ[0]=headJ;
	      
	    }
	    
	  
	    public    void ponerPosicionCabeza(int x,int y) {
	        headZ+=x;
	        headJ+=y;
	        
	    }
	    public    boolean check_game_over() {
	        for(int i=1;i<snake_length2;i++)
	            
	        {
	            if((PostionsZ[i]==headZ)&&(PostionsJ[i]==headJ)) {
	                
	                
	                return true;
	            }
	        }
	        if(headZ<0||headZ>1150||headJ<0||headJ>650) {
	            
	            return true;
	        }
	        
	        return false;
	    }
	    
	    public boolean compararConLaPosicionFruta2(int z,int j) {
	        
	        for(int i=0;i<snake_length2;i++) {
	            if(z==PostionsZ[i]&&j==PostionsJ[i]) {
	                return true;
	            }
	        }
	        
	        return false;
	    }
	    
	 public boolean compararConLaPosicionBomba2(int z,int j) {
	        
	        for(int i=0;i<snake_length2;i++) {
	            if(z==PostionsZ[i]&&j==PostionsJ[i]) {
	                return true;
	            }
	        }
	        
	        return false;
	    }
	    
	    public synchronized void Increase_lenght2() {
	        snake_length2++;
	    }
	    
	    public int get_lenght2() {
	        return snake_length2;
	    }
	    
	    public int get_tamaño_Objeto2() {
	        return tamaño_Objeto;
	    }
	    
	    
	    
	    public int[] get_All_postionsZ() {
	        return PostionsZ;
	    }
	    
	    public int[] get_All_postionsJ() {
	        return PostionsJ;
	    }
	    
	    public int getHeadZ() {
	        return  PostionsZ[0];
	    }
	    public int getHeadJ() {
	        return  PostionsJ[0];
	    }
	    
	   
	    
	}


