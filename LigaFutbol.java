package ligafutbol;

//Reynaldo Paredes Miranda
import java.io.*;

public class Ligafutbol {


    public static void main(String[] args) throws IOException {
        int opc, opc2,e,numero,numero2,y , x=0, xJ1=0,xJ2=0,xJ3=0,xJ4=0,xJ5=0, w=0, w1=0, xP=0;
        String enter, nombre, estadio;
        equipo Arrayequip []= new equipo[5];
        jugador jug1 [] =new jugador[5];
        jugador jug2 [] =new jugador[5];
        jugador jug3 [] =new jugador[5];
        jugador jug4 [] =new jugador[5];
        jugador jug5 [] =new jugador[5];
        partido par [] = new partido[20];
      do{
        enter=read.pidestring("\t\t\t");
        read.cls();
        read.datos();
        read.menu();
        opc=read.pideEnteros("\t\t\tselecione una");

        switch(opc)
                {
       
            case 1:
                do{
                //registrar jugadores
                enter=read.pidestring("\t\t\t");
                read.cls();
                read.datos();
                read.menu2();
                enter=read.pidestring("\t\t\tregistrar equipos, partidos y resultados");
                opc2=read.pideEnteros("\t\t\tselecione una");
                switch(opc2)
                {
                    case 1:
                        //registar equipos y jugadores
                        enter=read.pidestring("\t\t\tregistrar equipos y jugadores");
                            switch(x)
                            {
                                case 0:
                            nombre=read.pidestring("\t\t\tcual es el nombre del equipo");
                            estadio=read.pidestring("\t\t\tcomo se llama su estadio");
                            Arrayequip[x]=new equipo(nombre,estadio);
                            do{
                                nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug1 [xJ1]= new jugador(nombre,numero,estadio); 
                                e=read.pideEnteros("\t\t\t1.-meter mas jugadores \n2.-salir");
                                while(e!=1 && e!=2)
                                    e=read.pideEnteros("\t\t\tsolo admite 1 y 2");
                                xJ1++;
                            }while(e!=2);
                            x++;
                                    break;
                                case 1:
                            nombre=read.pidestring("\t\t\tcual es el nombre del equipo");
                            estadio=read.pidestring("\t\t\tcomo se llama su estadio");
                            Arrayequip[x]=new equipo(nombre,estadio);
                            do{
                                nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug2 [xJ2]= new jugador(nombre,numero,estadio); 
                                e=read.pideEnteros("\t\t\t1.-meter mas jugadores \n2.-salir");
                                while(e!=1 && e!=2)
                                    e=read.pideEnteros("\t\t\tsolo admite 1 y 2");
                                xJ2++;
                            }while(e!=2);
                            x++;
                                    break;
                                case 2:
                            nombre=read.pidestring("\t\t\tcual es el nombre del equipo");
                            estadio=read.pidestring("\t\t\tcomo se llama su estadio");
                            Arrayequip[x]=new equipo(nombre,estadio);
                            do{
                                nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug3 [xJ3]= new jugador(nombre,numero,estadio); 
                                e=read.pideEnteros("\t\t\t1.-meter mas jugadores \n2.-salir");
                                while(e!=1 && e!=2)
                                    e=read.pideEnteros("\t\t\tsolo admite 1 y 2");
                                xJ3++;
                            }while(e!=2);
                            x++;
                                    break;
                                case 3:
                            nombre=read.pidestring("\t\t\tcual es el nombre del equipo");
                            estadio=read.pidestring("\t\t\tcomo se llama su estadio");
                            Arrayequip[x]=new equipo(nombre,estadio);
                            do{
                                nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug4 [xJ4]= new jugador(nombre,numero,estadio); 
                                e=read.pideEnteros("\t\t\t1.-meter mas jugadores \n2.-salir");
                                while(e!=1 && e!=2)
                                    e=read.pideEnteros("\t\t\tsolo admite 1 y 2");
                                xJ4++;
                            }while(e!=2);
                            x++;
                                    break;
                                case 4:
                            nombre=read.pidestring("\t\t\tcual es el nombre del equipo");
                            estadio=read.pidestring("\t\t\tcomo se llama su estadio");
                            Arrayequip[x]=new equipo(nombre,estadio);
                            do{
                                nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug5 [xJ5]= new jugador(nombre,numero,estadio); 
                                e=read.pideEnteros("\t\t\t1.-meter mas jugadores \n2.-salir");
                                while(e!=1 && e!=2)
                                    e=read.pideEnteros("\t\t\tsolo admite 1 y 2");
                                xJ5++;
                            }while(e!=2);
                            x++;
                                    break;
                                case 5 :
                                    enter=read.pidestring("\t\t\tya no puede  meter mas equipos");
                                    break;
                            }
                           
                        break;
                    case 2:
                        //registrar partidos
                        enter=read.pidestring("\t\t\tregistrar partidos");
                        y=1;
                        for(w=0;w<x;w++)
                        {
                            System.out.println("\t\t\t"+y+".-equipo");
                            Arrayequip[w].muestraEquipo();
                            y++;
                        }
                        numero=read.pideEnteros("\t\t\tque numero de quipo es el local");
                        while(numero>x)
                            numero=read.pideEnteros("\t\t\tsolo admite mayores a 0 y menores a"+x);
                        numero2=read.pideEnteros("\t\t\tque numero de equipo es el visitante");
                        do{
                        if(numero==numero2)
                        {
                            enter=read.pidestring("\t\t\tel visitante no puede ser el mismo equipo ");
                            y=1; 
                            for(w=0;w<x;w++)
                        {

                            System.out.print("\t\t\t"+y+".-equipo");
                            Arrayequip[w].muestraEquipo();
                            y++;
                        }
                        numero2=read.pideEnteros("\t\t\tque numero de quipo es el visitante");
                        while(numero2>x)
                            numero2=read.pideEnteros("\t\t\tsolo admite mayores a 0 y menores a"+x);
                        e=0;
                        }
                        else
                        {
                            enter=read.pidestring("\t\t\taccion realizada");
                            e=1;
                        }
                        }while(e!=1);
                        nombre=read.pidestring("\t\t\ten que fecha se juega el partido");
                        estadio=read.pidestring("\t\t\ta que hora se juega");
                        numero--;
                        numero2--;
                        
                        par[xP]= new partido(Arrayequip[numero].getEquipo(),Arrayequip[numero2].getEquipo(),nombre,estadio,0,0,"pendiente", "");
                        xP++;
                        break;
                    case 3:
                        //registar resultados
                        y=1;
                        for(w=0;w<xP;w++)
                        {
                            System.out.println("\t\t\t"+y+".-partido");
                            par[w].muestraPartido();
                            y++;
                        }
                        numero=read.pideEnteros("\t\t\tque numero de partido desea registrar resultados");
                        while(numero>xP)
                            numero=read.pideEnteros("\t\t\tsolo admite mayores a 0 y menores a"+xP);
                        numero--;
                        y=numero;
                        numero=read.pideEnteros("\t\t\tcual fue el score del equipo local");
                        par[y].setResult1(numero);
                        numero2=read.pideEnteros("\t\t\tcual fue el score del equipo visitante");
                        par[y].setResult2(numero2);
                        par[y].setResul(read.compara(numero,numero2,par[y].getLocal(),par[y].getVisitante()));
                        par[y].setEstado("jugado");
                        break;
                    case 4:
                        //read.datos();
                        //read.menu3();
                        enter=read.pidestring("\t\t\tregresando a menu principal");
                        break;
                    default :
                         //read.datos();
                        //read.menu3();
                        enter=read.pidestring("\t\t\topcion no valida");
                        break;
                        
                }
                }while(opc2!=4);
                //opc=1;
                break;
            case 2:
                //mostrar cosas
                //equipos y jugadores
                read.datos();
                read.menu3();
                opc2=read.pideEnteros("\t\t\tcual quieres");
                switch(opc2)
                {
                    case 1:
                        //equipos
                        enter=read.pidestring("\t\t\tver equipos y jugadores");
                        for(y=0;y<x;y++)
                        {
                            Arrayequip[y].muestraEquipo();
                            switch(y)
                            {
                                case 0:
                            for(w1=0;w1<xJ1;w1++)
                            {
                                jug1[w1].muestraJugador();
                            }
                                   break;
                                case 1:
                                    for(w1=0;w1<xJ2;w1++)
                            {
                                jug2[w1].muestraJugador();
                            }
                                    break;
                                case 2:
                                    for(w1=0;w1<xJ3;w1++)
                            {
                                jug3[w1].muestraJugador();
                            }
                                    break;
                                case 3:
                                    for(w1=0;w1<xJ4;w1++)
                            {
                                jug4[w1].muestraJugador();
                            }
                                    break;
                                case 4:
                                    for(w1=0;w1<xJ5;w1++)
                            {
                                jug5[w1].muestraJugador();
                            }
                                    break;
                            }
                        }
                        break;
                    case 2:
                        enter=read.pidestring("\t\t\tver partidos");
                        for(y=0;y<xP;y++)
                        {
                            par[y].muestraPartido();
                        }
                        break;
                    case 3:
                        enter=read.pidestring("\t\t\tver resultados");
                        for(y=0;y<xP;y++)
                        {
                            par[y].muestraResult();
                        }                        break;
                    case 4:
                        enter=read.pidestring("\t\t\tsaliendo...");
                        break;
                    default :
                        enter=read.pidestring("\t\t\topcion no valida");
                        break;
                }
                break;
            case 3:
                //hacer cambio
                read.menu4();
                opc2=read.pideEnteros("\t\t\tcual es su eleccion");
                    switch(opc2)
                    {
                        case 1:
                            enter=read.pidestring("\t\t\thacer cambios en el equipo");
                            w=0;
                            for(y=0;y<x;y++)
                            {
                                System.out.println("\t\t\t"+w+".-equipo ");
                                Arrayequip[y].muestraEquipo();
                            }
                            e=read.pideEnteros("\t\t\tque equipo desea cambiar");
                            e--;
                            nombre=read.pidestring("\t\t\tcual es el nuevo nombre");
                            estadio=read.pidestring("\t\t\tcual es el nuevo estadio");
                            Arrayequip[e].setEquipo(nombre);
                            Arrayequip[e].setEstadio(estadio);
                        
                            break;
                        case 2:
                            System.out.println("\t\t\tsaliendo");
                            break;
                        default :
                            enter=read.pidestring("\t\t\topcion no valida");
                            break;
                        
                    }
                break;
            case 4:
                y=1;
                        for(w=0;w<x;w++)
                        {
                            System.out.println("\t\t\t"+y+".-equipo");
                            Arrayequip[w].muestraEquipo();
                            y++;
                        }
                        numero=read.pideEnteros("\t\t\tque numero de quipo es el local");
                        numero--;
                switch(numero)
                {
                    case 0:
                        nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug1 [xJ1]= new jugador(nombre,numero,estadio); 
                                xJ1++;
                        break;
                    case 1:
                         nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug2 [xJ2]= new jugador(nombre,numero,estadio); 
                                xJ2++;
                        break;
                    case 2:
                         nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug3 [xJ3]= new jugador(nombre,numero,estadio); 
                                xJ3++;
                        break;
                    case 3:
                        nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug4 [xJ4]= new jugador(nombre,numero,estadio); 
                                xJ4++;
                        break;
                    case 4:
                         nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug5 [xJ5]= new jugador(nombre,numero,estadio); 
                                xJ5++;
                        break;
                    default:
                        enter=read.pidestring("\t\t\tequipo no valido");
                        break;
                } nombre=read.pidestring("\t\t\tcual es el nombre del jugador");
                                numero=read.pideEnteros("\t\t\tcual es su numero");
                                estadio=read.pidestring("\t\t\tcual su posicion");
                                jug5 [xJ5]= new jugador(nombre,numero,estadio); 
                                e=read.pideEnteros("\t\t\t1.-meter mas jugadores \n2.-salir");
                                while(e!=1 && e!=2)
                                    e=read.pideEnteros("\t\t\tsolo admite 1 y 2");
                                xJ5++;
                        break;
            case 5:
                enter=read.pidestring("\t\t\tsaliendo...");
                break;
            default :
                enter=read.pidestring("\t\t\topcion no valida...");
                break;
                }
    }while(opc!=5);

}
    
}
class equipo{
    String equipo;
    String estadio;
    equipo(String equipo, String estadio)
    {
        this.equipo=equipo;
        this.estadio=estadio;
    }
    public void muestraEquipo()
    {
        System.out.println("\t\t\tequipo   :"+equipo);
        System.out.println("\t\t\testadio  :"+estadio);
    }
    public void setEquipo(String equipo)
    {
        this.equipo=equipo;
    }
    public void setEstadio(String estadio)
    {
        this.estadio=estadio;
    }
    public String getEquipo ()
    {
        return(this.equipo);
    }
    public String getEstadio()
    {
        return(this.estadio);
    }
    
}
class partido{
    String local;
    String visitante;
    String fecha;
    String hora;
    int resultado1;
    int resultado2;
    String estado;
    String resul;
    partido(String local, String visitante, String fecha, String hora, int resultado1, int resultado2, String estado,String resul)
    {
        this.local=local;
        this.visitante=visitante;
        this.fecha=fecha;
        this.hora=hora;
        this.resultado1=resultado1;
        this.resultado2=resultado2;
        this.estado=estado;
        this.resul=resul;
    }
    public void setResul(String resul)
    {
        this.resul=resul;
    }
    public void setLocal(String local)
    {
        this.local=local;
    }
    public void setVisitante(String visitante)
    {
        this.visitante=visitante;
    }
    public void setFecha(String fecha)
    {
        this.fecha=fecha;
    }
    public void setHora(String hora)
    {
        this.hora=hora;
    }
    public void setResult1(int resultado1)
    {
        this.resultado1=resultado1;
    }
    public void setResult2(int resultado2)
    {
        this.resultado2=resultado2;
    }
    public void setEstado(String estado)
    {
        this.estado=estado;
    }
    public String getLocal()
    {
        return(this.local);
    }
    public String getVisitante()
    {
        return(this.visitante);
    }
    public String getfecha()
    {
        return(this.fecha);
    }
    public String getHora()
    {
        return(this.hora);
    }
    public int getResult1()
    {
        return(this.resultado1);
    }
    public int getResult2()
    {
        return(this.resultado2);
    }
    public String getEstado()
    {
        return(this.estado);
    }
    public void muestraPartido()
    {
        System.out.println("\t\t\tlocal"+"\t"+"visitante");
        System.out.println("\t\t\t"+local+"\t"+visitante);
        System.out.println("\t\t\tfehca  :"+fecha);
        System.out.println("\t\t\thora   :"+hora);
        System.out.println("\t\t\testado :"+estado);
    }
    public void muestraResult()
    {
        System.out.println("\t\t\tlocal"+"\t"+"visitante");
        System.out.println("\t\t\t"+local+"\t"+visitante);
        System.out.println("\t\t\t"+resultado1+"\t"+resultado2);
        System.out.println("\t\t\tfehca  :"+fecha);
        System.out.println("\t\t\thora   :"+hora);
        System.out.println("\t\t\testado :"+estado);
        System.out.println("\t\t\t"+resul);
                
        
        
    }
    
}
class read{
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
       
