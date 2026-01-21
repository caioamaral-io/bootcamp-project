import java.time.LocalDate;
import java.time.Period;

public class JogadorFutebol {

    private String nome;
    private String posicao;
    private String nacionalidade;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;


    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getPosicao() { return posicao; }
    public void setPosicao(String posicao) { this.posicao = posicao; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }


    // Calculo idade
    public int calcularIdade() {
        if (dataNascimento == null) {
            return 0;
        }
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int tempoParaAposentar() {
        int idadeAtual = calcularIdade();
        int idadeAposentaria;

        if (posicao.equalsIgnoreCase("Zagueiro")) {
            idadeAposentaria = 40;
        } else if (posicao.equalsIgnoreCase("Meio-Campo")) {
            idadeAposentaria = 38;
        } else if (posicao.equalsIgnoreCase("Atacante")) {
            idadeAposentaria = 35;
        } else {
            return 0;
        }

        return Math.max(idadeAposentaria - idadeAtual, 0);
    }


    // Imprinir Infos
    public void imprimirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Data De Nascsimento: " + dataNascimento);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Posição: " + posicao);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Anos Pra Se Aposentar: " + tempoParaAposentar());
    }
}
