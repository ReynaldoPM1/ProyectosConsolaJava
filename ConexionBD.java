package ProyectoConexionBD
import java.sql.*;
import java.io.*;
 
public class ProyectoConexionBD{

   public static void main(String args[])throws IOException {
			BufferedReader leer= new BufferedReader
				(new InputStreamReader (System.in));
                        int opc,consulta1,consulta2, oni=0;
                        String ps="";
                        
        try{
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
            Statement miStatement= miConexion.createStatement();
            
            do{
            metodos.cls();  
            metodos.menu();
             opc=Integer.parseInt(leer.readLine());
               switch(opc)
             {
                   case 1:
             // preparamos la consulta
             System.out.println("escriba el codigo de factura");
             consulta1=Integer.parseInt(leer.readLine());
			metodos.comprueba( consulta1,  miConexion, ps, oni);
                        if(oni==1){
                        PreparedStatement sentencia11=miConexion.prepareStatement("select cliente.NOMBRE, cliente.APELLIDO_P,cliente.APELLIDO_M,cliente.NO_CLIENTE, factura.FECHA_FACT, factura.SUBTOTAL, factura.IVA, factura.TOTAL_NETO\n" +
                        "from factura, cliente\n" +
                        "where cliente.NO_CLIENTE=factura.NO_CLIENTE and factura.NO_FACTURA=?  ;");
             		sentencia11.setInt(1, consulta1);
                        ResultSet resul2=sentencia11.executeQuery();

                        System.out.println("nombre||apellido_p||apellido m        #cliente||   fecha||   subtotal|| iva|| total_neto");
			while (resul2.next()) {
				
				System.out.println(resul2.getString(1) + "\t" + resul2.getString(2)+"  \t\t"+ resul2.getString(3)+" \t"+ resul2.getInt(4) +" \t"+ resul2.getDate(5)+" \t"+resul2.getInt(6) +" \t"+ resul2.getDouble(7) +" \t"+ resul2.getDouble(8));
			}
                        resul2.close();
                        ps=leer.readLine();
                        metodos.cls();
                        }
                        break;
               case 2:
                    System.out.println("escriba el codigo de factura");
             consulta2=Integer.parseInt(leer.readLine());
                  metodos.comprueba2(consulta2, miConexion, ps, oni);
                   if(oni==1){
            PreparedStatement sentencia1=miConexion.prepareStatement("select producto.COD_PRODUCTO, producto.PRODUCTO, producto.PRECIO_PRODUCTO, detalle_factura.CANTIDAD, detalle_factura.IMPORTEE\n" +
"from producto, detalle_factura, cliente, factura \n" +
"where cliente.NO_CLIENTE=factura.NO_CLIENTE and factura.NO_FACTURA=detalle_factura.NO_FACTURA and detalle_factura.COD_PRODUCTO=producto.COD_PRODUCTO and factura.NO_FACTURA=?;");
           
             
            sentencia1.setInt(1, consulta2);
                   		ResultSet rs1=sentencia1.executeQuery();
                                 
                                 System.out.println("cod_producto|| nombre|| precio|| cantidad || importe");
            while(rs1.next()){
                
                System.out.println("\t"+rs1.getInt(1) + " \t" + rs1.getString(2)+" \t"+ rs1.getDouble(3)+"\t \t"+ rs1.getInt(4) +" \t"+ rs1.getDouble(5));
           }
            ps=leer.readLine();
            rs1.close();
            metodos.cls();
                   }
            break;
               case 3:
                         
            PreparedStatement sentencia2=miConexion.prepareStatement("select cliente.NO_CLIENTE, cliente.NOMBRE, cliente.APELLIDO_P,cliente.APELLIDO_M from cliente where cliente.NO_CLIENTE!=0 ");
                   		ResultSet rs2=sentencia2.executeQuery();
             System.out.println("# cliente||    nombre      || apellido_p    ||apellido_m");
            while(rs2.next()){
                System.out.println(rs2.getInt(1)+"\t\t"+rs2.getString(2)+"\t\t"+rs2.getString(3)+"\t\t"+rs2.getString(4));
           }
            ps=leer.readLine();
            rs2.close();
            metodos.cls();
      break;
      case 4:
                         
            PreparedStatement sentencia3=miConexion.prepareStatement("select producto.COD_PRODUCTO, producto.PRECIO_PRODUCTO, producto.DESCRIPCION_PROD,producto.PRODUCTO,producto.CLAVE_CATEGORIA from producto  ");
                   		ResultSet rs3=sentencia3.executeQuery();
                System.out.println("COD_PRODUCTO||PRECIO||DESCRIPCION||     NOMBRE||CLAVE_CAT");
            while(rs3.next()){
                System.out.println(rs3.getInt(1)+"\t\t"+rs3.getString(2)+"\t"+rs3.getString(3)+"\t"+rs3.getString(4)+"\t"+rs3.getString(5));
           }
            ps=leer.readLine();
            rs3.close();
            metodos.cls();
      break;
       case 5:
                         
            PreparedStatement sentencia4=miConexion.prepareStatement("select factura.NO_FACTURA, factura.NO_CLIENTE, factura.CONTRIBUYENTE,factura.FECHA_FACT,factura.TOTAL_ARTICULOS, factura.TOTAL_NETO from factura  ");
                   		ResultSet rs4=sentencia4.executeQuery();
                System.out.println("NO_FACTURA||  NO_CLIENTE||       CONTRIBUYENTE||            FECHA||                TOTAL_ART||  TOTAL_NETO ");
            while(rs4.next()){
                System.out.println(rs4.getInt(1)+"\t\t"+rs4.getString(2)+"\t\t\t"+rs4.getString(3)+"\t\t"+rs4.getString(4)+"\t\t"+rs4.getString(5)+"\t"+rs4.getString(6));
           }
            ps=leer.readLine();
            rs4.close();
            metodos.cls();
      break;
       case 6:
                         
            PreparedStatement sentencia5=miConexion.prepareStatement("select detalle_factura.DETALLE_FACT, detalle_factura.NO_FACTURA, detalle_factura.COD_PRODUCTO,detalle_factura.CANTIDAD,detalle_factura.IMPORTEE from detalle_factura  ");
                   		ResultSet rs5=sentencia5.executeQuery();
                System.out.println("DETALLE_FACT||  NO_FACTURA||    COD_PRODUCTO||     CANTIDAD||          IMPORTE");
            while(rs5.next()){
                System.out.println(rs5.getInt(1)+"\t\t"+rs5.getString(2)+"\t\t\t"+rs5.getString(3)+"\t\t"+rs5.getString(4)+"\t\t"+rs5.getString(5));
           }
            ps=leer.readLine();
            rs5.close();
            metodos.cls();
      break;
        }
            }while(opc!=7);
         }
        catch(Exception e){
            System.out.println("no funciona :C :v"); ///////INSTRUCCION QUE SE MANDA CUANDO EL CASE ESTA INCORRECTO
            e.printStackTrace();
        }
        
  
       
       
   }
}
class metodos{  ////////////// METODOS
    ///////bufer para leer los datos que se puedan llegar a utilizar
   
public static void cls(){ ////////7METODO PARA LIMPIAR PANTALLA
		//Limpiar pantalla en java
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
                
	

}
    public static int comprueba(int consulta1, Connection miConexion, String ps, int oni)throws IOException, SQLException{BufferedReader leer= new BufferedReader
				(new InputStreamReader (System.in));
        PreparedStatement sentencia=miConexion.prepareStatement("select factura.NO_FACTURA  FROM factura where factura.NO_FACTURA=?;");
			// ESTABLECER LOS PARAMETROS
			sentencia.setInt(1, consulta1);
			//sentencia.setString(2, "Miranda");
                        // ejecutar y recorrer la consuta
			ResultSet resul=sentencia.executeQuery();
                        if(resul.next()){
                            oni=1;
                            System.out.println("si existe");}
                        else{
                            oni=0;
                            System.out.println("este registro no existe");}
                        ps=leer.readLine();
                        metodos.cls();
                        return (oni);
    }
     public static int comprueba2(int consulta2, Connection miConexion, String ps, int oni)throws IOException, SQLException{BufferedReader leer= new BufferedReader
				(new InputStreamReader (System.in));
        PreparedStatement sentencia=miConexion.prepareStatement("select factura.NO_FACTURA  FROM factura where factura.NO_FACTURA=?;");
			// ESTABLECER LOS PARAMETROS
			sentencia.setInt(1, consulta2);
			//sentencia.setString(2, "Miranda");
                        // ejecutar y recorrer la consuta
			ResultSet resul=sentencia.executeQuery();
                        if(resul.next()){
                            oni=1;
                            System.out.println("si existe");}
                        else{
                            oni=0;
                            System.out.println("este registro no existe");}
                        ps=leer.readLine();
                        metodos.cls();
                        return (oni);
    }

