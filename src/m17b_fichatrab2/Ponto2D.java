package m17b_fichatrab2;

public class Ponto2D {
    private int x;
    private int y;
    
    // Faltam construtor, getters e setters.
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    public double distancia(Ponto2D a){
        // Falta fazer este método.
        
        return (Math.sqrt((a.x-x)*(a.x-x) + (a.y-y)*(a.y-y)));
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
