package baseCourse.classes.class05;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public void customizarCapacidades(){
        double capacidadeCombustivel = 50.6;
        double capacidadeAgua = 46.0;
        double capacidadeOleo = 12.5;

        // Criando um HashMap para representar os valores
        Map <String, Float> MapDasCapacidades = new HashMap<String, Float>();
        MapDasCapacidades.put("novaCapacidadeCombustivel",100.0f);
        MapDasCapacidades.put("novaCapacidadeAgua",92.5f);
        MapDasCapacidades.put("novaCapacidadeOleo",25.0f);

        // Para remover o índice "NovaCapacidadeAgua"
        MapDasCapacidades.remove("novaCapacidadeAgua");

        // Para apresentar o "HashMapDasCapacidades"
        System.out.println("Capacidades do sistema atualizadas!");
        System.out.println("Índices atuais = ");
        System.out.println(MapDasCapacidades);
    }
}
