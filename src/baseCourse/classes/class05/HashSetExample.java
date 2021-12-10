package baseCourse.classes.class05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public void mostrarAnimaisDoZoo() {
        Set<String> animaisDoZoo = new HashSet<String>();
        animaisDoZoo.add("Girafa");
        animaisDoZoo.add("Macaco");
        animaisDoZoo.add("Leão");
        animaisDoZoo.add("Tartaruga");
        animaisDoZoo.add("Tubarão");
        animaisDoZoo.add("Zebra");
        animaisDoZoo.add("Hipopótamo");

        // Para mostrar os animais do HashSet 'animaisDoZoo' =
        System.out.println("Animais do Zoo = " + animaisDoZoo);

        // Para mostrar o tamanho do HashSet
        System.out.println("Tamanho do HashSet 'animaisDoZoo' = " + animaisDoZoo.size());

        // Para remover um item adicionado
        System.out.println("Item removido = Leão");
        animaisDoZoo.remove("Leão");

        // Para checar se um animal está dentro do HashSet 'zooAnimals'
        System.out.println("O animal 'Gato' está dentro do HashSet 'animaisDoZoo'?");
        System.out.println("Resposta = " + animaisDoZoo.contains("Gato"));

        // Para enviar o HashSet 'animaisDoZoo' para um array e apresentá-lo
        Object[] zooAnimalsArray = animaisDoZoo.toArray();
        System.out.println("Animal do índice[1] do 'arrayDeAnimaisDoZoo'= ");
        System.out.println(zooAnimalsArray[0]);

        // para mostrar o HashSet 'zooAnimals' usando os comandos iterator, while, hasNext e next
        System.out.println("Resultado do iterador dos animais = ");
        Iterator<String> iteradorDosAnimais = animaisDoZoo.iterator();
        while(iteradorDosAnimais.hasNext()){
            System.out.println(iteradorDosAnimais.next());
        }
    }
}
