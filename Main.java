import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> consumos = new ArrayList<>();
        consumos.add(1200);
        consumos.add(1500);
        consumos.add(1800);
        consumos.add(2000);

        int total = 0;
        for (int i = 0; i < consumos.size(); i++) {
            total += consumos.get(i);
        }

        double tarifa = 0.85;
        double custo = total * tarifa;

        if (total < 5000) {
            custo = custo * 0.9;
        }

        System.out.println("Consumo total: " + total + " kWh");
        System.out.println("Custo mensal: " + String.format("%.2f", custo) + " R$");
    }
}