public class Televisao {
    int tamanhoTela;
    int volume;
    String marca;
    int voltagem;
    int canal;
    boolean ligada;

    public Televisao(int tamanhoTela, String marca, int voltagem, int canal) {
        this.tamanhoTela = tamanhoTela;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = voltagem;
        this.canal = canal;
        this.ligada = false;
    }

    void ligar() {
        if (!ligada) {
            ligada = true;
            int consumo = voltagem * tamanhoTela;
            System.out.println("A TV está ligada! Consumo: " + consumo + "W");
        } else {
            System.out.println("A TV já está ligada!");
        }
    }

    void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A TV está desligada.");
        } else {
            System.out.println("A TV já está desligada!");
        }
    }

    void aumentarVolume() {
        if (ligada) {
            if (volume < 10) {
                volume++;
                System.out.println("Volume atual: " + volume);
            } else {
                System.out.println("O volume já está no máximo!");
            }
        } else {
            System.out.println("Ligue a TV antes de aumentar o volume.");
        }
    }

    void diminuirVolume() {
        if (ligada) {
            if (volume > 1) {
                volume--;
                System.out.println("Volume atual: " + volume);
            } else {
                System.out.println("O volume já está no mínimo!");
            }
        } else {
            System.out.println("Ligue a TV antes de diminuir o volume.");
        }
    }

    void subirCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Ligue a TV antes de mudar o canal.");
        }
    }

    void descerCanal() {
        if (ligada) {
            if (canal > 1) {
                canal--;
                System.out.println("Canal atual: " + canal);
            } else {
                System.out.println("Você já está no menor canal!");
            }
        } else {
            System.out.println("Ligue a TV antes de mudar o canal.");
        }
    }
       public static void main(String[] args) {

        Televisao minhaTV = new Televisao(32, "LG", 110, 3);

        minhaTV.ligar();
        minhaTV.aumentarVolume();
        minhaTV.subirCanal();
        minhaTV.descerCanal();
        minhaTV.diminuirVolume();
        minhaTV.desligar();
    }
}