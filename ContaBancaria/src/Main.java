public class Main {
    public static void main(String[] args) {
        ContaBanco cliente01 = new ContaBanco(6993,"CC","Leticia Batista Rocha");

        cliente01.abrirConta();
        System.out.println("\nNumero da conta: "+cliente01.numConta+"\nTipo da conta: "+cliente01.tipo+"\nO saldo da conta corresponde a: "+cliente01.getSaldo()+"\n");
        System.out.println(cliente01.depositar(5000)+"\n");
        System.out.println(cliente01.sacar(500)+"\n");
        System.out.println(cliente01.pagarMensal()+"\n");



    }
}
