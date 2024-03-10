public class Cliente  {
    public String cpf;
    public int anoNascimento;
    public String nome;
    public String email;

    @Override
    public String toString() {

        return "CPF: "+cpf+"\nAno do Nascimento: "+anoNascimento+"\nNome: "+nome+"\nEmail: "+email;
    }
}
