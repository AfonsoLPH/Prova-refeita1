import java.util.*;
public class Ex02{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        double lado,perimetro;
        int  valor;

        System.out.println("Insira o numero de lados do poligono:");

        valor = in.nextInt();

        if(valor==3){
            System.out.println("Insira o valor de seus lados:");

            lado = in.nextDouble();
            perimetro = lado*valor;

            System.out.println( " TRIANGULO, com o valor de perimetro :" + perimetro);

        }else if(valor==4){

            System.out.println("Insira o valor de seus lados:");
            
            lado = in.nextDouble();
            perimetro = lado*valor;  

            System.out.println( " QUADRADO, com o valor de perimetro :" + perimetro);

        
        }else if (valor==5){
            System.out.println("Insira o valor de seus lados:");

            lado = in.nextDouble();
            perimetro = lado * valor;

            System.out.println( " PENTAGONO, com o valor de perimetro :" + perimetro);
        }else{
            System.out.println("FIGURA DESCONHECIDA");
        }
    }
}