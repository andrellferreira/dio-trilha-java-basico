import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 100.0;
        String nome_cliente;
        String agencia;
        int conta;

        // Obter pelas classe Scanner os valores digitados no terminal
        System.out.println("Por favor, informe o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, informe o número da conta:");
        conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, informe o nome do cliente:");
        nome_cliente = scanner.nextLine();

        System.out.println(
                "Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco! sua agência é a " + agencia
                        + ", sua conta: " + conta + ". Seu saldo: R$" + saldo + " já está disponível para saque!");

        // Exibir a mensagem da conta criada
    }

}
