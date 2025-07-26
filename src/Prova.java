import java.time.LocalDate;

public class Prova extends Atividade implements Interface {
    private String materia;
    private String local;
    private boolean agendada;

    public Prova(String titulo, String descricao, LocalDate data, int prioridade, String materia, String local) throws TratamentoData, TratamentoPrioridade {
        super(titulo, descricao, data, prioridade);
        this.materia = materia;
        this.local = local;
        this.agendada = false;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Prova ---");
        System.out.println("Título: " + getTitulo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Data: " + getData());
        System.out.println("Prioridade: " + getPrioridade());
        System.out.println("Matéria: " + materia);
        System.out.println("Local: " + local);
        System.out.println("Agendada: " + (agendada ? "Sim" : "Não"));
        System.out.println("-------------------------");
    }

    @Override
    public void agendar() {
        if (agendada) {
            System.out.println("Prova já está agendada.");
        } else {
            agendada = true;
            System.out.println("Prova agendada com sucesso.");
        }
    }

    @Override
    public void cancelarAgendamento() {
        if (!agendada) {
            System.out.println("Prova não está agendada.");
        } else {
            agendada = false;
            System.out.println("Agendamento da prova cancelado com sucesso.");
        }
    }

    @Override
    public boolean isAgendada() {
        return agendada;
    }
}