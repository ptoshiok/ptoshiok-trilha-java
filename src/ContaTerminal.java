import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero = 0;
        double saldo = 0;
        String agencia = "", nomeCliente = "";

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite o numero da Conta:  Exemplo: 1234");
            numero = scan.nextInt();

            System.out.println("Digite o numero da Agencia:  Exemplo: 000-0");
            agencia = scan.next();

            System.out.println("Por favor, digite seu nome:");
            nomeCliente = scan.next();

            System.out.println("Qual valor do seu saldo inicial?");
            saldo = Double.valueOf(scan.next());

        } catch (Exception e) {
            scan.nextLine();
            System.out.println("Excecao  " + e);
            System.out.println("Por favor, insira o dado corretamente");
        }

        System.out.println("Olá " +  nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
        scan.close();
    }
}
