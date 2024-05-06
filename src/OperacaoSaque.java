import java.util.Date;

public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor)
    {
        this.tipo = 's';
        this.valor = valor;
        data = new Date();
    }
}
