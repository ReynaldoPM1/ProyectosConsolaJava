package cmeans;

/*++
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Rey
 */
public class CMeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variebles a usar
        int menu, cantidadVariables=0, grupos=0, i,j;
        int centro [] = null;
        int salv=0, salv2=0;
        double centroCal= 0.0;
        double centroCal2 = 0.0;
        int centro2 [] = null;
        int matriz [][]= null;
        int matrizDerecha [][]= null;
        int matrizIzquierda [][]= null;
        // TODO code application logic here
        //int matriz [] [] = new int [][];
        do{
        menuPrincipal();
        menu=leerEntero();
        switch(menu){
            case 1:
                System.out.println("Cuantas vaiables se usaran");
                cantidadVariables=leerEntero();
                break;
            case 2:
                System.out.println("Cuantos grupos se formaran");
                grupos=leerEntero();
                break;
            case 3:
                centro = new int[grupos];
                centro2 = new int[grupos];
                System.out.println("Elija los centros");
                System.out.println("Centro 1");
                for(i=0;i<=(grupos-1);i++){
                    System.out.println("Elija el numero  "+(i+1)+" del centro");
                    centro[i]=leerEntero();
                }
                System.out.println("Centro 2");
                for(i=0;i<=(grupos-1);i++){
                    System.out.println("Elija el centro numero "+(i+1));
                    centro2[i]=leerEntero();
                
                }
                break;
            case 4:
                matriz = new int [cantidadVariables][grupos];
                matrizDerecha = new int [cantidadVariables][grupos];
                matrizIzquierda = new int [cantidadVariables][grupos];
                for(i=0;i<=(cantidadVariables-1);i++){
                   for(j=0;j<=(grupos-1);j++){
                       System.out.println("escriba el numero  "+ (j+1)+ "de la fila "+(i+1));
                       matriz [i][j]=leerEntero();
                   }
                }
                
                break;
                case 5:
                double matrizPromedio [] = new double [cantidadVariables];
                int suma,suma2, prom=0, centroPromedio=0, centroPromedio2=0, l=0,ll=0,mm=0,nn=0;
                double  centrof=0.0F,centrof2=0.0F;
                
                for(i=0;i<=(cantidadVariables-1);i++){//sacamos el promedio de los obejtos
                    for(j=0;j<=(grupos-1);j++){                           
                             suma=matriz[i][j]; 
                             prom=prom+suma;
                    }
                    matrizPromedio [i]=(double)prom/grupos;
                }
                 
                for(i=0;i<=(grupos-1);i++){//sacamos promedio de los 2 centros
                    suma=centro[i];
                    centroPromedio=centroPromedio+suma;
                    suma2=centro2[i];
                    centroPromedio2=centroPromedio2+suma2;
                }
                centrof=(double)centroPromedio/grupos;
                centrof2=(double)centroPromedio2/grupos;
                
                double diferencia=0, diferencia2;
                
                for(i=0;i<=(cantidadVariables-1);i++){
                    diferencia=(double)matrizPromedio[i]-centrof;//1.5-2.5=1
                    diferencia2=(double)matrizPromedio[i]-centrof2;//1.5-8.5=-7
                    if(0>=diferencia) diferencia=(diferencia*(-1));     
                    if(0>diferencia2) diferencia2=(diferencia2*(-1));

                    
                    if(diferencia<=diferencia2){
                        for(l=0;l<=(grupos-1);l++){
                        matrizDerecha[nn][l]=matriz[i][l];
                        }
                        nn++;
                    }else
                    {
                        for(ll=0;ll<=(grupos-1);ll++){
                        matrizIzquierda[mm][ll]=matriz[i][ll];
                        }
                        mm++;
                    }
                }
                    System.out.println("Centro derecho");
                for(i=0;i<=nn-1;i++){
                    for(j=0;j<=grupos-1;j++){
                        System.out.print(matrizDerecha[i][j]+" ");
                    }
                    System.out.println("");
                }
                    System.out.println("centro izquierda");
                for(i=0;i<=mm-1;i++){
                    for(j=0;j<=grupos-1;j++){
                        System.out.print(matrizIzquierda[i][j]+" ");
                    }
                    System.out.println("");
                }

              
                if(matrizDerecha.length!=matrizIzquierda.length){
                    System.out.println("ya fue toda we");
                }else{
                    do{
                //calculamos centros de nuevo
                //centro de la derecha
                centroCal=0; centroCal2=0;
                double temp=0; prom=0;
                for(i=0;i<=(nn-1);i++){//sacamos el promedio de los obejtos
                    //prom=0;
                    for(j=0;j<=(grupos-1);j++){
                             suma=matrizDerecha[i][j]; 
                             prom=prom+suma;
                    }
                    centroCal=centroCal+((double)prom/grupos);
                }
                //temp=grupos*nn;
                centroCal=centroCal/nn;
               // centroCal=centroCal/grupos;
                    
                //Centro de la izquierda
                prom=0;temp=0;
                for(i=0;i<=(mm-1);i++){//sacamos el promedio de los obejtos
                    //prom=0;
                    for(j=0;j<=(grupos-1);j++){     
                             suma=matrizIzquierda[i][j]; 
                             prom=prom+suma;
                    }
                    centroCal2=((double)prom/grupos);
                    
                }
                    //temp=grupos*mm;
                    centroCal2=centroCal2/mm;
                    System.out.println("centro 1 "+ centroCal+"\n centro 2 "+ centroCal2);
                          nn=0; mm=0;
                    for(i=0;i<=(cantidadVariables-1);i++){
                        diferencia=(double)matrizPromedio[i]-centroCal;//5.5-3.5=2
                        diferencia2=(double)matrizPromedio[i]-centroCal2;//5.5-8.5=3
                        if(0>=diferencia) diferencia=(diferencia*(-1));     
                        if(0>diferencia2) diferencia2=(diferencia2*(-1));
                        if(diferencia>=diferencia2 ){
                            for(l=0;l<=(grupos-1);l++){
                            matrizDerecha[nn][l]=matriz[i][l];
                            }
                            nn++;
                        }else
                        {
                            for(ll=0;ll<=(grupos-1);ll++){
                            matrizIzquierda[mm][ll]=matriz[i][ll];
                            }
                            mm++;
                        }
                    }
                        System.out.println("centro Derecha");
                    for(i=0;i<=nn-1;i++){
                        for(j=0;j<=l-1;j++){
                            System.out.print(matrizDerecha[i][j]+" ");
                        }
                        System.out.println("");
                    }
                        System.out.println("Centro izquierda");
                    for(i=0;i<=mm-1;i++){
                        for(j=0;j<=ll-1;j++){
                            System.out.print(matrizIzquierda[i][j]+" ");
                        }
                        System.out.println("");
                    }
                       // salv=matrizDerecha.length;
                       // salv2=matrizIzquierda.length;
                       salv++;
                }while(salv!=4);
                }
                
                 
                    System.out.println("teminamos");
                break;
                case 6:
                System.out.println("Gracias por ponernos 10 :D");
                i=leerEntero();
                break;
            default:
                break;
        }
        }while(menu!=6);
    }
    
    public static void menuPrincipal(){
        System.out.println("Bievenido");
        System.out.println("1.- Variables a utilizar");
        System.out.println("2.- Grupos a formar");
        System.out.println("3.- centros a elegir");
        System.out.println("4.- Insertar matriz");
        System.out.println("5.- Iterar");
        System.out.println("6.- Salir");
    }
    
    
     public static Scanner t= new Scanner(System.in);
     
     public static int leerEntero()
    {
        String resultado = null;
        while (true)
        {
            resultado = t.nextLine();
            if (comprobarEntero(resultado))
                break;
            else
                System.out.println("Introduzca un nÃºmero entero");
        }
        return Integer.parseInt(resultado);
    }
     
      public static boolean comprobarEntero(String s)
    {
        try
        {
            Integer.parseInt(s);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }
}
