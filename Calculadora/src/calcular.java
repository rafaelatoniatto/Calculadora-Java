import java.util.Scanner;

public class calcular {

        public static void main(String[] args) {

            //Programa de uma calculadora
            double soma, divisao, multiplicacao, subtracao, num1, num2;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Insira um número: ");
            num1 = entrada.nextDouble();
            System.out.println("Insira outro número: ");
            num2 = entrada.nextDouble();

            soma = num1 + num2;

            subtracao = num1 - num2;

            multiplicacao = num1 * num2;

            divisao = num1 / num2;

            System.out.println("A soma dos números inseridos é: " + soma);
            System.out.println("A subtração dos números inseridos é: " + subtracao);
            System.out.println("A multiplicação dos números inseridos é: " + multiplicacao);
            System.out.println("A divisão dos números inseridos é: " + divisao);

            entrada.close();

         }
}



