public class Tarefa {
    public static int idTarefa = 0;
    private String nomeTarefa;
    private String descricao;

    public Tarefa() {
        ++idTarefa;
    }
    public Tarefa(String nomeTarefa, String descricao) {
        ++idTarefa;
        this.nomeTarefa = nomeTarefa;
        this.descricao = descricao;
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public String getNomeTarefa() {
        return this.nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
