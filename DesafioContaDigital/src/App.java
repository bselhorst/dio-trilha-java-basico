public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();

        cliente.setNome("Bruno");
        
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
