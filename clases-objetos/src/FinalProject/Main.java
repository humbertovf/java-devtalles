package FinalProject;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("juan Perez", 10000.00);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();

//        Cuenta c = new Cuenta();
//        c.depositar(500);
//        c.retirar(300);
//        System.out.println("Operacion completada");
    }
}
