public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("89278");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("489200");
        //z400.ligar();
        
        // polimorfismo
        Veiculo coringa = z400;
    
        coringa.ligar();
    }

}
