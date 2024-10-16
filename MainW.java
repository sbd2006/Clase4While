import java.util.Scanner;

public class MainW {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
         
        int numeroEntrada = 0, resultado = 0, control = 0;
        
       System.out.println("Ingrese el numero que desea calcular : ");
        numeroEntrada = sc.nextInt();

        LogicW answer  = new LogicW(numeroEntrada, resultado, control);
        answer.CalculoNumero();
        sc.close();






    }

}   