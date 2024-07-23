import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (InputMismatchException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws InvalidParameterException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new InvalidParameterException("O parâmetro um não pode ser maior que o parâmetro dois");
        else
            System.out.println("O primeiro parâmetro é menor do que o segundo parâmetro, OK");
        int contagem = parametroDois - parametroUm;
        System.out.println("Vamos imprimir " + contagem + " números, que representam a diferença entre o número 1 e o número 2, que são respectivamente " + parametroUm + " e " + parametroDois);
        //realizar o for para imprimir os números com base na variável contagem
        for(int i=1; i<=contagem; i++){
            System.out.println("Imprimindo o número "+ i);
        }
    }
}