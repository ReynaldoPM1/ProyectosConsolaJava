
package AgenciaAutobuses
import java.io.*;
public class AgenciaAutobuses{


    public static void main(String[] args) throws IOException {
            int x=0, opc=0,opc1,y=0, asiento,edad,v1=0,v2=0;
            String nombre,desti, t,v="vendido";
            String destino [] = new String[2];
            int precio []=new int[4];
            cliente viaje1 []=new cliente[5];
            cliente viaje2[]=new cliente[5];
            //0=viaje 1
            //1=viaje 2
            //0=v1 adultp
            //1=v1 niño
            //2=v2 adulto
            //3=v2 niño
                    
            //metodo.datos();
            t=metodo.pidestring("\t\t\t\tiniciando datos ");
            destino[0]=metodo.pidestring("\t\t\tdebe de ingresar el primer destino ");
            precio[0]=metodo.pideEnteros("\t\t\tcual es el precio para ADULTO ");
            precio[1]=metodo.pideEnteros("\t\t\tcual es el precio para MENORES DE EDAD ");
            destino[1]=metodo.pidestring("\t\t\tdebe de ingresar el SEGUNDO destino ");
            precio[2]=metodo.pideEnteros("\t\t\tcual es el precio para ADULTO ");
            precio[3]=metodo.pideEnteros("\t\t\tcual es el precio para MENORES ");
            do{
                metodo.cls();
                metodo.datos();
                metodo.menu();
                opc=metodo.pideEnteros("\t\t\tcual es la opcion que elije ");
                switch(opc)
                {
                    case 1:
                        //METER CLIENTES
                        do{
                        metodo.cls();
                        metodo.datos();
                        System.out.println("\t\t\tvender boletos");
                        metodo.menu1();
                        opc1=metodo.pideEnteros("\t\t\tcual es la opcion que elije ");
                        switch(opc1)
                        {
                            case 1:
                                asiento=metodo.pideEnteros("\t\t\tcual asiento elije ");
                             while(asiento>3)
                             asiento=metodo.pideEnteros("\t\t\tlo sentimos solo puede elejir 1,2,3\n\t\t\tcual asiento elije ");
                             y=0;
                             while(y<v1 && asiento!=viaje1[y].getAsiento() )
                                            y++;
                             if(y>=v1){
                                        nombre=metodo.pidestring("\t\t\tcual es su  nombre ");
                                        edad=metodo.pideEnteros("\t\t\tel pasajero es\n\t\t\t1.-adulto  2.-menor ");
                                        while(edad>2)
                                        edad=metodo.pideEnteros("\t\t\tel pasajero es\n\t\t\t1.-adulto  2.-menor ");
                                        switch(edad)
                                        {
                                            case 1:
                                                t="adulto";  
                                                viaje1 [v1] =new cliente(nombre,destino[0],asiento,t,"vendido",precio[0]);
                                                break;
                                            case 2: 
                                                t="ninio";
                                                viaje1 [v1] =new cliente(nombre,destino[0],asiento,t,"vendido",precio[1]);
                                                break;
                                                default :
                                                t=metodo.pidestring("\t\t\taccion no realizada");
                                                break;
                                        }
                                        t=metodo.pidestring("\t\t\taccion realizada");
                                           }
                             else
                             {
                                 System.out.println("\t\t\tlo sentimos escoja otro asiento\n\t\t\teste asiento ya esta ocupado ");
                                 t=metodo.pidestring("\t\t\t...");
                             }
                                break;
                            case 2:
                                asiento=metodo.pideEnteros("\t\t\tcual asiento elije ");
                             while(asiento>3)
                             asiento=metodo.pideEnteros("\t\t\tlo sentimos solo puede elejir 1,2,3\n\t\t\tcual asiento elije ");
                             y=0;
                             while(y<v2 && asiento!=viaje2[y].getAsiento() )
                                            y++;
                             if(y>=v2){
                                        nombre=metodo.pidestring("\t\t\tcual es su  nombre ");
                                        edad=metodo.pideEnteros("\t\t\tel pasajero es\n\t\t\t1.-adulto  2.-menor ");
                                        while(edad>2)
                                        edad=metodo.pideEnteros("\t\t\tel pasajero es\n\t\t\t1.-adulto  2.-menor ");
                                        switch(edad)
                                        {
                                            case 1:
                                                t="adulto";  
                                                viaje2 [v2] =new cliente(nombre,destino[1],asiento,t,"vendido",precio[2]);
                                                t=metodo.pidestring("\t\t\taccion realizada");
                                                break;
                                            case 2: 
                                                t="ninio";
                                                viaje2 [v2] =new cliente(nombre,destino[1],asiento,t,"vendido",precio[3]);
                                                t=metodo.pidestring("\t\t\taccion realizada");
                                                break;
                                            default :
                                                t=metodo.pidestring("\t\t\taccion no realizada");
                                                break;
                                        }
                                           }
                             else
                             {
                                 System.out.println("\t\t\tlo sentimos escoja otro asiento\n\t\t\teste asiento ya esta ocupado");
                                 t=metodo.pidestring("\t\t\t...");
                             }
                                break;
                            case 3:
                                t=metodo.pidestring("\t\t\tregresando a...");
                                t=metodo.pidestring("\t\t\t...");
                                break;
                            default:
                                t=metodo.pidestring("\t\t\tdestino no valido");
                                t=metodo.pidestring("\t\t\t...");
                                break;
                        }
                        }while(opc1!=3);
                        break;
                    case 2:
                        //VER BOLETOS
                        do{
                        metodo.cls();
                        metodo.datos();
                        System.out.println("\t\t\timprimir boleto");
                        metodo.menu1();
                        opc1=metodo.pideEnteros("\t\t\tcual escoje ");
                        switch(opc1)
                        {
                            case 1:
                                asiento=metodo.pideEnteros("\t\t\tcual asiento elije ");
                             while(asiento>3)
                             asiento=metodo.pideEnteros("\t\t\tlo sentimos solo puede elejir 1,2,3\n\t\t\tcual asiento elije ");
                             y=0;
                             while(y<v1 && asiento!=viaje1[y].getAsiento() )
                                            y++;
                             if(y>=v1){
                             System.out.println("\t\t\tlo sentimos escoja otro asiento\n\t\t\teste asiento no esta ocupado");
                             }
                             else
                             {
                                 viaje1[y].muestraCliente();
                                 t=metodo.pidestring("\t\t\t...");
                                         }
                                break;
                            case 2:
                            asiento=metodo.pideEnteros("\t\t\tcual asiento elije ");
                             while(asiento>3)
                             asiento=metodo.pideEnteros("\t\t\tlo sentimos solo puede elejir 1,2,3\n\t\t\tcual asiento elije ");
                             y=0;
                             while(y<v2 && asiento!=viaje2[y].getAsiento() )
                                            y++;
                             if(y>=v2){
                             System.out.println("\t\t\tlo sentimos escoja otro asiento\n\t\t\teste asiento no esta ocupado");
                             }
                             else{
                                 viaje2[y].muestraCliente();
                                 t=metodo.pidestring("\t\t\t...");
                             }
                                break;
                            case 3:
                                t=metodo.pidestring("\t\t\tregresando a...");
                                break;
                            default :
                                System.out.println("\t\t\tlo sentimos escoja otra opcion ");
                                t=metodo.pidestring("\t\t\t...");
                                break;
                        }
                        }while(opc1!=3);
                        break;
                    case 3:
                        //VER TODOS LOS boletos DE UN DESTINO
                        do{
                        metodo.cls();
                        metodo.datos();
                        System.out.println("\t\t\tver todos los boletos de un destino");
                        metodo.menu1();
                        opc1=metodo.pideEnteros("\t\t\tcual escoje ");
                        switch(opc1)
                        {
                            case 1:
                                for(x=0;x<v1;x++)
                                {
                                    viaje1[x].muestraCliente();
                                    System.out.print("\n\n");
                                }
                                break;
                            case 2:
                                for(x=0;x<v2;x++)
                                {
                                    viaje2[x].muestraCliente();
                                    System.out.print("\n\n");
                                }
                                break;
                            case 3:
                                t=metodo.pidestring("\t\t\tregresando a...");
                                    break;
                            default :
                                System.out.println("\t\t\tviaje no valido");
                                t=metodo.pidestring("\t\t\t...");
                                break;
                        }
                        }while(opc1!=3);
                        break;
                    case 4:
                        do{
                        //HACER CAMBIOS EN LOS PRECIO O DESTINOS
                        metodo.cls();
                        metodo.datos();
                        System.out.println("\t\t\thacer cambios en los precio o el destino");
                        metodo.menu1();
                        opc1=metodo.pideEnteros("\t\t\tcual escoje ");
                        switch(opc1)
                        {
                            case 1:
                                t=metodo.pidestring("\t\t\t(1.-cambiar destino 1 \n\t\t\t(2.-cambiar destino 2 \n\t\t\t(3.-salir ");
                                x=metodo.pideEnteros("cual es su eleccion");
                                switch(x)
                                {
                                    case 1:
                                        destino[0]=metodo.pidestring("\t\t\tcual es el nuevo destino ");
                                        break; 
                                    case 2:
                                        destino[1]=metodo.pidestring("\t\t\tcual es el nuevo destino ");
                                        break;
                                    case 3:
                                        t=metodo.pidestring("\t\t\tregresando a...");
                                        break;
                                    default :
                                        break;
                                }
                                break;
                            case 2:
                                t=metodo.pidestring("\t\t\t(1.-cambiar precio del  destino 1 \n\t\t\t(2.-cambiar destino 2 \n\t\t\t(3.-salir ");
                                x=metodo.pideEnteros("cual es su eleccion");
                                switch(x)
                                {
                                    case 1:
                                        precio[0]=metodo.pideEnteros("\t\t\tcual es el nuevo precio para adulto ");
                                        precio[1]=metodo.pideEnteros("\t\t\tcual es el nuevo precio para ninio ");
                                        break;
                                    case 2:
                                        precio[2]=metodo.pideEnteros("\t\t\tcual es el nuevo precio para adulto ");
                                        precio[3]=metodo.pideEnteros("\t\t\tcual es el nuevo precio para ninio ");
                                        break;
                                    case 3:
                                        t=metodo.pidestring("\t\t\tregresando a... ");
                                        break;
                                    default :
                                        t=metodo.pidestring("\t\t\topcion no valida ");
                                        break;
                                }
                                break;
                            case 3:
                                t=metodo.pidestring("\t\t\tregresando a...");
                                break;
                            default :
                                t=metodo.pidestring("\t\t\topcion no valida");
                                break;
                        }
                        }while(opc1!=3);
                        break;
                    case 5:
                        do{
                        //HACER cancelaciones
                        metodo.cls();
                        metodo.datos();
                        System.out.println("\t\t\thacer cancelaciones");
                        metodo.menu1();
                        opc1=metodo.pideEnteros("\t\t\ten cual desea cancelar ");
                        asiento=metodo.pideEnteros("\t\t\tque asiento quiere cancelar ");
                        switch(opc1)
                        {
                            case 1:
                                y=0;
                                while(y<v1 && asiento!=viaje1[y].getAsiento() )
                                            y++;
                                if(y>=v1)
                                {
                                    t=metodo.pidestring("\t\t\tno existe este asiento");
                                            }
                                
                        else{
                                viaje1[y].setAsiento(0);
                                viaje1[y].setEstado("cancelado");
                                t=metodo.pidestring("\t\t\taccion realizada");
                                }
                                break;
                            case 2:
                                y=0;
                                while(y<v2 && asiento!=viaje2[y].getAsiento() )
                                            y++;
                                if(y>=v2)
                                {
                                    t=metodo.pidestring("\t\t\tno existe este asiento");
                                }
                                else
                                {
                                viaje2[y].setAsiento(0);
                                viaje2[y].setEstado("cancelado");
                                t=metodo.pidestring("\t\t\taccion realizada");
                        }
                                break;
                            case 3:
                                t=metodo.pidestring("\t\t\tregresando a...");
                                break;
                            default :
                                t=metodo.pidestring("\t\t\topcion no valida");
                                break;
                        }
                        }while(opc1!=3);
                        break;
                    case 6:
                        //salir
                        t=metodo.pidestring("\t\t\tadios");
                        break;
                    default :
                        t=metodo.pidestring("\t\t\topcion no valida");
                        break;
                }
            }while(opc!=x);
    }
    
}

