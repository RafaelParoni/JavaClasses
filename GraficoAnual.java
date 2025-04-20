import java.util.LinkedHashMap;
import java.util.Map;

public class GraficoAnual {
    private int ano;
    private Map<String, Double> valoresMensais; // "Jan", "Fev", ..., "Dez"

    public GraficoAnual(int ano) {
        this.ano = ano;
        this.valoresMensais = new LinkedHashMap<>();
        inicializarMeses();
    }

    private void inicializarMeses() {
        String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", 
                          "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        for (String mes : meses) {
            valoresMensais.put(mes, 0.0); // inicializa com 0.0
        }
    }

    public int getAno() {
        return ano;
    }

    public Map<String, Double> getValoresMensais() {
        return valoresMensais;
    }

    public void setValorMes(String mes, double valor) {
        if (valoresMensais.containsKey(mes)) {
            valoresMensais.put(mes, valor);
        } else {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }
    }

    public double getValorMes(String mes) {
        Double valor = valoresMensais.get(mes);
        if (valor == null) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }
        return valor;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double v : valoresMensais.values()) {
            soma += v;
        }
        return soma / 12.0;
    }

    public double getValorTotal() {
        return calcularMedia(); // pode mudar pra soma se quiser
    }

    @Override
    public String toString() {
        return "Gráfico Ano " + ano + ": " + valoresMensais.toString() + " | Média: " + calcularMedia();
    }
}
