public class Aluno extends Pessoa{
    private boolean matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, String curso) {
        super(nome, idade, sexo);

        setMatricula(true);
        setCurso(curso);
    }

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatricula(){
        setMatricula(false);
    }

    public void pagarMensalide(){
        System.out.println("Pagamento do aluno foi feito!!");
    }
    
}
