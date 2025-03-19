package src.edu.paulo.pilarespoo.heranca.veiculo;

public abstract class Veiculos {
    private String placa;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public abstract void ligar();
}
