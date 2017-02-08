package m17b_fichatrab2;

public class Ponto2D {
    private int x;
    private int y;
    
    public Ponto2D(){
        x = y = 0;
    }
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
     * 
     * @param a é o outro ponto
     * @return a que é a distância entre os dois pontos
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
