package src.edu.paulo.pilarespoo.heranca.veiculo;

public class Carro extends Veiculos {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String newPlaca){
        this.placa = newPlaca;
    }
    public void ligar(){
        conferirOleo();
        conferirCombustivel();
        System.out.println("Ligar carro");
    }

    private void conferirCombustivel(){
        System.out.println("Verificando nivel de combistivel");
    }


    private void conferirOleo(){
        System.out.println("Verificando nivel de oleo");
    }

}
