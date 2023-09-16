import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorIntenet{
    @Override
    public void exibirPagina(String pagina) {
        autalizarPagina();
        System.out.println("exibe pagina: https://" +url+ ".com/");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adiciona pagina");
    }

    @Override
    public void autalizarPagina() {
        System.out.println("pagina atualizada");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("tocando: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica(List<String> listaDeMusicas, String nomeDaMusicaEscolhida) {
        var musicaSelecionada = listaDeMusicas.stream()
                .filter(musica -> musica.equalsIgnoreCase(nomeDaMusicaEscolhida))
                .findFirst()
                .orElseThrow( () -> new RuntimeException("musica nao existe"));

        System.out.println("coloca na fila de reproducao: " + musicaSelecionada);
        tocar(musicaSelecionada);
    }

}
