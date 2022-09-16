import java.util.*;
public class Ex04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int repeticoes = in.nextInt();

        double numerador =1, denominador =1;

        while(repeticoes >0){
            System.out.println("NUMERADOR" + numerador);
            System.out.println("NUMERADOR" + denominador);

            soma = soma + numerador / denominador;

            numerador = numerador *-1;
            denominador = denominador += 2;

            repetiçoes--;
        }
    }
    
}
