public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton")

        Conta corrente = new ContaCorrente(venilton);
        Conta poupanca = new ContaCorrente(venilton);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();



    }
}