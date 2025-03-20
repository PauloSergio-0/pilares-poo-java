package src.edu.paulo.pilarespoo.interfacepoo.equipamentos.multifuncional;

import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.copiadora.Copiadora;
import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.digitalizadora.Digitalizadora;
import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

    @Override
    public void copiar() {
        System.out.println("Copiando pelo multifunção");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo pelo multifunção");

    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando pelo multifunção");

    }
}
