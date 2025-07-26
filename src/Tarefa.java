import java.time.LocalDate;

public class Tarefa extends Atividade implements Interface {
    private boolean concluida;
    private boolean agendada;

    public Tarefa(String titulo, String descricao, LocalDate data, int prioridade) throws TratamentoData, TratamentoPrioridade {
        super(titulo, descricao, data, prioridade);
        this.concluida = false;
        this.agendada = false;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Tarefa ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data: " + getData());
        System.out.println("Prioridade: " + getPrioridade());
        System.out.println("Agendada: " + (agendada ? "Sim" : "Não"));
        System.out.println("--------------------------");
    }


    @Override
    public void agendar() {
        if (!agendada) {
            this.agendada = true;
            System.out.println("Tarefa '" + getTitulo() + "' agendada para " + getData() + ".");
        } else {
            System.out.println("Tarefa '" + getTitulo() + "' já está agendada.");
        }
    }

    @Override
    public void cancelarAgendamento() {
        if (agendada) {
            this.agendada = false;
            System.out.println("Agendamento da tarefa '" + getTitulo() + "' cancelado.");
        } else {
            System.out.println("Tarefa '" + getTitulo() + "' não está agendada.");
        }
    }

    @Override
    public boolean isAgendada() {
        return agendada;
    }
}