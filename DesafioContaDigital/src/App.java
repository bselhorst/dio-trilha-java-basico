public class App {
    public static void main(String[] args) throws Exception {

        // Testes
        // Criar duas contas, e ao criar, automaticamente cria a conta corrente e poupança
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente.setNome("Fulano");
        cliente2.setNome("Ciclano");

        // Depositar o valor na conta corrente
        cliente.getCc().depositar(10);
        
        // Aplicando na poupança o valor
        cliente.aplicarPoupanca(5);

        // Imprimindo o saldo para saber se está funcionando corretamente
        cliente.imprimirExtrato();

        // Utilizando o método geral de transferir, para transferir da conta corrente do cliente 1 para a conta poupança do cliente 2
        cliente.getCc().transferir(2, cliente2.getCp());

        // Imprimir o extrato das duas contas
        cliente.imprimirExtrato();
        cliente2.imprimirExtrato();

    }
}
