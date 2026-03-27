/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Byron Caleb Matamoros Cabanillas
 * Fecha de Creacion: Jueves 5 de Marzo de 2026
 * ISC POO
 */
public class Docente extends Persona{
    private short numEmp;
    private String deptoAds;
    private byte antiguedad;
    
public Docente(){
    super();
    numEmp = 21;
    deptoAds = "Ciencias Basicas";
    antiguedad = 127;
}

public Docente(String nombre, char sexo, byte edad, short numEmp, String deptoAds, byte antiguedad){
    super(nombre, sexo, edad);
    this.numEmp = numEmp;
    this.deptoAds = deptoAds;
    this.antiguedad = antiguedad;
}

public short getnumEmp(){
    return numEmp;
}

public void setnumEmp(short numEmp){
    this.numEmp = numEmp;
}

public String getDeptoAds(){
    return deptoAds;
}

public void setDeptoAds(String deptoAds){
    this.deptoAds = deptoAds;
}

public byte getAntiguedad(){
    return antiguedad;
}

public void setAntiguedad(byte antiguedad){
    this.antiguedad = antiguedad;
}

public void guardarDatos(String nombre, char sexo, byte edad, short numEmp, String deptoAds, byte antiguedad){
    super.guardarDatos(nombre, sexo, edad);
    this.numEmp = numEmp;
    this.deptoAds = deptoAds;
    this.antiguedad = antiguedad;
}

}
