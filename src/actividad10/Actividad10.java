/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad10;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Actividad10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key= new Scanner (System.in);
 
        
        int tamano=solicitaentero("el tamaño del arreglo: ");
        int [][] a= arreglo("A",tamano);
        int [][] b= arreglo("B",tamano);
        
        imprimirmatriz("Matriz A",a);
        imprimirmatriz("Matriz B",b);
        
        matrizresta(a,b);
        matrizmultiplicacion(a,b);
        
        
    }


       public static int solicitaentero(String b){
            Scanner key = new Scanner (System.in);
        boolean flag;
        int a=0;
        do{
            try{
        System.out.println("Escribe "+b);
        a=key.nextInt();
        flag=false;
        
            }
            catch(Exception e){
                System.out.println("Error");
                key.next();
                flag=true;
            }
        }
        while(flag);
        return a;       
    }
                
        public static int[][] arreglo(String a,int tamano){
           
      int [][]arreglo = new int [tamano][tamano];
            System.out.println("Arreglo "+a);
      
        for (int i=0; i<arreglo.length;i++){
        for (int j=0;j<arreglo[i].length;j++){
        arreglo[i][j]= solicitaentero("un número entero: ");
        }
        }
        return arreglo;
        }
        
        public static void matrizmultiplicacion(int[][]a,int[][]b){
        int [][] r= new int [a.length][a.length];
        int [][] r2= new int [a.length][a.length];

         System.out.println("Multiplicación de matriz A y B:");
         for (int i=0; i<a.length;i++){           
        for (int j=0;j<a.length;j++){  
        for (int k = 0; k < a.length; k++) {
                    r[i][j]=a[i][k]*b[k][j];
              r2[i][j]=r2[i][j]+r[i][j];
                       
        System.out.print("["+r[i][j]+"]");        
        }           
        }
        System.out.println();
         }
         
         
         System.out.println("Suma de dichas multiplicaciones:");
                  for (int i=0; i<a.length;i++){           
        for (int j=0;j<a.length;j++){ 
            r2[i][j]=0;  
        for (int k = 0; k < a.length; k++) {
                    r[i][j]=a[i][k]*b[k][j];
              r2[i][j]=r2[i][j]+r[i][j];  
        } 
        System.out.print("["+r2[i][j]+"]");           
        }
        System.out.println();
         }
         
        }
        
                public static int[][] matrizresta(int[][]a,int[][]b){
        int [][] r= new int [a.length][a.length];
         System.out.println("Resta de las matrices::");
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a.length;j++){
            r[j][i]=a[i][j]-b[i][j];
            System.out.print("["+r[j][i]+"]");
        }
            System.out.println();
        }
        return r;
        }
    
        public static void imprimirmatriz(String x,int a[][]){
        System.out.println(x);
        for (int i=0; i<a.length;i++){
        for (int j=0;j<a[i].length;j++){
            System.out.print("["+a[i][j]+"]");
        }
            System.out.println();
        }
            
        }
}