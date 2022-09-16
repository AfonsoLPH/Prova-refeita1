import java.util.*;
public class Ex03{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int contador = 0, valor,pares=0,impares=0,multiplos3=0,maior=0,menor=9999999;
        

        while( contador <= 20){

            
            System.out.println("Insira um valor");
            valor = in.nextInt();
            
            
            if (valor<=0){
                System.out.println("Valor invalido, digite novamente outro valor");
            }
             else if(valor%2 ==0){
                pares++;
                System.out.println(valor + "é par");

            } else{
                impares++;
                System.out.println(valor + "é impar");

            } if (valor%3==0){
                multiplos3++;
                System.out.println("é divisivel por 3");
                
            }else{
                System.out.println("Não é divisivel por 3");

            } if(valor < menor){
                menor=valor;
                System.out.println(valor + "é o menor valor");

            }if (valor > maior ){
                maior = valor;
                System.out.println(valor + "é o maior valor ");

            }
            
            contador++;
        }
    }
}