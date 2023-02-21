package programacio.escacs;

public enum Color {
    b-blanca, n-negra;
}

/**
 * Aquesta clase representa les característiques d'una
 * ficha, juntament amb les accions que pot dur a terme.
 * Com la posició, color i el moviment que fa aquesta.
 * 
 * @author aprat
 * @version 1.0
 */
public class Ficha {
    
    /**
     * Conte les coordenades x-y on es troba la ficha
     * 
     * Utilitza un objecte de la clase Casella
     * @see Casella 
     */
    private Casella posicio;
    
    

    /**
     * Obtenim el valor de la posicio
     *
     * @return el valor de la posicio
     */
    public Casella getPosicio() {
        return posicio;
    }

    /**
     * Estableix el valor de la posicio
     *
     * @param posicio nou valor de la posicio
     */
    public void setPosicio(Casella posicio) {
        this.posicio = posicio;
    }

}
