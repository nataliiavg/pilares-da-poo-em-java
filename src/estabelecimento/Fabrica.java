package estabelecimento;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.digitalizadora.Scanner;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
       Scanner scanner = new Scanner();
       
        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
