package src.edu.paulo.pilarespoo.interfacepoo.estabeleceminto;

import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.copiadora.Copiadora;
import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.digitalizadora.Digitalizadora;
import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.impressora.Deskjet;
import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.impressora.Impressora;
import src.edu.paulo.pilarespoo.interfacepoo.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {

    public static void main(String[] args) {
        EquipamentoMultifuncional hp_MF = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();
        // o hp_MF ele é um Copiadora, Impressora e digitalizadora
        // diferente de deskjet
        Impressora impressora = hp_MF;
        Copiadora copiadora = hp_MF;
        Digitalizadora digitalizadora = hp_MF;


        hp_MF.digitalizar();
        hp_MF.copiar();
        hp_MF.imprimir();

    }
}
