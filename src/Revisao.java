import java.time.LocalDate;


public class Revisao extends Atividade implements Interface {
    private String disciplina;
    private boolean agendada;

    public Revisao(String titulo, String descricao, LocalDate data, int prioridade, String disciplina) throws TratamentoData, TratamentoPrioridade {
        super(titulo, descricao, data, prioridade);
        this.disciplina = disciplina;
        this.agendada = false;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Revisão ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data: " + getData());
        System.out.println("Prioridade: " + getPrioridade());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Agendada: " + (agendada ? "Sim" : "Não"));
        System.out.println("---------------------------");
    }

    @Override
    public void agendar() {
        if (!agendada) {
            this.agendada = true;
            System.out.println("Revisão '" + getTitulo() + "' de " + disciplina + " agendada para " + getData() + ".");
        } else {
            System.out.println("Revisão '" + getTitulo() + "' já está agendada.");
        }
    }

    @Override
    public void cancelarAgendamento() {
        if (agendada) {
            this.agendada = false;
            System.out.println("Agendamento da revisão '" + getTitulo() + "' cancelado.");
        } else {
            System.out.println("Revisão '" + getTitulo() + "' não está agendada.");
        }
    }

    @Override
    public boolean isAgendada() {
        return agendada;
    }
}