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
public class Estudiante2 extends Persona {

    private int numCtrl;
    private String carrera;
    private byte semestre;

    public Estudiante2() {
        /**
         * En la primera linea de codigo se manda a llamar el constructor de la
         * clase madre, utilizando la palabra reservada super
         *
         */
        super();
        numCtrl = 25550468;
        carrera = "ICS";
        semestre = 2;
    }

    public Estudiante2(String nombre, char sexo, byte edad, int numCtrl, String carrera, byte semestre) {
        super(nombre, sexo, edad);
        this.numCtrl = numCtrl;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public int getnumCtrl() {
        return numCtrl;
    }

    public void setnumCtrl(int numCtrl) {
        this.numCtrl = numCtrl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public void guardarDatos(String nombre, char sexo, byte edad, int numCtrl, String carrera, byte semestre) {
        super.guardarDatos(nombre, sexo, edad);
        this.numCtrl = numCtrl;
        this.carrera = carrera;
        this.semestre = semestre;
    }

//    @Override
//    public String consultarDatos() {
//        return super.consultarDatos()
//                + "Num.Ctrl.: " + numCtrl + "\n"
//                + "Carrera: " + carrera + "\n"
//                + "Semestre: " + semestre;
//    }
    
    @Override
    public String consultarDatos() {
        return "hi";
    }

}
