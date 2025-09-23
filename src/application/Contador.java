package application;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosExcepition {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        terminal.close();        //chamando o método contendo a lógica de contagem
        contar(parametroUm, parametroDois);

    

    try {
        contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosExcepition e) {
        System.out.println( e.getMessage());
    }



    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExcepition {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm>=parametroDois){
            throw new InvalidParameterException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i=1; i<=contagem; i++){
            System.out.println("Imprimindo número " +i);

        }
    }
}
