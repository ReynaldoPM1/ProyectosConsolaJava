package Gabyproyec;

import java.io.*;

/**
 *
 * @author rey
 */
public class Gabyproyec{

    public static void main(String[] args) throws IOException {
        perro cachorro []=new perro[5];
        datos dato1 []=  new datos[5];
        datos dato2 []=  new datos[5];
        datos dato3 []=  new datos[5];
        datos dato4 []=  new datos[5];
        datos dato5 []=  new datos[5];
        int cod_veter[]=new int[5];
        int cod_dueno[]=new int[5];
        int cobrov [] = new int [5];
        String duenos []=new String [5];
        String veterinarios[]=new String[5];    
        String   string,string1, pausa, mas1;       
        int opc=0, xV=0, x=0, y=0,mas , buscar, entero,w=0,z=0, d1=0,d2=0,d3=0,d4=0,d5=0;
        double dooble;
        boolean booleano=false;
        opc=leer.pideEnteros("");
        while(opc<0 && opc>5)
            opc=leer.pideEnteros("");
                do{
        leer.cls();
        leer.datos();
        leer.menu();
        opc=leer.pideEnteros("cual es la opcion que escije");
        leer.cls();
        switch(opc)
        {
            case 1:
                //contratar veterinario
                do{
                    leer.cls();
                    leer.datos();
                    pausa=leer.pidestring("contratar veterinarios");
                    cod_veter[xV]=leer.pideEnteros("matricula del veterinario");
					 if(xV==5)
                {
                    pausa=leer.pidestring("memoria llena");
                    break;
                }
                    y=0;
            while(y<xV && cod_veter[xV]!=cod_veter[y])
                y++;
                if(y>=x) {
                                    veterinarios[xV]=leer.pidestring("cual es el nombre del veterinario");
                                    cobrov[xV]=leer.pideEnteros("cuanto es lo que cobra este veterinario");
                                    xV++;
                }
            else {
                                    System.out.println("ya existe un veterinario con esa matricula");

                }
							mas=leer.pideEnteros("quieres meter otro veterinario 1=si o 2=no ");
							while(mas!=1 && mas!=2)
                            mas=leer.pideEnteros("quieres meter otro veterinario 1=si o 2=no ");                
						}while(mas!=2);
                break;
            case 2:
                //registrar cliente
                do{
                    leer.cls();
                    leer.datos();
                    pausa=leer.pidestring("registrar clientes");
					 if(x==5)
                {
                    pausa=leer.pidestring("memoria llena");
                    break;
                }
                   cod_dueno[x]=leer.pideEnteros("cual es su numero de cliente ");
                      y=0;
            while(y<x && cod_dueno[x]!=cod_dueno[y])
                y++;
                if(y>=x) {
                                    duenos[x]=leer.pidestring("cual es el nombre del dueño");
                                    x++;                
                }
            else {
                                    System.out.println("ya existe un cliente con esa matricula");

                }
							mas=leer.pideEnteros("quieres meter otro cliente 1=si o 2=no ");
							while(mas!=2 && mas!=1)
                            mas=leer.pideEnteros("quieres meter otro cliente 1=si o 2=no ");
                }while(mas!=2 );
                break;
            case 3:
                do{
                    leer.cls();
                    leer.datos();
                    pausa=leer.pidestring(" ingresar mascota de un cliente");
                    buscar=leer.pideEnteros("cual es el codigo del cliente");
            while(y<x && buscar!=cod_dueno[y])
                y++;                  
            if(y>=x) 
                System.out.println("no existe  lo que busca :C");
            else {
                System.out.println("si exite =D");
                pausa=leer.pidestring("");
                leer.cls();

                    string=leer.pidestring("cual es el nombre de la mascota");
                    entero=leer.pideEnteros("cual es su edad");
                    dooble=leer.pidedouble("cual es su peso");
                    opc=leer.pideEnteros("perro con pedegree 1=si 2=no");
                    if(opc==1) booleano=true;
                    else
                        if(opc==2) booleano=false;
                    else
                            pausa=leer.pidestring("opcion no valida");
                    string1=leer.pidestring("cual es la raza del perro");
                                cachorro[y] = new perro(string,entero,dooble,booleano,string1);
                    }
            leer.cls();
							mas=leer.pideEnteros("quieres meter otro cliente 1=si o 2=no ");
							while(mas!=1 && mas!=2)
                            mas=leer.pideEnteros("quieres meter otro cliente 1=si o 2=no ");
			}while(mas!=2);
                break;
            case 4:
                y=0;
                leer.cls();
                leer.datos();
                pausa=leer.pidestring(" registra cosulta de mascota");
                buscar=leer.pideEnteros("cual es el codigo del cliente de la mascota a revisar");     
            while(y<x && buscar!=cod_dueno[y])
                y++;
                if(y>=x) 
                System.out.println("no existe  lo que busca :C");
            else {
                    w=0;
                    for(z=0;z<xV;z++)
                    {
                        w++;
                        System.out.println("veterinario : "+w+".- "+veterinarios[z]);
                        System.out.println("cobra       :"+cobrov[z]);
                    }
                    opc=leer.pideEnteros("que numero de veterinario lo atendio");
                    switch(y)
                    {
                        case 0:
                    opc--;
                    string=veterinarios[opc];
                    pausa=leer.pidestring("que enfermedad curo");
                    string1=leer.pidestring("alguna observacion");
                    entero=cobrov[y];
                    mas1=leer.pidestring("que fecha   es");
                    dato1[d1]=new datos(mas1,string1,entero,string );
                    d1++;
                            break;
                        case 1:
                    opc--;
                    string=veterinarios[opc];
                    pausa=leer.pidestring("que enfermedad curo");
                    string1=leer.pidestring("alguna observacion");
                    entero=cobrov[y];
                    mas1=leer.pidestring("que fecha   es");
                    dato2[d2]=new datos(mas1,string1,entero,string );
                    d2++;
                            break;
                        case 2:
                    opc--;
                    string=veterinarios[opc];
                    pausa=leer.pidestring("que enfermedad curo");
                    string1=leer.pidestring("alguna observacion");
                    entero=cobrov[y];
                    mas1=leer.pidestring("que fecha   es");
                    dato3[d3]=new datos(mas1,string1,entero,string );
                    d3++;
                            break;
                        case 3:
                    opc--;
                    string=veterinarios[opc];
                    pausa=leer.pidestring("que enfermedad curo");
                    string1=leer.pidestring("alguna observacion");
                    entero=cobrov[y];
                    mas1=leer.pidestring("que fecha   es");
                    dato4[d4]=new datos(mas1,string1,entero,string );
                    d4++;
                            break;
                        case 4:
                    opc--;
                    string=veterinarios[opc];
                    pausa=leer.pidestring("que enfermedad curo");
                    string1=leer.pidestring("alguna observacion");
                    entero=cobrov[y];
                    mas1=leer.pidestring("que fecha   es");
                    dato5[d5]=new datos(mas1,string1,entero,string );
                    d5++;
                            break;
                    }
                    
                    
                }

                break;
            case 5:
                //hacer cambios en las mascotas
                y=0;
                leer.cls();
                leer.datos();
                pausa=leer.pidestring("cambiar datos del cliente y mascota");
                buscar=leer.pideEnteros("cual es el codigo del cliente de");     
            while(y<x && buscar!=cod_dueno[y])
                y++;
                if(y>=x) 
                System.out.println("no existe  lo que busca :C");
            else {
                    leer.cls();
                    leer.datos();
                    leer.cambio();
                    opc=leer.pideEnteros("que desea cambiar");
                    leer.cambio();
                    switch(opc)
                    {
                        case 1:
                            string=leer.pidestring("cual es el nombre de la mascota");
                   cachorro[y].setNombre(string);
                            break;
                        case 2:
                            entero=leer.pideEnteros("cual es su edad");
                    cachorro[y].setEdad(entero);
                            break;
                        case 3:
                             dooble=leer.pidedouble("cual es su peso");
                    cachorro[y].setPeso(dooble);
                                break;
                        case 4:
                            entero=leer.pideEnteros("perro con pedegree 1=si 2=no");
                    if(entero==1) booleano=true;
                    else
                        if(entero==2) booleano=false;
                    else
                            pausa=leer.pidestring("opcion no valida");
                            cachorro[y].setPedigree(booleano);

                    break;
                        case 5:
                             string=leer.pidestring("cual es la raza del perro");
                    cachorro[y].setRaza(string);
                            break;
                        case 6:
                            duenos[y]=leer.pidestring("cual es el nuevo nombre del dueño");
                            break;
                        default:
                            pausa=leer.pidestring("opciono no valida :C");
                            break;
                    }
                }
                break;
            case 6:
                leer.cls();
                leer.datos();
                pausa=leer.pidestring("mostrar duenos y mascotas");
                buscar=leer.pideEnteros("cual es su numero de cliente ");
                      y=0;
            while(y<x && buscar!=cod_dueno[y])
                y++;
                if(y>=x) {
                                    pausa=leer.pidestring("no existe el cliente");
                                    x++;                
                }
            else {
                switch(y)
                        {
                            case 0:
                                System.out.println("dueño         :"+duenos[y]);
                                cachorro[y].muestraPerro();
                                for(y=0;y<d1;y++)
                                    { dato1[y].muestraDatos();    }
                            break;
                            case 1:
                                System.out.println("dueño          :"+duenos[y]);
                                cachorro[y].muestraPerro();
                                for(y=0;y<d2;y++)
                                    { dato2[y].muestraDatos();    }
                                break;
                            case 2: 
                                  System.out.println("dueño         :"+duenos[y]);
                                cachorro[y].muestraPerro();
                                for(y=0;y<d3;y++)
                                    { dato3[y].muestraDatos();    }
                                break;
                            case 3:
                                  System.out.println("dueño         :"+duenos[y]);
                                cachorro[y].muestraPerro();
                                for(y=0;y<d4;y++)
                                    { dato4[y].muestraDatos();    }
                                break;
                            case 4:
                                  System.out.println("dueño         :"+duenos[y]);
                                cachorro[y].muestraPerro();
                                for(y=0;y<d1;y++)
                                    { dato4[y].muestraDatos();    }
                                break;
                            
                        }
                }
                pausa=leer.pidestring("enter");
                break;
            case 7:
                //ver las mascotas y duenos
                y=0;
                leer.cls();
                leer.datos();
                pausa=leer.pidestring("cambiar nombre de veterinario");
                buscar=leer.pideEnteros("cual es el codigo del veterinario a cambiar ");     
            while(y<x && buscar!=cod_dueno[y])
                y++;
                if(y>=x) 
                System.out.println("no existe  lo que busca :C");
            else {
                buscar=leer.pideEnteros("1.-cambiar nombre 2.-cambiar costo");     
                    if(buscar==1){
               System.out.println("veterinario"+veterinarios[y]);
               veterinarios[y]=leer.pidestring("cual es el nuevo nombre");
                    }
                    else
                        if(buscar==2)
                        {
                            System.out.println("costo :"+cobrov[y]);
                            cobrov[y]=leer.pideEnteros("cual es el nuevo costo");
                        }
                }
                break;
            case 8:
                leer.cls();
                leer.datos();
                pausa=leer.pidestring("mostrar veterinario y lo que cobran");
                 w=0;
                    for(z=0;z<xV;z++)
                    {
                        w++;
                        System.out.println("veterinario : "+w+".- "+veterinarios[z]);
                        System.out.println("cobra       :"+cobrov[z]);
                    }
                break;
            case 9:
                // salir
                leer.cls();
                leer.datos();
                pausa=leer.pidestring("saliendo");
                break;
            default :
                leer.cls();
                leer.datos();
                pausa=leer.pidestring("opcion no valida");
                break;
                
                
        }
        }while(opc!=9);
        
    }
    
}
class datos {
    String fecha;
    String observaciones;
    int cobro;
    String atendio;
    datos(String fecha, String observaciones, int cobro, String atendio)
    {
        this.fecha=fecha;
        this.observaciones=observaciones;
        this.cobro=cobro;
        this.atendio=atendio;
        
    }
    public void muestraDatos(){
        System.out.println("fecha         :"+fecha);
        System.out.println("observaciones :"+observaciones);
        System.out.println("cobro         :"+cobro);
        System.out.println("atendio       :"+atendio);
    }
    public void setFecha(String fecha)
    {
        this.fecha=fecha;
    }
    public void setObservaciones(String observaciones)
    {
        this.observaciones=observaciones;
    }
    public void setCobro(int cobro)
    {
        this.cobro=cobro;
    }
    public void setAtendio(String atendio)
    {
        this.atendio=atendio;
    }
    public String setFecha()
    {
        return(fecha);
    }
    public String setObservaciones()
    {
        return(observaciones);
    }
    public int setCobro()
    {
        return(cobro);
    }
    public String setAtendio()
    {
        return(atendio);
    }
}
class perro {
     String nombre;
     int edad;
     double peso;
     boolean pedigree;
     String raza;
     
