
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaMusicas = new ArrayList<>();
        listaMusicas.add("Jeremy");
        listaMusicas.add("Hunger Strike");
        listaMusicas.add("Smells Like Teen Spirit");

        Iphone iphone = new Iphone();
        iphone.ligar(80898765);
        iphone.selecionarMusica(listaMusicas, "Jeremy");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("google");


    }
}