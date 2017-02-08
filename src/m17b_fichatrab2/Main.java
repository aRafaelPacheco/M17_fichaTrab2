package m17b_fichatrab2;

public class Main {

    public static void main(String[] args) {
        // Ficha de Trabalho #2
        
        /**
         * @author Rafael Pacheco
         */

        
        /**
         * criação de dois pontos: p1 & p2.
         */
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        
        /**
         * Imprime com a função toString() os valores das coordenadas do 
         * respetivo ponto.
         */
        System.out.println(p1);
        System.out.println(p2);
        
        /**
         * Chama a função distancia() pelo ponto p2 
         * com o parametro p2 (ponto)
         * 
         */
        System.out.println(p2.distancia(p1));
        
    }
    
}