    //constructor
     perro( String nombre,int edad, double peso, boolean pedigree,String raza)
     {
         this.nombre=nombre;
         this.edad=edad;
         this.peso=peso;
         this.pedigree=pedigree;
         this.raza=raza;
         
     }
    public void muestraPerro()
    {
        System.out.println("nombre        :"+nombre);
        System.out.println("edad          :"+edad);
        System.out.println("peso          :"+peso);
        System.out.println("pedigree      :"+pedigree);
        System.out.println("raza          :"+raza);
        
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setEdad(int edad )
    {
        this.edad=edad;
    }
    public void setPeso(double peso)
    {
        this.peso=peso;
    }
   
    public void setPedigree(boolean pedigree)
    {
        this.pedigree=pedigree;
    }
    public void setRaza(String raza)
    {
        this.raza=raza;
    }
      public String getNombre()
    {
        return(nombre);
    }
public int getEdad()
{
    return(edad);
}
public double getPeso()
{
    return(peso);
}

public boolean getPedigree()
{
    return(pedigree);
}
public String getRaza()
{
    return(raza);
}

}
class leer{
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
        public static void menu()
        {
            System.out.println("menu principal");
            System.out.println("1.-contratar veterinarios");
            System.out.println("2.-registrar cliente");
            System.out.println("3.-ingresar mascota de un cliente");
            System.out.println("4.-registra cosulta de mascota");
            System.out.println("5.-cambiar datos del cliente y mascota");
            System.out.println("6.-mostrar duenos y mascotas");
            System.out.println("7.-cambiar nombre y costo de veterinario");
            System.out.println("8.-mostrar veterinarios y su costo");
            System.out.println("9.-salir");
        }
       /* public static int 1buscar(int x,int y, int buscar, int fijo)
        {
            while(y<x && buscar!=cod_dueno[y])
                y++;
            
            return(y);
        }*/
         public static void cambio()
        {
        System.out.println("1.- nombre  ");
        System.out.println("2.-edad     ");
        System.out.println("3.-peso     ");
        System.out.println("4.-pedigree ");
        System.out.println("5.-raza     ");
        System.out.println("6.-nomrbe del Dueño  ");
        }
            public static void datos()
        {
        System.out.println("datos  ");
        }
}