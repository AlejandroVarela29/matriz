import java.util.Scanner;
public class Pereza{

    public static void main(String[] args) {
        Scanner matriz = new Scanner(System.in);
        //Se le dan las instrucciones al usuario 
        System.out.println("En este progama se realizaran todos los calculos acerca de las matrices");
        System.out.println("Se le presentara un menu de opciones para los calculos de la matrices");
        System.out.println("1)Verificar que dos matrices son iguales");
        System.out.println("2)Sumar dos matrices");
        System.out.println("3)Generar una matriz cero de n x m");
        System.out.println("4)Obtener el inverso aditivo de una matriz n x m");
        System.out.println("5)Restar dos matrices");
        System.out.println("6)Multiplicar dos matrices compatibles");
        System.out.println("7)Obtener una matriz de identidad de tamaño n");
        System.out.println("8)Obtener la inversa de una matriz tamaño n");
        System.out.println("9)Obtener el determinate de una matriz tamaño n");
        System.out.println("10)Salir del programa");
        //Se pide el valor del switch
        byte elegir = matriz.nextByte();

        //Se declara el switch y sus casos

        switch (elegir) {
            case 1:

           
            //Pedirle el dato del tamaño de las matrices    
            System.out.println("Cual es el tamaño de la matriz I");
            //Declarar las variables 
            int i = matriz.nextInt();
            //Hacer lo mismo con el otro caso
            System.out.println("Cual es el tamaño de la matriz j");
             int j = matriz.nextInt();

              int[]  tamañoMatrizI = new int[i] ;
            int[] tamañoMatrizJ = new int[j] ;

            for(int x = 0; x<tamañoMatrizI.length; x++){
                System.out.println("El tamaño de i es " + tamañoMatrizI);
            }



            
            
           
              
                break;

            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
                
                break;

            case 8:
                
                break;

            case 9:
                
                break;

             case 10:
                
                break;

             case 11:
                
                break;

             case 12:
                
                break;
        
            default:
            System.out.println("Ingrese los valores antes mencionados");
            System.out.println("Saliendo del programa");
                break;
        }


    }
}  