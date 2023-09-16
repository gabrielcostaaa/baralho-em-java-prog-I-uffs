import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> pilhaCartas = new ArrayList<>();

    public Baralho() {
        String[] naipes = { "Paus", "Ouros", "Espadas", "Copas" };
        String[] valores = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };

        for (String naipe : naipes) {
            for (String valor : valores) {
                pilhaCartas.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(pilhaCartas);
    }

    public Carta pescar() {
        if (pilhaCartas.isEmpty()) {
            throw new RuntimeException("Baralho vazio, não é possível pescar mais cartas.");
        }
        return pilhaCartas.remove(pilhaCartas.size() - 1);
    }
}
