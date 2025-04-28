package FinalProject;

public class Cuenta {
    private double saldo = 1000;

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    private void retirar(double cantidad){
        saldo -= cantidad;
    }


}
