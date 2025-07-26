import java.time.LocalDate;


public abstract class Atividade {
    private String titulo;
    private String descricao;
    private LocalDate data;
    private int prioridade;

    public Atividade(String titulo, String descricao, LocalDate data, int prioridade) throws TratamentoData, TratamentoPrioridade {
        if (data == null || data.isBefore(LocalDate.now())) {
            throw new TratamentoData("A data da atividade não pode ser nula ou no passado.");
        }
        if (prioridade < 1 || prioridade > 5) {
            throw new TratamentoPrioridade("A prioridade deve ser entre 1 e 5.");
        }
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.prioridade = prioridade;
    }
    public abstract void exibirDetalhes();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) throws TratamentoData {
        if (data == null || data.isBefore(LocalDate.now())) {
            throw new TratamentoData("A data da atividade não pode ser nula ou no passado.");
        }
        this.data = data;
    }

    public void setPrioridade(int prioridade) throws TratamentoPrioridade {
        if (prioridade < 1 || prioridade > 5) {
            throw new TratamentoPrioridade("A prioridade deve ser entre 1 e 5.");
        }
        this.prioridade = prioridade;
    }
}