    public static void menu(){
    System.out.println("\t\t\t M E N U  D E C O N S U L T A S ");
     System.out.println("\t\t\t ");
    System.out.println("\t\t\t A L U M N O :   C A R L O S   M A R Q U E Z   R O J A S");
     System.out.println("\t\t\t ");
    System.out.println("\t\t\t M A T E R I A : B A S E S   D E   D A T O S");
     System.out.println("\t\t\t ");
    System.out.println("\t\t\t T E C L E A   L A   O P C I O N   D E S E A D A: ");
    System.out.println("\t\t\t ");
    System.out.println("\t\t\t 1.-M O S T R A R  C O N S U L T A 1");
    System.out.println("\t\t\t ");
    System.out.println("\t\t\t 2.-M O S T R A R  C O N S U L T A 2");
    System.out.println("\t\t\t ");
    System.out.println("\t\t\t 3.-M O S T R A R    C L I E N T E S");
    System.out.println("\t\t\t ");
    System.out.println("\t\t\t 4.-M O S T R A R   P R O D U C T O S");
    System.out.println("\t\t\t ");
    System.out.println("\t\t\t 5.-M O S T R A R   F A C T U R A S");
    System.out.println("\t\t\t ");
    System.out.println("\t\t\t 6.-M O S T R A R   D E T A L L E S   D E   F A C T U R A S");
    System.out.println("\t\t\t ");
    System.out.println("\t\t\t 7.- S A L I R ");


    }
}