import java.util.Date;

public class Operacao {

    double valor;
    Date data;
    char tipo;


    void imprimir() {
        System.out.printf("%s\t%s\t%s\n", this.data, this.tipo, this.valor);
    }
}
