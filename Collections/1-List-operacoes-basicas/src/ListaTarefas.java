
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();

    public ListaTarefas () {

    }

    public ListaTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

     public void adicionarTarefas(Tarefa tarefa) {
        tarefas.add(tarefa);
     }

     public void removerTarefa(String nomeTarefa) {
        tarefas.forEach(tarefa -> {
            if (tarefa.getNomeTarefa().contains(nomeTarefa)){
                tarefas.remove(tarefa);
            }
        });
     }

     public String obterNumeroTotalTarefas() {
        String totalTarefas = String.valueOf(tarefas.size());
        return "Número total de tarefas: " + totalTarefas;
     }

     public List<String> obterDescricoesTarefas() {
        List<String> listaDescricaoTarefas = new ArrayList<>();
        tarefas.forEach(tarefa -> {
            listaDescricaoTarefas.add(tarefa.getDescricao());
        });
        return  listaDescricaoTarefas;
     }
}
