package src.edu.paulo.pilarespoo.heranca;

import src.edu.paulo.pilarespoo.heranca.veiculo.Carro;
import src.edu.paulo.pilarespoo.heranca.veiculo.Moto;
import src.edu.paulo.pilarespoo.heranca.veiculo.Veiculos;

public class Autotromo {

    public static void main(String[] args) {
        Carro uno = new Carro();
        uno.setPlaca("pashngf12");
        // uno.ligar();

        Moto biz = new Moto();
        biz.setPlaca("kym13");
        // biz.ligar();
        //System.out.println(biz.getPlaca());

        Veiculos coringa = uno;

        coringa.ligar();
    }

}
