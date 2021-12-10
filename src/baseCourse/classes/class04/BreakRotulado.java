package baseCourse.classes.class04;

public class BreakRotulado {

    public void executarScannerDeNumeros(){
        int arrayDeValores[] = {1,2,3,4,5,6,7,8,9};
        int numeroProcurado = 4;
        boolean numeroFoiEncontrado = false;

        moduloDePesquisa: for(int voltaDoLoop = 0;voltaDoLoop < arrayDeValores.length; voltaDoLoop++){
            if(numeroProcurado == arrayDeValores[voltaDoLoop]){
                numeroFoiEncontrado = true;
                break moduloDePesquisa;
            }
        }

        if(numeroFoiEncontrado){
            System.out.println("Número " + numeroProcurado + " encontrado!");
        }else{
            System.out.println("Erro! O número " + numeroProcurado + " ainda não foi encontrado.");
            System.out.println("Por favor, tente novamente.");
        }
    }
}
