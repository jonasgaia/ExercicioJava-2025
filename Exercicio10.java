//10 - Escreva um programa que ordene um array de números em ordem

import java.util.Arrays;

public class Exercicio10 {
    public static void main(String[]args){
        int[] num= {8,9,45,35,3};
        System.out.println("numeros sem sequencia:"+Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("numeros em sequencia: "+Arrays.toString(num));
    }
}
