package ProyectoSistemaAutobuses
import java.io.*;
public class ProyectoSistemaAutobuses{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        String salir="",pausa;
        String destinos[]=new String[6];  
         String destinos1[]=new String[6];    
        String camiones []=new String [6];
        String camiones1 []=new String [6];
        String nombre [] =new String [6] ;
        String nombre1 [] =new String [6] ;
        String ni_ad []= new String [6];
        String ni_ad1 []= new String [6];
        int edad [] = new int [6];
        int edad1 [] = new int [6];
        int asiento1[]=new int[6];
        int asiento2[]=new int[6];
        int valor [] =new int[6];
        int valor1 [] =new int[6];
        int precio_a1=0, precio_a2=0,precio_n1=0,precio_n2=0, opc=0,opc1, opc2, _asiento, x1=0;
        // x lleva el control de los asientos
        int x=0,buscar,z=0,selec=0;
        String  camione1="", camione2="", destino1="1",destino2="2", adulto="ADULTO", niño="NIÑO";
       
       
      do{
          metodos.menu_p();
          opc=metodos.pideEnteros("\t\t\tescoja una opcion ");
            switch (opc)
        {
            case 1 :
                metodos.cls();
                do{ 
                metodos.menu1();
                opc2=metodos.pideEnteros("\t\t\t elige una opcion ");
                switch(opc2){
                    case 1:
                        metodos.cls();
                        do{
                           
                        opc=metodos.pideEnteros("\t\t\t1.-precios para destino "+destino1+
                                "\n\t\t\t2.-precios para destino "+destino2+
                                "\n\t\t\telije una opcion ");
                        }while(opc!=1 && opc!=2);
                        metodos.cls();
                        if(opc==1){
                                precio_a1=metodos.pideEnteros("\t\t\tcual es el precio para el adulto ");
                                metodos.cls();
                                precio_n1=metodos.pideEnteros("\t\t\tcual es el precio para el niño ");
                        }
                        
                        else{
                                metodos.cls();
                                precio_a2=metodos.pideEnteros("\t\t\tcual es el precio para el adulto ");
                                metodos.cls();
                                precio_n2=metodos.pideEnteros("\t\t\tcual es el precio para el niño ");  
                            }
                        break;
                    case 2:
                                metodos.cls();
                                destino1=metodos.pidestring("\t\t\tcual es el primer destino ");
                                destino2=metodos.pidestring("\t\t\tcual es el segundo destino ");                            
                        break;
                    case 3:
                                metodos.cls();
                                camione1=metodos.pidestring("\t\t\tcual es el nombre del camion del destino 1 ");
                                camione2=metodos.pidestring("\t\t\tcual es el nombre del camion del destino 2 ");
                        break;
                    case 4:
                                System.out.println("\t\t\tsaliendo");
                        break;
                    default :
                                System.out.println("\t\t\topcion no valida");
                        break;
                                }
                }while(opc2!=4);
                
        break;
            case 2 :
                metodos.cls();
                do{
                metodos.menu2();
                opc1=metodos.pideEnteros("\t\t\tcual es su eleccion ");
                switch(opc1)
                {
                    case 1:
                        metodos.cls();
                        do{
                             z=0;
                            _asiento=metodos.pideEnteros("\t\t\tcual asiento elije ");
                             while(_asiento<1 || _asiento>3)
                             _asiento=metodos.pideEnteros("\t\t\tlugar invalido solo de 1 a 3\n\t\t\tcual asiento elije ");
                             System.out.println("\t\t\tdestinos disponibles \n\t\t\t1.-"+destino1+"\n\t\t\t2.-"+destino2);
                             selec=metodos.pideEnteros("\t\t\t ");
                                                switch(selec)
                                                {
                                                    case 1: 
                                                while(z<x && _asiento!=asiento1[z])
                                                                z++;
                                                        if(z>=x){      
                                                                nombre[x]=metodos.pidestring("\t\t\tingresa el nombre del cliente "); 
                                                                System.out.println("\t\t\tapartir de los 15 años el cliente se cuenta como adulto");
                                                                edad[x]=metodos.pideEnteros("\t\t\tingrese la edad");
                                                                destinos[x]=destino1;
                                                                camiones[x]=camione1;
                                                                valor[x]=(edad[x]>14)? precio_a1:precio_n1;
                                                                asiento1[x]=_asiento;                                                        
                                                                ni_ad[x]=(edad[x]>14)? adulto:niño;
                                                                x++;
                                                        }
                                                        else
                                                                System.out.println("\t\t\tlugar ocupado");
                                                            break;
                                                    case 2:
                                                    while(z<x1 &&_asiento!=asiento2[z])
                                                        z++;
                                                    if(z>=x1){
                                                                nombre1[x1]=metodos.pidestring("\t\t\tingresa el nombre del cliente "); 
                                                                System.out.println("\t\t\tapartir de los 15 años el cliente se cuenta como adulto");
                                                                edad1[x1]=metodos.pideEnteros("\t\t\tingrese la edad");
                                                                destinos1[x1]=destino1;
                                                                camiones1[x1]=camione1;
                                                                valor1[x1]=(edad1[x1]>14)? precio_a2:precio_n2;
                                                                asiento2[x1]=_asiento;                                                        
                                                                ni_ad1[x1]=(edad1[x1]>14)? adulto:niño;
                                                                x1++;
                                                            }
                                                    else
                                                                System.out.println("\t\t\tlugar ocupado");
                                                    break;
                                                    default :
                                                        System.out.println("\t\t\tdestino no valido");
                                                        break;
                                                }
                               
                        salir=metodos.pidestring("\t\t\tdesea registrar otro cliente ");
                        }while(salir.equals("si"));
                        
                        break;
                    case 2:
                        metodos.cls();
                        selec=metodos.pideEnteros("\t\t\t en que destino quiere buscar \n\t\t\t1.-"+destino1+"\n\t\t\t2.-"+destino2);
                        buscar=metodos.pideEnteros("\t\t\tingresa el asiento del cliente a buscar ");
                        z=0;
                        if(selec==1)
                        {
                        while(z<x && buscar!=asiento1[z])
                                        z++;
                                if(z>=x)    System.out.println("\t\t\tno existe");
                                else{       System.out.println("\t\t\ttitular: "+nombre[z] );
                                            System.out.println("\t\t\tedad: "+edad[z] );
                                            System.out.println("\t\t\tprecio: "+valor[z] );
                                            System.out.println("\t\t\tdestino: "+ destinos[z]);
                                            System.out.println("\t\t\tcamion: "+ camiones[z]);                
                                    }
                                                         
                        }
                        else
                            if(selec==2)
                            {
                                while(z<x1 && buscar!=asiento2[z]){
                                        z++;
                                if(z>=x)    System.out.println("\t\t\tno existe");
                                else{       System.out.println("\t\t\ttitular: "+nombre1[z] );
                                            System.out.println("\t\t\tedad: "+edad1[z] );
                                            System.out.println("\t\t\tprecio: "+valor1[z] );
                                            System.out.println("\t\t\tdestino: "+ destinos1[z]);
                                            System.out.println("\t\t\tcamion: "+ camiones1[z]);                
                                    }
                                                         }
                            }
                        pausa=metodos.pidestring("\t\t\tenter...");
                        break;
                    case 3:
                        //eliminar este caso
                            metodos.cls();
                        for(z=0;z<x;z++)
                        {
                                            System.out.println("\t\t\tasiento :"+asiento1[z]);
                                            System.out.println("\t\t\ttitula  :"+nombre[z] );
                                            System.out.println("\t\t\tedad    :"+edad[z] );
                                            System.out.println("\t\t\tprecio  :"+valor[z] );
                                            System.out.println("\t\t\tdestino :"+ destinos[z]);
                                            System.out.println("\t\t\tcamion  :"+ camiones[z]);  
                       }
                        for(z=0;z<x1;z++)
                        {
                                            System.out.println("\t\t\tasiento :"+asiento2[z]);
                                            System.out.println("\t\t\ttitula  :"+nombre1[z] );
                                            System.out.println("\t\t\tedad    :"+edad1[z] );
                                            System.out.println("\t\t\tprecio  :"+valor1[z] );
                                            System.out.println("\t\t\tdestino :"+ destinos1[z]);
                                            System.out.println("\t\t\tcamion  :"+ camiones1[z]);  
                           }
                          
                           pausa=metodos.pidestring("\t\t\tenter...");    
                        break;
                    case 4:
                        metodos.cls();
                         selec=metodos.pideEnteros("\t\t\t en que destino quiere cancelar \n\t\t\t1.-"+destino1+"\n\t\t\t2.-"+destino2);
                        buscar=metodos.pideEnteros("\t\t\tingresa el asiento del cliente a cancelar ");
                        z=0;
                        if(selec==1)
                        {
                        while(z<x && buscar!=asiento1[z])
                                        z++;
                                if(z>=x)    
                                    System.out.println("\t\t\tno existe");
                                else{       
                                    asiento1[z]=0;
                                    nombre[z]="cancelado";
                                    edad[z]=0;
                                    valor[z]=0;
                                    
                                    //agregar que se cancelo
                                    }
                                 pausa=metodos.pidestring("\t\t\tenter...");
                                                         
                        }
                        
                        else
                            if(selec==2)
                            {
                                while(z<x1 && buscar!=asiento2[z])
                                        z++;
                                if(z>=x)    
                                    System.out.println("\t\t\tno existe");
                                else{                                         
                                    asiento2[z]=0;
                                    nombre1[z]="cancelado";
                                    edad1[z]=0;
                                    valor1[z]=0;
                                    }
                                 pausa=metodos.pidestring("\t\t\tenter...");
                                                                    
                            }
                        else
                                pausa=metodos.pidestring("\t\t\topcion no valida");
                        break;
                    case 5:
                        metodos.cls();
                        System.out.println("\t\t\tsaliendo bye");
                    default :
                        System.out.println("\t\t\topcion no valida");
                        break;
                }
                }while(opc!=5);
                break;
            default :
                System.out.println("\t\t\topcion no valida");
                
        }
      }while(opc!=3);
      }
        
    }
    

