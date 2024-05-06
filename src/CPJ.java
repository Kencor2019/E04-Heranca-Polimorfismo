public class CPJ extends Cliente {

    String cnpj;
    int numFuncionarios;
    String setor;

    public CPJ(String nome, String cnpj, String endereco, int numFuncionarios, String setor)
    {
        this.nome = nome;
        this.numFuncionarios = numFuncionarios;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.setor = setor;
        this.saldo = 10000;
        this.op = new Operacao[100];
        this.myop = 0;

    }

    public void imprimir() {
        System.out.println("===== Conta =====");
        System.out.println("Dono: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Número de Funcionarios: " + this.numFuncionarios);
        System.out.println("Setor: " + this.setor);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("====================");
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
            return false;
        }

        this.saldo -= valor;

        this.op[myop] = new OperacaoSaque(valor);
        this.op[myop].imprimir();
        this.myop++;
        return true;

    }

    public void depositar(double valor) {
        this.saldo += valor;

        this.op[myop] = new OperacaoDeposito(valor);
        this.op[myop].imprimir();
        this.myop++;

    }

}
