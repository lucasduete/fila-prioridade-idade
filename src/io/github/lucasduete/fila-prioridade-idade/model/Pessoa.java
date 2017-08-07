package io.github.lucasduete.filasBanco.model;

public class Pessoa implements Comparable<Pessoa>{

   // static int aux = 0;
    private String nome;
    private String cpf;
    private int numConta;
    private int idade;

    public Pessoa(String nome, String cpf, int numConta, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.numConta = numConta;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private int calcPrioridade(){
        if(getIdade() >= 60){
            return getIdade() % 10;
        } else {
            return 15;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (numConta != pessoa.numConta) return false;
        if (idade != pessoa.idade) return false;
        if (!nome.equals(pessoa.nome)) return false;
        return cpf.equals(pessoa.cpf);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + cpf.hashCode();
        result = 31 * result + numConta;
        result = 31 * result + idade;
        return result;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numConta=" + numConta +
                ", idade=" + idade +
                ", "+ calcPrioridade() +
                '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        //Ele compara a nova a pessoa ja existente
        //logo ele compara this com a que ja esta na lista
//        System.out.println("EXECUTOU : " + ++aux + "A vez");
//        System.out.println("NOVA PESSOA :: " + toString());
//        System.out.println("PESSOA JA EXISTENTE:: " + o.toString());
        return calcPrioridade();
    }
}