class cliente{
    String nombre;
    String destino;
    int asiento;
    String edad;
    String estado;
    int precio;
    cliente(String nombre, String destino, int asiento, String edad, String estado,int precio){
        this.nombre=nombre;
        this.destino=destino;
        this.asiento=asiento;
        this.edad=edad;
        this.estado=estado;
        this.precio=precio;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setEstado (String estado)
    {
        this.estado=estado;
    }
    public void setAsiento(int asiento)
    {
        this.asiento=asiento;
    }
    public int getAsiento()
    {
        return(this.asiento);
    }
    public void muestraCliente()
    {
        System.out.println("\t\t\tNOMBRE   :"+nombre);
        System.out.println("\t\t\tDESTINO  :"+destino);
        System.out.println("\t\t\tASIENTO  :"+asiento);
        System.out.println("\t\t\tTIPO     :"+edad);
        System.out.println("\t\t\tESTADO   :"+estado);
    }
}
class metodo{
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
        public static void datos()
        {
            System.out.println("\t\t\t\tDATOS");
            System.out.println("\t\t\tAGENCIA PATA DE PERRO");
            System.out.println("\t\t\tDIRECCION:CALLE ALFREDO DEL MAZO S/N");
            System.out.println("\t\t\tNUMERO:44656458");
            System.out.println("\t\t\tCORREO:PATAPERRO123@HOTMAIL.COM");
            System.out.println("\t\t\tNUESTROS VIAJES SON LOS MEJORES");
        }
        public static void menu()
        {
            System.out.println("\t\t\t\tMENU");
            System.out.println("\t\t\t1.-VENDER VOLETOS");
            System.out.println("\t\t\t2.-VER BOLETOS");
            System.out.println("\t\t\t3.-VER TODOS LOS BOLETOS DE UN DESTINO");
            System.out.println("\t\t\t4.-HACER CAMBIOS EN LOS PRECIO O DESTINOS");
            System.out.println("\t\t\t5.-HACER CANCELACIONES");
            System.out.println("\t\t\t6.-SALIR");
        }
        public static void menu1()
        {
            System.out.println("\t\t\t1.-destino 1");
            System.out.println("\t\t\t2.-destino 2");
        }
}