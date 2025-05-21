//1 - Escreva um programa que receba dois números inteiros e exiba a soma deles.
 
 import java.util.Scanner; // Importando a classe Scanner para ler entradas do usuário

 public class Exercicio01 {
    public static void main(String[] args){
        int n1, n2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor para N1: ");    
        n1 = scanner.nextInt();
        System.out.println("Digite o valor para N2: ");    
        n2 = scanner.nextInt();

        System.out.println("A soma de N1 e N2 é: " + (n1 + n2));
        scanner.close();
    }
}
