/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallas;

/**
 *
 * @author danie
 */
public class Ronda {
    private int numRonda;
    private Ejercito atacante;
    private Ejercito defensor;
    private int resultado;
    
    public Ronda(int ronda, Ejercito atacante, Ejercito defensor){
        this.numRonda = ronda;
        this.atacante = atacante;
        this.defensor = defensor;
        this.resultado = luchar();
    }
    
    private int luchar(){
        return atacante.getAtaque() - defensor.getDefensa();
    }
    
    public int getResultado(){
        return resultado;
    }

    public int getNumRonda() {
        return numRonda;
    }

    public Ejercito getAtacante() {
        return atacante;
    }

    public Ejercito getDefensor() {
        return defensor;
    }
}
