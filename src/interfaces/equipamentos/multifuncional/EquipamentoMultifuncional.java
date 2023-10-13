package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via Equipamento Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento Multifuncional");

    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Equipamento Multifuncional");

    }

}