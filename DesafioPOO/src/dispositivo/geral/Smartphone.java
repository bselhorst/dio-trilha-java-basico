package dispositivo.geral;
import funcionalidades.equipamento.AparelhoTelefonico;
import funcionalidades.equipamento.ReprodutorMusical;
import funcionalidades.software.NavegadorInternet;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo página");        
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando página");
        
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionando nova aba");        
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Música selecionada " + musica);
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando música");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando música");
    }
}
