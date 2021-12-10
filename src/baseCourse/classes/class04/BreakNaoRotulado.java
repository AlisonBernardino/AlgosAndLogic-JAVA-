package baseCourse.classes.class04;

public class BreakNaoRotulado {

    public void encontrarItem(){
        // Vetor de Strings (Palavras) para armazenar os dados da quitanda
        String quitandaFrutas[] = {"Mamão", "Pêra","Maçã","Uvas","Banana",
                "Limão","Morango","Pitaya","Melancia","Chocolate"};

        String itemNaoCompativel = "Chocolate";
        boolean itemEncontrado = false;
        for(int contador=0;contador<quitandaFrutas.length;contador++){
            System.out.println("=============================");
            System.out.println("Volta do loop atual = " + contador);
            System.out.println("Item analisado = " + quitandaFrutas[contador]);
            if(quitandaFrutas[contador].equals(itemNaoCompativel)){
                itemEncontrado = true;
                System.out.println("Item encontrado! Nome = " + itemNaoCompativel);
                // [Linha 15] Este é o comando "break" não-rotulado
                break;
            }else{
                System.out.println("Erro de busca! Item não encontrado!");
            }
        }
    }
}
