package Desafios.Desafios_Aleatorios.Desafio5;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    //        Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês,
//        dia e ano de nascimento). Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get.
//        A classe também deve incluir um método que calcule e retorne a idade (em anos),
//         um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a
//         frequência cardíaca alvo da pessoa.

    String nome;
    String sobrenome;
    int diaDoNascimento;
    int mesDeNascimento;
    int anoDoNascimento;
    int id = 0;


    //Meus construtores
    public HeartRates(){

    }
    public HeartRates(String nome, String sobrenome, int diaDoNascimento, int mesDeNascimento, int anoDoNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaDoNascimento = diaDoNascimento;
        this.mesDeNascimento = mesDeNascimento;
        this.anoDoNascimento = anoDoNascimento;
        id++;
        System.out.println("Paciente cadastrado com sucesso! " + "Id: " + id);

    }

    //Getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public int getDiaDoNascimento(){
        return diaDoNascimento;
    }
    public void setDiaDoNascimento(int diaDoNascimento){
        this.diaDoNascimento = diaDoNascimento;
    }

    public int getMesDeNascimento(){
        return mesDeNascimento;
    }
    public void setMesDeNascimento(int mesDeNascimento){
        this.mesDeNascimento = mesDeNascimento;
    }

    public int getAnoDoNascimento(){
        return anoDoNascimento;
    }
    public void setAnoDoNascimento(int anoDoNascimento){
        this.anoDoNascimento = anoDoNascimento;
    }

    public int getId(){
        return id;
    }

    //Minha função para calcular idade
    public int calcularIdade(){
        LocalDate idadeNascimento = LocalDate.of(anoDoNascimento, mesDeNascimento, diaDoNascimento);
        LocalDate hoje = LocalDate.now();
        int idade = Period.between(idadeNascimento, hoje).getYears();
        return idade;
    }

    //Minha função de calcuar os batimentos cardiacos
    public void calcularFrequencia(){

        int frequenciaCardiaca = 200 - calcularIdade();
        System.out.println("A frequência cardiaca adequada para sua idade é de: " + frequenciaCardiaca);




    }

    @Override
    public String toString() {
        return "HeartRates{" +
                "nome: '" + nome + '\'' +
                ", Sobrenome: '" + sobrenome + '\'' +
                ", Dia do Nascimento: " + diaDoNascimento +
                ", Mês de Nascimento: " + mesDeNascimento +
                ", Ano de Nascimento: " + anoDoNascimento +
                ", Id: " + id +
                '}';
    }


}
