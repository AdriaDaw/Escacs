package programacio.escacs;

/**
 * Aquesta clase representa la posicio de les
 * figures d'escacs, en un tauler de 5x5.
 * 
 * @author aprat
 * @version 1.0
 */
public class Casella {
    
    /**
     * Posicio de la coordenada y en el tauler
     */
    private int fila;
    
    /**
     * Posicio de la coordenada x en el tauler
     */
    private int columna;

    /**
     * Constructor buit
     */
    public Casella() {
    }

    /**
     * Constructor per a indicar la casella on es moura la fixa
     * 
     * @param fila indica la coordenada y del tauler
     * @param columna indica la coordenada x del tauler
     */
    public Casella(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    /**
     * Obtenim el valor de columna
     *
     * @return el valor de columna
     */    
    public int getColumna() {
        return columna;
    }

    /**
     * Estableix el valor de la columna
     *
     * @param columna nou valor de columna
     */    
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * Obtenim el valor de fila
     *
     * @return el valor de fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * Estableix el valor de fila
     *
     * @param fila nou valor de fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

}
