//9 - Criar uma calculadora simples de quatro operações (+ - * /).

import java.util.Scanner;
public class Exercicio09 {
public static void main (String[]args) {
    Scanner scanner = new Scanner( System.in);

    System.out.println("CALCULADORA \n");

    System.out.println("INSIRA UM NUMERO:");
    double num1 = scanner.nextDouble();

    System.out.println("DIGITE O OPERADOR (+, -,*,/):");
   char operador = scanner.next().charAt(0);

   System.out.println("INSIRA OUTRO NUMERO:");
   double num2 = scanner.nextDouble();
   double resultado;
   switch (operador) {
    case '+':
    resultado = num1+num2;
        System.out.println("resultado:"+resultado);
        break;
        case '-':
        resultado = num1-num2;
        System.out.println("resultado:"+resultado);
        break;
case '*':
resultado = num1*num2;
System.out.println("resultado:"+resultado);
break;
case '/':
if (num2 != 0 ){
    resultado = num1/num2;
System.out.println("resultado:"+resultado);
break;
}
else {
 System.out.println("Erro: divisao por zero.");
   
}

   
    
        break;
        default:
         System.out.println("operador invalido");
   }
  
   scanner.close();
}

}
