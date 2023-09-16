public class Carta {
    private String naipe;
    private String valor;

    public Carta(String naipe, String valor) {
        if (!validarNaipe(naipe) || !validarValor(valor)) {
            throw new RuntimeException("Carta inválida: naipe ou valor não reconhecidos.");
        }
        this.naipe = naipe;
        this.valor = valor;
    }

    private boolean validarNaipe(String naipe) {
        return naipe.equals("Paus") || naipe.equals("Ouros") || naipe.equals("Espadas") || naipe.equals("Copas");
    }

    private boolean validarValor(String valor) {
        return valor.equals("1") || valor.equals("2") || valor.equals("3") || valor.equals("4") || valor.equals("5")
                || valor.equals("6") || valor.equals("7") || valor.equals("8") || valor.equals("9") || valor.equals("10")
                || valor.equals("Valete") || valor.equals("Dama") || valor.equals("Rei");
    }

    public String getNaipe() {
        return naipe;
    }

    public String getValor() {
        return valor;
    }
}



