import java.util.HashMap;
import java.util.Map;

public class GerenciadorGraficos {
    private Map<Integer, GraficoAnual> graficos;

    public GerenciadorGraficos() {
        graficos = new HashMap<>();
    }

    public void adicionarGrafico(GraficoAnual grafico) {
        graficos.put(grafico.getAno(), grafico);
    }

    public GraficoAnual getGrafico(int ano) {
        return graficos.get(ano);
    }

    public boolean existeGrafico(int ano) {
        return graficos.containsKey(ano);
    }

    public Map<Integer, GraficoAnual> getTodos() {
        return graficos;
    }
}
