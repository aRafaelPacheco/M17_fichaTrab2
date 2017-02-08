package m17b_fichatrab2;

public class Ponto2D {
    
    /**
     * @param x para a primeira coordenada do ponto.
     * @param y para a segunda coordenada do ponto.
     */
    private int x;
    private int y;
    
    /**
     * construtor sem parametros.
     */
    public Ponto2D(){
        x = y = 0;
    }
    /**
     * construtor com parâmetros
     * @param x
     * e 
     * @param y 
     */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    
    /**
     * 
     * @param a é o ponto parametrizado
     * @return a distancia entre os dois pontos
     */
    public double distancia(Ponto2D a){
        // Falta fazer este método.
        return (Math.sqrt((a.getX()-getX())*(a.getX()-getX()) + (a.getY()-getY())*(a.getY()-getY())));
    }

    
    
    /**
     * 
     * @return coordenadas dos pontos x and y  
     */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + getX() + ", y=" + getY() + '}';
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    
}
