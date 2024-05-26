import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0.0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        numero = entrada.nextInt();
        entrada.nextLine(); // Consumir a quebra de linha após a entrada do número

        System.out.println("Por favor, digite o número da Agência!");
        agencia = entrada.nextLine(); // Lê a linha inteira

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = entrada.nextLine(); // Lê a linha inteira

        System.out.println("Por favor, digite o saldo do cliente:");
        saldo = entrada.nextDouble(); // Lê o valor float

        

        // Formatar a saída para melhor leitura
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
