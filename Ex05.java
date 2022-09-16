import java.util.*;
public class Ex05 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        int valor,divisor =2; 

        valor = in.nextInt();

        while (valor >1){
            if(valor % divisor ==0) {
                System.out.println(divisor);
                valor = valor / divisor;
                if (valor% divisor!=0) System.out.println();
            } else {
                divisor++;
            }
        }

    }
}
