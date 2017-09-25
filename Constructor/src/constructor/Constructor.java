/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Alumno
 */
public class Constructor {

    private String colorpiel;
    private String colorojos;
    private String rasgos;
    private int peso;
    private int estatura;
    
    public Constructor(String colorp, String coloro, String ras){
        this.colorpiel=colorp;
        this.colorojos=coloro;
        this.rasgos=ras;
    }
    
    public Constructor (int pes, int est){
        this.peso=pes;
        this.estatura=est;
    }
}
