import java.util.Date;

public class OperacaoDeposito extends Operacao {

    public OperacaoDeposito(double valor)
    {
        this.tipo = 'd';
        this.valor = valor;
        data = new Date();
    }

}
