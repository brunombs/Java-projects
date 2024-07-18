import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Aqui o Java vai pedir para o usuário digitar o número da conta dele e irá armazenar essa informação. (int)
        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();


        // Aqui o Java vai pedir para o usuário digitar o número da agência dele e irá armazenar essa informação. (string)
        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();


        // Aqui o Java vai pedir para o usuário digitar o nome dele e irá armazenar essa informação. (string)
        System.out.println("Digite o seu nome: ");
        scanner.nextLine();
        String nome_cliente = scanner.nextLine();


        // Aqui o Java vai pedir para o usuário digitar o saldo dele e irá armazenar essa informação. (double)
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá, " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " e conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}