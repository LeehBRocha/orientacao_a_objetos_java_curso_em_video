public abstract class Pessoa{
    //atributos: nome,idade,sexo
    //metodos: fazerAnv()

    private String nome;
    private int idade;
    private String sexo;
    protected int [] coordenada;

    public Pessoa(String nome,int idade,String sexo){
        setIdade(idade);
        setNome(nome);
        setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAnv(){
        setIdade(getIdade() + 1);
         
        

    }   
}