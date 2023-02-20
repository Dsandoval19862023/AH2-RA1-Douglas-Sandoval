
package case1;

import java.util.Random;
import java.util.Scanner;

public class Serpientes {
  @SuppressWarnings("empty-statement")
  public static void main(String[] args) {
      
      ///CREACION DE VARIALES
    Scanner ds = new Scanner(System.in);
    int opcion;
    int Posicion =0;
    int Mover=0;
    boolean Salir = false;
     int Rx = 64;
     int Tablero [][]= new int [8][8];
     char Variable [][] = new char [8][8];
       char Trampas [][] = new char [8][8];
     /////MENU PRINCIPAL
     boolean Gat = true;
     Random Ale = new Random();

        System.out.println("=====MENU PRINCIPA======");
        System.out.println("1. Iniciar el Juego");
        System.out.println("2. Renaudar el Juego");
        System.out.println("3. Salir");
        
        System.out.println("Introduce la opcion que desear ejecutar");
        opcion = ds.nextInt();
        ///SECCIONES DEL MENU PRINCIPAL
        switch (opcion){
            ///1    
            case 1:
                 for (int Fil = 0; Fil < Tablero.length; Fil++){
                 if (Gat) {
                     for (int Col = Tablero.length - 1; Col >= 0;Col--) {
                         Tablero [Fil][Col]= Rx;
                         Rx--;
                     }
                     Gat=false;
                 } else {
                     for (int Col = 0; Col < Tablero[Fil].length; Col++) {
                       Tablero [Fil][Col]= Rx;
                         Rx--;
                         
                     }Gat=true;
                 }
             } 
                
               break;
            //2
            case 2: 
                System.out.println("Retomar el juego");
               break;
            //3   
            case 3:
                    System.out.println("Sali del sistema");
                    Salir = true;
                    break;   
        }   
            Trampas [4][4] = '#';   
        Trampas [7][7] = '#';
        Trampas [7][4]= '#';
        Variable[7][7] = '@';
       while (Posicion<64) {          
            System.out.println("---------------------------------");
       for (int Fil = 0; Fil < Tablero.length; Fil++) {
           for (int Col = 0; Col <Tablero[Fil].length; Col++) {
               //if (Tablero[Fil][Col]<10) {
                 //      System.out.print("|  "+ Tablero[Fil][Col]);
                   //    Gat= false; 
                //} 
                //else {
                      System.out.print("| "+ Tablero[Fil][Col]);
               //} Gat=true;
            }
           System.out.println(" |");
            for (int Col = 0; Col < Variable.length; Col++) {
                System.out.print("|"+ Trampas [Fil][Col] + Variable[Fil][Col]);
                
            }
           System.out.println(" |");
                    System.out.println("---------------------------------");
                     
      }
        for (int Fil = 0; Fil < Variable.length; Fil++) {
               for (int Col = 0; Col < Variable.length; Col++) {
                   Variable[Fil][Col] = ' ';
                    }
        }
           System.out.println("Desear tirar el daro con r o regresar al menu con p");
           String Operacion = ds.nextLine();
           switch(Operacion){
               case "r":
                   int dado = (int) (Math.random()*(6-2)+2);
                   System.out.println("Tu dado salio con "+ dado);
                   Operacion += dado;
                   Mover +=dado;
                   if (Mover >=56) {
                       Variable[0][Mover - 64]='@';
                   }else if (Mover >=48){ 
                      Variable[1][56-Mover]='@'; 
                   } else if (Mover >=40){
                      Variable[2][Mover - 41]='@'; 
                   }else if (Mover >=32){
                      Variable[3][40-Mover]='@'; 
                   }else if (Mover >=24){
                      Variable[4][Mover -25]='@'; 
                   }else if (Mover >=16){
                      Variable[5][24-Mover]='@'; 
                   }else if (Mover >=8){
                      Variable[6][Mover-8]='@'; 
                   }else {
                     Variable[7][7-Mover]='@';
                   }
                   break;
               case "p":
                   System.out.println("Oprimio P");
           break;
           }
         
            }
      
}
    }
    

    