    static String compara(int numero, int numero2, String local, String visitante) 
    {
        if(numero==numero2)
            return("empate");
        else
            if(numero>numero2)
                return("gano "+local);
        else
                return("gano "+visitante);
    }
    static void menu()
    {
        System.out.println("\t\t\t1.-registrar equipos,partidos, resultados");
        System.out.println("\t\t\t2.-ver equipos,partidos y resultados");
        System.out.println("\t\t\t3.-hacer cambios en equipos ");
        System.out.println("\t\t\t4.-salir");
    }
    static void menu2()
    {
        System.out.println("\t\t\t1.-ingresar equipo");
        System.out.println("\t\t\t2.-ingresar partidos");
        System.out.println("\t\t\t3.-ingresar resultados");
        System.out.println("\t\t\t4.-salir");
    }
    static void menu3()
    {
        System.out.println("\t\t\t1.-ver equipos y jugadores");
        System.out.println("\t\t\t2.-ver partidos");
        System.out.println("\t\t\t3.-ver resultados");
    }
    static void menu4()
    {
        System.out.println("\t\t\t1.-hacer cambios en equipos ");
        System.out.println("\t\t\t2.-salir");
    }
    static void datos()
    {
        System.out.println("\t\t\t\tDATOS");
        System.out.println("\t\t\tLIGA DE BASQUETBALL");
        System.out.println("\t\t\tLIGA EL DEPORTISTA CHILLON");
        System.out.println("\t\t\tCORREO:LIGA_INDEPENDIENTE@GMAIL.COM");
        System.out.println("\t\t\tNO:5565644771");
        System.out.println("\t\t\tLEMA:SI ERES CHILLON GANAS :D");
    }
    
}
class jugador{
    String nombre;
    int numero;
    String posicion;
    jugador(String nombre, int numero, String posicion)
    {
        this.nombre=nombre;
        this.numero=numero;
        this.posicion=posicion;
    }
    public void muestraJugador()
    {
        System.out.println("\t\t\tnombre  :"+nombre);
        System.out.println("\t\t\tnumero  :"+numero);
        System.out.println("\t\t\tposicion:"+posicion);
        
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setNumero(int numero)
    {
         this.numero=numero;
    }
    public void setPosicion(String posicion)
    {
         this.posicion=posicion;       
    }
    public String getNombre()
    {
        return(this.nombre);
    }
    public int getNumero()
    {
        return(this.numero);
    }
    public String getPosicion()
    {
        return(this.posicion);
    }
}