class metodos{
	private static   BufferedReader leer = new BufferedReader
											(new InputStreamReader(System.in));
	public static String pidestring (String mensaje)  throws IOException
	{
		String cadena;
		System.out.print(mensaje);
		cadena=leer.readLine();
		return(cadena);
	}
	public static int pideEnteros(String mensaje) throws IOException{
		int numero=-1;
		while (numero<0)
		{
			System.out.print(mensaje);
			try{
			numero=Integer.parseInt(leer.readLine());
			}
		catch(Exception e){
			System.out.print("\t\t\tdebe de ingresar un numero ");
			numero=-1;
			}
		}
		return(numero);
	}
	public static double pidedouble(String mensaje) throws IOException{
		double numero=-1;
		while (numero<0)
		{
			System.out.print(mensaje);
			try{
			numero=Double.parseDouble(leer.readLine());
			}
		catch(Exception e){
			System.out.print("\t\t\tdebe de ingresar un numero double");
			numero=-1;
			}
		}
		return(numero);
	}
	public static void cls(){
		//Limpiar pantalla en java
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	

}


   public static void menu2() throws IOException
    {
          metodos.cls();
        System.out.println("\t\t\t\t menu");
               System.out.println("\t\t\t\t menu");
               System.out.println("\t\t\t 1.-registrar cliente");
               System.out.println("\t\t\t 2.-imprimir boleto de nuevo");
               System.out.println("\t\t\t 3.-ver todos los viajes");
               System.out.println("\t\t\t 4.-cancelar viaje");
               System.out.println("\t\t\t 5.-salir");

    }
    public static void menu1() 
    {
          metodos.cls();
        System.out.println("\t\t\t\t menu");
        System.out.println("\t\t\t1.- ingresar precios");
        System.out.println("\t\t\t2.- ingresar destinos");
        System.out.println("\t\t\t3.- ingresar camiones");
        System.out.println("\t\t\t4.- salir");
    }
    public static void menu_p()

    {
        metodos.cls();
        System.out.println("\t\t\t1.- inicializar datos");
        System.out.println("\t\t\t2.- acciones del cliente");
        System.out.println("\t\t\t3.- salir");
    }
    
}