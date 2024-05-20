package trabalhojava;
import java.util.Scanner;

public class calculoMedia {
    
    private double prova, apostila, trabalho, media;
    private float tic, relatorio, tarefa, trilha, avaliativa, simulado;
    private String nome, turma, disciplina;

    void recebeDados(String op){
        
        switch(op){
            
        case "1":
            recebeDados(nome, turma, disciplina, apostila, trabalho, tic, relatorio, prova, tarefa);
        break;
        
        case "2":
            recebeDados(nome, turma, disciplina, apostila, trabalho, tic, relatorio, prova);
        break;
        
        case "3":
            recebeDados(nome, turma, disciplina, apostila, trabalho, trilha, prova);
        break;
        
        case "4":
            recebeDados(nome, turma, disciplina, apostila, trabalho, trilha, prova, simulado);
        break;
        
        }
    }

    void media(String op){
        
        switch(op){
            
            case "1":
                media(tic, prova, relatorio, apostila, trabalho, tarefa);
            break;
            
            case "2":
                media(tic, prova, apostila, trabalho, relatorio);
            break;
            
            case "3":
                media(prova, trilha, apostila, avaliativa, trabalho);
            break;
            
            case "4":
                media(prova, trilha, trabalho, simulado, avaliativa, apostila);
            break;
            
        }
    }
    
    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, float tic, float relatorio, double prova, float tarefa){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("PRATICA");
        System.out.print("Digite o nome: ");
        this.setNome(ler.nextLine());
        System.out.print("Digite a turma: ");
        this.setTurma(ler.nextLine());
        System.out.print("Digite a disciplina: ");
        this.setDisciplina(ler.nextLine());
        System.out.println("-----------");
        System.out.print("Digite a nota de tarefa: ");
        this.setTarefa(ler.nextFloat());
        System.out.print("Digite a nota de apostila: ");
        this.setApostila(ler.nextDouble());
        System.out.print("Digite a nota de trabalho: ");
        this.setTrabalho(ler.nextDouble());
        System.out.print("Digite a nota de tic: ");
        this.setTic(ler.nextFloat());
        System.out.print("Digite a nota de relatorio: ");
        this.setRelatorio(ler.nextFloat());
        System.out.print("Digite a nota de prova: ");
        this.setProva(ler.nextDouble());
        
    }
  
    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, float tic, float relatorio, double prova){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("TEORICA");
        System.out.print("Digite o nome: ");
        this.setNome(ler.nextLine());
        System.out.print("Digite a turma: ");
        this.setTurma(ler.nextLine());
        System.out.print("Digite a disciplina: ");
        this.setDisciplina(ler.nextLine());
        System.out.println("-----------");
        System.out.print("Digite a nota de apostila: ");
        this.setApostila(ler.nextDouble());
        System.out.print("Digite a nota de trabalho: ");
        this.setTrabalho(ler.nextDouble());
        System.out.print("Digite a nota de tic: ");
        this.setTic(ler.nextFloat());
        System.out.print("Digite a nota de relatorio: ");
        this.setRelatorio(ler.nextFloat());
        System.out.print("Digite a nota de prova: ");
        this.setProva(ler.nextDouble());
        
    }
    
    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, float trilha, double prova){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("REGULAR");
        System.out.print("Digite o nome: ");
        this.setNome(ler.nextLine());
        System.out.print("Digite a turma: ");
        this.setTurma(ler.nextLine());
        System.out.print("Digite a disciplina: ");
        this.setDisciplina(ler.nextLine());
        System.out.println("-----------");
        System.out.print("Digite a nota de apostila: ");
        this.setApostila(ler.nextDouble());
        System.out.print("Digite a nota de trabalho: ");
        this.setTrabalho(ler.nextDouble());
        System.out.print("Digite a nota de trilha: ");
        this.setTrilha(ler.nextFloat());
        System.out.print("Digite a nota de prova: ");
        this.setProva(ler.nextDouble());
        System.out.print("Digite a nota do avaliativa: ");
        this.setAvaliativa(ler.nextFloat());

    }

    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, double trilha, double prova, double simulado){
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("TERCEIRO");
        System.out.print("Digite o nome: ");
        this.setNome(ler.nextLine());
        System.out.print("Digite a turma: ");
        this.setTurma(ler.nextLine());
        System.out.print("Digite a disciplina: ");
        this.setDisciplina(ler.nextLine());
        System.out.println("-----------");
        System.out.print("Digite a nota de apostila: ");
        this.setApostila(ler.nextDouble());
        System.out.print("Digite a nota de trabalho: ");
        this.setTrabalho(ler.nextDouble());
        System.out.print("Digite a nota de trilha: ");
        this.setTrilha(ler.nextFloat());
        System.out.print("Digite a nota de prova: ");
        this.setProva(ler.nextDouble());
        System.out.print("Digite a nota do simulado: ");
        this.setSimulado(ler.nextFloat());
        System.out.print("Digite a nota do avaliativa: ");
        this.setAvaliativa(ler.nextFloat());

    }

    void exibirDadosPratica(){
        
        System.out.println(" ");
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("TIC: " + this.getTic());
        System.out.println("Relatorio: " + this.getRelatorio());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
        
    }
    
    void exibirDadosTeorica(){
        
        System.out.println(" ");
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("TIC: " + this.getTic());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
        System.out.println("Relatorio: " + this.getRelatorio());
     
    }
    
    void exibirDadosRegular(){
        
        System.out.println(" ");       
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("Trilha: " + this.getTrilha());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
        
    }
    
    void exibirDadosTerceiro(){
        
        System.out.println(" ");
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("Trilha: " + this.getTrilha());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
        System.out.println("Simulado: " + this.getSimulado());
        
    }
    
    public double media(float tic, double prova, double relatorio, double apostila, double trabalho, float tarefa){
        
        media = (this.getApostila() * 0.05 + this.getTarefa() * 0.3 + this.getTrabalho() * 0.1 + this.getTic() * 0.15 + this.getRelatorio() * 0.1 + this.getProva() * 0.3);
        return media;
        
    }

    public double media(float tic, double prova, double apostila, double trabalho, float relatorio){   
        
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTic() * 0.15 + this.getRelatorio() * 0.1 + this.getProva() * 0.6);
        return media;
        
    }

    public double media(double prova, float trilha, double apostila, float avaliativa, double trabalho){ 
        
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTrilha() * 0.15 + this.getAvaliativa() * 0.2 + this.getProva() * 0.5);
        return media;
        
    }

    public double media(double prova, float trilha, double trabalho, float simulado, float avaliativa, double apostila){
       
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTrilha() * 0.15 + this.getAvaliativa() * 0.1 +  this.getSimulado() * 0.2 + this.getProva() * 0.4);
        return media;
        
    }

    public double getProva() {
        
        return prova;
        
    }

    public void setProva(double prova) {
        
        this.prova = prova;
        
    }

    public float getTic() {
        
        return tic;
        
    }

    public void setTic(float tic) {
        
        this.tic = tic;
        
    }

    public double getApostila() {
        
        return apostila;
        
    }

    public void setApostila(double apostila) {
        
        this.apostila = apostila;
        
    }

    public float getRelatorio() {
        
        return relatorio;
        
    }

    public void setRelatorio(float relatorio) {
        
        this.relatorio = relatorio;
        
    }

    public float getTarefa() {
        
        return tarefa;
        
    }

    public void setTarefa(float tarefa) {
        
        this.tarefa = tarefa;
        
    }

    public float getTrilha() {
        
        return trilha;
        
    }
    
    public void setTrilha(float trilha) {
        
        this.trilha = trilha;
        
    }

    public float getAvaliativa() {
        
        return avaliativa;
        
    }

    public void setAvaliativa(float avaliativa) {
        
        this.avaliativa = avaliativa;
        
    }

    public float getSimulado() {
        
        return simulado;
        
    }

    public void setSimulado(float simulado){
        
        this.simulado = simulado;
        
    }

    public double getTrabalho() {
        
        return trabalho;
        
    }

    public void setTrabalho(double trabalho) {
        
        this.trabalho = trabalho;
        
    }

    public String getNome() {
        
        return nome;
        
    }

    public void setNome(String nome) {
        
        this.nome = nome;
        
    }

    public String getTurma() {
        
        return turma;
        
    }

    public void setTurma(String turma) {
        
        this.turma = turma;
        
    }

    public String getDisciplina() {
        
        return disciplina;
        
    }

    public void setDisciplina(String disciplina) {
        
        this.disciplina = disciplina;
        
    }

    public double getMedia() {
        
        return media;
        
    }

    public void setMedia(double media) {
        
        this.media = media;
        
    }
    
}
