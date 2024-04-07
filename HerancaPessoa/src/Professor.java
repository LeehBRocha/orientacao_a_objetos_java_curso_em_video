public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario){
        super(nome,idade,sexo);

        setEspecialidade(especialidade);
        setSalario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAumento(int aumento){
        setSalario(getSalario()+aumento);
    }

    
}
