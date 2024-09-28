public class Cliente {
    
    private String nome;
    private Conta cc;
    private Conta cp;

    public Cliente() {
        // super();
        this.cc = new ContaCorrente(this);
        this.cp = new ContaPoupanca(this);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCc(Conta cc) {
        this.cc = cc;
    }

    public void setCp(Conta cp) {
        this.cp = cp;
    }

    public Conta getCc() {
        return this.cc;
    }

    public Conta getCp() {
        return this.cp;
    }

    public void aplicarPoupanca(double valor) {
        if(valor <= this.cc.getSaldo()){
            this.cc.sacar(valor);
            this.cp.depositar(valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }

    public void resgatarPoupanca(double valor) {
        if(valor <= this.cp.getSaldo()){
        this.cp.sacar(valor);
        this.cc.depositar(valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void imprimirExtrato(){
        System.out.println("===EXTRATO DA CONTA DE " + this.nome + " ===");
        System.out.println("Agência: " + cc.agencia);
        System.out.println("==Conta Corrente==");
        System.out.println("Número: " + this.cc.numero);
        System.out.println("Saldo: " + this.cc.saldo);
        System.out.println("==Conta Poupança==");
        System.out.println("Número Poupança: " + this.cp.numero);
        System.out.println("Saldo Poupança: " + this.cp.saldo);
        System.out.println("==========================================");
    }
    
}
