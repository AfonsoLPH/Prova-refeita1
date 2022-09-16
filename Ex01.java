import java.util.*;
public class Ex01{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        double largura,altura,comprimento,area,caixas;
         

        System.out.println("Informe o valor da largura, comprimento e altura respectivamente: ");

        largura = in.nextDouble();
        comprimento = in.nextDouble();
        altura = in.nextDouble();
        area = altura * comprimento + altura * comprimento + largura * altura + largura * altura;
        caixas = area / 1.5;

        System.out.println("o numero de caixas necessarios é de aproximadamente:" + caixas + "caixas");


    }
}


