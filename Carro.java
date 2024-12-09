public class Carro{
    String modelo = "Gol";
    int velocidade = 0;
    int aceleracao = 10;
    int marcha = 0;
    
    static void ligarCarro(){
        System.out.println("Ligando o carro.");
    }
    static void desligarCarro(){
        System.out.println("Desligando o carro.");
    }
    void acelerar(){
        velocidade += aceleracao;
        System.out.println("Acelerando. velocidade atual: " + velocidade);;
    }
    void desacelerar(){
        velocidade -= aceleracao;
        System.out.println("Desacelerando. velocidade atual: " + velocidade);
    }
    static void virarDireita(){
        System.out.println("Virando o carro para a direita");
    }
    static void virarEsquerda(){
        System.out.println("Virando o carro para a esquerda");
    }
    void subirMarcha(){
            marcha++;
            System.out.println("Subindo marcha. Marcha atual: " + marcha);
    }
    void baixarMarcha(){
            marcha--;
            System.out.println("Baixando marcha. Marcha atual: " + marcha);
    }
    public static void main (String[] args) {
        Carro carro = new Carro();
        
        carro.ligarCarro();
        carro.acelerar();
        carro.subirMarcha();
        carro.desacelerar();
        carro.baixarMarcha();
        carro.virarEsquerda();
        carro.virarDireita();
        carro.desligarCarro();
    }

}

