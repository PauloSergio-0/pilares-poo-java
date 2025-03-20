package src.edu.paulo.pilarespoo.interfacepoo.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {
    @Override
    public void digitalizar() {
        System.out.println("Scanner está digitalizando");
    }
}
