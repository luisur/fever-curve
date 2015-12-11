

package ejecutar_Juego;

import javax.swing.JOptionPane;

import ventanas.panelPrincipal;
import j_Snake.PanelMain.Serpiente.Fruta;
//import j_Snake.PanelMain.Serpiente.bomba;
import j_Snake.PanelMain.Serpiente.Serpiente;
import j_Snake.PanelMain.Serpiente.bomba;


public class ejecutarJuego {

	private int direccion=2;
	private boolean Game_Over;
	private boolean Moving_vertical=false;
	private Serpiente snake=new Serpiente();
	private Serpiente snake2= new Serpiente();
	private final Fruta snakeFruta=new Fruta();
	private final bomba snakebomba =new bomba();
	private int step_to_move=20;    
	private int Score;
	private  int contadorMov=0;


	public ejecutarJuego() 
	{

	}

	public   void Mover_mySnake(int newDireccion,boolean Comer_Fruta,boolean Comer_bomba, int numSnake)
	{

System.out.println("ejecutarJuego");
		if(!Game_Over)
		{

			switch(newDireccion)
			{
			case 1:    if(direccion!=3)
			{
				snake.ponerPosicionCabeza(0,-step_to_move);
				direccion=1;
			}
			else move_as_last(direccion);
			break;//ARRIBA

			case 2:   if(direccion!=4)   
			{
				snake.ponerPosicionCabeza(step_to_move,0);
				direccion=2; 
			}
			else move_as_last(direccion);
			break;//DERECHA
			case 3:    
				if(direccion!=1)
				{
					snake.ponerPosicionCabeza(0,step_to_move);
					direccion=3;
				}
				else move_as_last(direccion);
				break;//ABAJO

			case 4:   
				if(direccion!=2)
				{
					snake.ponerPosicionCabeza(-step_to_move,0);
					direccion=4; 
				}
				else move_as_last(direccion);

				break;//IZQUIERDA
			} 

			if(contadorMov==5)
			{
				snake.Increase_lenght();// Si la serpiente come la fruta
				contadorMov=0;
			}
			snake.Mover_snake();
			contadorMov++;

			if((snake.getHeadX()==snakeFruta.get_int_X())&&(snake.getHeadY()== snakeFruta.get_int_Y()))
			{
				snakeFruta.getFruta();
				Score+=20;

				snake.Increase_lenght();
				while(check_Fruta_place())
				{
					snakeFruta.getFruta();    
				}

			}

			Game_Over=snake.check_game_over();


		}
		if(Game_Over)
		{
			JOptionPane.showConfirmDialog(null,"Puntuacion = "+Integer.toString(Score),"Puntuaion partida",JOptionPane.DEFAULT_OPTION);
		}
	}


	//        if(Comer_bomba)
	//        {
	//        	    snake.check_game_over();
	//        }
	//     snake.Mover_snake();


	//   if((snake.getHeadX()==snakebomba.get_int_X())&&(snake.getHeadY()== snakebomba.get_int_Y()))
	//    {
	//        snakebomba.getbomba();
	//        JOptionPane.showConfirmDialog(null,"Puntuacion = "+Integer.toString(Score),"Puntuaion partida",JOptionPane.DEFAULT_OPTION);
	//       
	//      //  System.exit(0);
	//        	
	//            
	//        }
	//    }*/
	public void move_as_last(int diirec)
	{
		switch(direccion)
		{
		case 1:    

			snake.ponerPosicionCabeza(0,-step_to_move);


			break;//ARRIBA

		case 2:    
			snake.ponerPosicionCabeza(step_to_move,0);

			break;//DERECHA
		case 3:    

			snake.ponerPosicionCabeza(0,step_to_move);

			break;//ABAJO

		case 4:   

			snake.ponerPosicionCabeza(-step_to_move,0);


			break;//IZQUIERDA
		} 


	}
	public int[] return_Snake_postionsX()
	{
		return snake.get_All_postionsX();
	}
	public int[] return_Snake_postionsY()
	{
		return snake.get_All_postionsY();
	}

	public int get_tamaño_Objeto()
	{
		return snake.get_tamaño_Objeto();
	}

	public int get_my_snake_lenght()
	{
		return snake.get_lenght();
	}
	public void set_step_length()
	{
		step_to_move=5;
	}
	public int get_Fruta_X()
	{
		return (int)snakeFruta.getX();
	}
	public int get_Fruta_Y()
	{
		return (int)snakeFruta.getY();
	}
	public boolean check_Fruta_place()
	{
		int xfruta=(int)snakeFruta.getX();
		int yfruta=(int)snakeFruta.getY();
		if(xfruta>1200 || yfruta>700)return true;
		else 
			return snake.compararConLaPosicionFruta(xfruta,yfruta);

	}

	public int get_Bomba_X()
	{
		return (int)snakebomba.getX();
	}
	public int get_Bomba_Y()
	{
		return (int)snakebomba.getY();
	}
	public boolean check_bomba_place()
	{
		int xbomba=(int)snakebomba.getX();
		int ybomba=(int)snakebomba.getY();
		if(xbomba>260 || ybomba>260)return true;
		else 
			return snake.compararConLaPosicionBomba(xbomba,ybomba);

	}

	public boolean get_Game_over()
	{
		return Game_Over;
	}


}



