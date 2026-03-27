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
public class Persona {

    private String nombre;
    private char sexo;
    private byte edad;

    public Persona() {
        nombre = "Byron";
        sexo = 'M';
        edad = 18;

    }

    public Persona(String nombre, char sexo, byte edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void guardarDatos(String nombre, char sexo, byte edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String consultarDatos() {
        return "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad;
    }
}
