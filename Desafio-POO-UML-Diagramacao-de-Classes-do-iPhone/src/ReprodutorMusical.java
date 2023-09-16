import java.util.List;

public interface ReprodutorMusical {
    void tocar(String musica);
    void pausar();
    void selecionarMusica(List<String> listaDeMusicas, String nomeDaMusicaEscolhida);
}
