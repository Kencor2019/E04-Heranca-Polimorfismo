public class CPF extends Cliente {

    String cpf;
    int idade;
    char sexo;

    public CPF(String nome, String cpf, String endereco, int idade, char sexo)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.sexo = sexo;
        this.saldo = 1000;
        this.op = new Operacao[100];
        this.myop = 0;

    }

    public void imprimir() {
        System.out.println("===== Conta =====");
        System.out.println("Dono: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
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
