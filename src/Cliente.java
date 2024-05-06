import java.util.Date;

public class Cliente {

    String endereco;
    String nome;
    Date data;
    double saldo;
    Operacao[] op;
    int myop;

    public void imprimir() {
        System.out.println("===== Conta =====");
        System.out.println("Dono: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("====================");
    }


}
