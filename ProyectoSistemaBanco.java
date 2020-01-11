package ddproyect;
import java.io.*;
public class ProyectoSistemaBanco{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
int opc,edad, y = 0,x=0 ,y1, opc1, buscar;
String nombre, paus,otro;
double dinero,dinero2;
cliente persona [] = new cliente[5];
//persona[y]=new cliente(21,"rey",23,23.30,143.2,14.2,12.20,20.2);
do{
    metodos.cls();
    metodos.datos();
    metodos.menu1();
opc=metodos.pideEnteros("que numero elige");
switch(opc)
{
    case 1:
        metodos.cls();
        metodos.datos();
        paus=metodos.pidestring("crear cuenta");
        if(x==5)
        {
            System.out.println("lo sentimos ya no puede registrar mas clientes");
            paus=metodos.pidestring("presiona enter para continuar");
            break;
        }
         buscar=metodos.pideEnteros("matricula del cliente");
                    y=0;
            while(y<x && buscar!=persona[y].getId_cliente())
                y++;
                if(y>=x) {
                                    nombre=metodos.pidestring("cual es el nombre del usuario");
                                    edad=metodos.pideEnteros("cual es su edad");
                                    dinero=metodos.pidedouble("con cuanto vamos a inciar la cuenta");
                                    persona[x]=new cliente(buscar,nombre,edad,0,0,0,dinero,0);
                                    x++;
                }
            else {
                    paus=metodos.pidestring("ya existe la matricula");
                }
        break;
    case 2:
        //menu2
        paus=metodos.pidestring("hacer transacciones");
        buscar=metodos.pideEnteros("en que numero de cuenta va hacer transacciones ");
        y=0;
        while(y<x && buscar!=persona[y].getId_cliente())
            y++;
        if(y>=x){
                        paus=metodos.pidestring("cuenta no existente");
        }
        else
        {
             do{
    //menu2
        metodos.cls();
        metodos.datos();
        metodos.menu2();
        opc1=metodos.pideEnteros("cual escoje");
        metodos.cls();
        switch(opc1)
        {
            case 1:
                metodos.datos();
                paus=metodos.pidestring("deposito en la misma cuenta");
                dinero=metodos.pidedouble("cuanto va a depositar");
                dinero2=metodos.suma(dinero,persona[y].getBonos());
                persona[y].setBonos(dinero2);
                dinero2=metodos.suma(dinero,persona[y].getSaldoF());
                persona[y].setSaldoF(dinero2);
                break;
            case 2:
                metodos.datos();
                paus=metodos.pidestring("retiro de la cuenta");
                dinero=metodos.pidedouble("cuanto va a retirar");
                dinero2=metodos.suma(dinero,persona[y].getRetiros());
                persona[y].setRetiros(dinero2);
                dinero2=metodos.resta(persona[y].getSaldoF(),dinero);
                persona[y].setSaldoF(dinero2);
                
                break;
            case 3:
                metodos.datos();
                y1=0;
                buscar=metodos.pideEnteros("a que cuenta va a depositar");
                if(persona[y].getId_cliente()==buscar)
                {
                    System.out.println("no se puede depositar a la misma cuenta");
                    break;
                }
                while(y1<x && buscar!=persona[y1].getId_cliente())
                    y1++;
                if(y1>=x)
                {
                    paus=metodos.pidestring("no existe la cuenta que quiere hacer la transferencia");
                    
                }
                else
                {
                    dinero=metodos.pidedouble("cuanto va a transferir");
                    //actualizamos los bonos del cliente que se le transfiere
                    dinero2=metodos.suma(dinero, persona[y1].getBonos());
                    persona[y1].setBonos(dinero2);
                    //actualizamos el estado del cliente que se le transfiere
                    dinero2=metodos.suma(dinero, persona[y1].getSaldoF());
                    persona[y1].setSaldoF(dinero2);
                    //actualizamos el estado del cliente
                    dinero2=metodos.resta( persona[y].getSaldoF(),dinero);
                    persona[y].setSaldoF(dinero2);
                    //actualizamos el estado de transferencias del cliente
                    dinero2=metodos.suma(dinero, persona[y].gettransferencias());
                    persona[y].setTransferencias(dinero2);
                }
                break;
            case 4:
                metodos.datos();
                paus=metodos.pidestring("ver estado de cuenta");
                persona[y].muestraCliente();
                break;
            case 5:
                metodos.datos();
                paus=metodos.pidestring("actualizar algun dato");
                edad=metodos.pideEnteros("1.-nombre 2.-edad");
                if(edad==1)
                {
                    nombre=metodos.pidestring("cual es el nuevo nombre");
                    persona[y].setNombre(nombre);
                }
                else
                    if(edad==2)
                    {
                        edad=metodos.pideEnteros("cual es su nueva edad");
                        persona[y].setEdad(edad);
                    }
                else
                        paus=metodos.pidestring("opcion no valida");
                break;
            case 6:
                metodos.datos();
                paus=metodos.pidestring("adios");
                break;
            default :
                paus=metodos.pidestring("esta opcion no es valida");
                break;    
        }
            }while(opc1==6);
        }
            break;
    case 3:
        metodos.datos();
        paus=metodos.pidestring("mostrar saldos finales");
        for(y=0;y<x;y++)
        {
            persona[y].muestra2();
        }
        break;
    case 4:
        metodos.datos();
        paus=metodos.pidestring("gracias por visitarnos");
        break;
    
    default :
        metodos.datos();
        paus=metodos.pidestring("esta opcion no es valida");
        break;
        
}
    }while(opc!=4);


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
        public static double suma(double dinero, double array)
        {
            return(dinero+array);
        }
        public static double resta(double array, double dinero)
        {
            if(array>=dinero)
            {
            return(array-dinero);
            }
            else
            {
                System.out.println("el saldo no es suficiente");
                return(array);
            }
        }
        public static void menu1()
        {
            System.out.println("\t\t\t\tMENU");
            System.out.println("1.-inicias cuenta");
            System.out.println("2.-hacer transacciones");
            System.out.println("3.- mostrar estados de cuenta fianales");
            System.out.println("4.-salir");
            

        }
        public static void menu2()
        {
            System.out.println("\t\t\t\tSUBMENU");
            System.out.println("1.- hacer deposito");
            System.out.println("2.-retiro");
            System.out.println("3.-transferencia");
            System.out.println("4.-ver estado de cuenta");
            System.out.println("5.-actualizar datos");
            System.out.println("6.-salir");
        }
        public static void datos()
        {
            System.out.println("datos");
        }
}
class cliente {
int id_cliente;
String nombre;
int edad;
double retiros;
double transferencias;
double bonos;
double saldoI;
double saldoF;
cliente(int id_cliente, String nombre, int edad,double retiros, double transferencias,double bonos, double saldoI, double saldoF )
{
    this.id_cliente=id_cliente;
    this.nombre=nombre;
    this.edad=edad;
    this.retiros=retiros;
    this.transferencias=transferencias;
    this.bonos=bonos;
    this.saldoI=saldoI;
    this.saldoF=saldoF;
    
}
public void setId_cliente(int id_cliente)
{
        this.id_cliente=id_cliente;
}
public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
public void setEdad(int edad)
{
        this.edad=edad;
}
public void setRetiros(double retiros)
{
        this.retiros=retiros;
}
public void setTransferencias(double transferencias)
{
        this.transferencias=transferencias;
}
public void setBonos(double bonos)
{
        this.bonos=bonos;
}
public void setSaldoI(double saldoI)
{
    this.saldoI=saldoI;    
}
public void setSaldoF(double saldoF)
{
    this.saldoF=saldoF;    
}
public int getId_cliente()
{
    return(this.id_cliente);
}
public String getNombre()
{
    return(this.nombre);
}
public int getEdad()
{
    return(edad);
}
public double getRetiros()
{
    return(this.retiros);
}
public double gettransferencias()
{
    return(this.transferencias);
}
public double getBonos()
{
    return(this.bonos);
}
public double getSaldoI()
{
    return(this.saldoI);
}
public double getSaldoF()
{
    return(this.saldoF);
}
public void muestraCliente()
{
    System.out.println("Id cliente    :"+this.id_cliente);
    System.out.println("nombre        :"+this.nombre);
    System.out.println("edad          :"+ this.edad);
    System.out.println("retiros       :"+this.retiros);
    System.out.println("transferencias:"+this.transferencias);
    System.out.println("bonos         :"+this.bonos);
    System.out.println("saldo inicial :"+this.saldoI);
    System.out.println("saldo final   :"+this.saldoF);
}
public void muestra2()
{
    System.out.println("cliente     :"+this.nombre);
    System.out.println("saldo final :"+this.saldoF);
}
}
