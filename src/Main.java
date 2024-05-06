public class Main {
    public static void main(String[] args)
    {

        CPF joao = new CPF("João", "111.111.11-11", "Av. Antonio Carlos, 6627", 36, 'm');

        joao.depositar(200); joao.sacar(300); joao.depositar(20); joao.depositar(200); joao.depositar(200);
    }
}
