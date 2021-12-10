package baseCourse.classes.class04;

// "Continue" rotulado (Labelled continue)
public class ContinueRotulado {
    public void controlarLacos(){
        laçoA: for(int contagemA = 0; contagemA <= 4; contagemA++){
            System.out.println("Contagem do laço OUT (Fora) = " + contagemA);
            laçoB: for(int contagemB =0; contagemB <= 4; contagemB++){
                System.out.println("Contagem do laço IN (Dentro) = " + contagemB);
                if(contagemB == 3){
                    System.out.println("--------------------------------------------------");
                    System.out.println("Volta 04 do laço IN (Dentro) removida com sucesso!");
                    System.out.println("--------------------------------------------------");
                    continue laçoA;
                }
            }
        }
    }
}
