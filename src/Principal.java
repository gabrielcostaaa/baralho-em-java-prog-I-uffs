import java.util.List;
import java.util.ArrayList;

// AUTORIA DOS CÓDIGOS: GABRIEL SANTOS COSTA
// MATRÍCULA> 2311100036
// --> foi utilizado em uma pequena parte do código assistente inteligente para mínimas correções

public class Principal {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.embaralhar();

        List<Carta> maoJogador = new ArrayList<>();

        try {
            for (int i = 0; i < 7; i++) {
                Carta carta = baralho.pescar();
                maoJogador.add(carta);
            }
        } catch (RuntimeException e) {
            System.out.println("Baralho vazio, não é possível pescar mais cartas.");
        }

        System.out.println("Cartas na mão do jogador:");
        for (Carta carta : maoJogador) {
            System.out.println(carta.getValor() + " de " + carta.getNaipe());
        }
    }
}
