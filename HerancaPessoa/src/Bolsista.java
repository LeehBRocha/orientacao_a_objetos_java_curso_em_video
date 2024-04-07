public class Bolsista extends Aluno{
    private int bolsa;
    public Bolsista(String nome, int idade, String sexo, String curso, int bolsa) {
        super(nome, idade, sexo, curso);
        setBolsa(bolsa);
    }

    public void renovarBolsa(){

    }

    @Override
    public void pagarMensalide(){
        System.out.println("Pagamento do bolsista foi feito!!");
    }



    public int getBolsa() {
        return bolsa;
    }



    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
