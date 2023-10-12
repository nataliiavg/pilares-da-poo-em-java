public class Carro {
    public void ligar() {
        confereCambio();
        confereCombustível();
        System.out.println("Carro ligado");
    }
    //encapsulando
    private void confereCombustível() {
        System.out.println("Conferindo combustível");

    }
    //encapsulando
    private void confereCambio() {
        System.out.println("Conferindo cambio em P");

    }
}