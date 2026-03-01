public class mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean saludable;



    // Constructor
    public mascota(String nombre, String especie, int edad, double peso, boolean saludable) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.saludable = saludable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSaludable() {
        return saludable;
    }

    public void setSaludable(boolean saludable) {
        this.saludable = saludable;
    }

    @Override
    public String toString() {
        return "mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", saludable=" + saludable +
                '}';
    }
    // MÉTODOS PROPIOS



    public int cambiarEdad(int nuevaEdad) {

        if (nuevaEdad > 0) {
            edad = nuevaEdad;
        }

        return edad;
    }

    public double cambiarPeso(double nuevoPeso) {

        if (nuevoPeso > 0) {
            peso = nuevoPeso;
        }

        return peso;
    }
    public boolean cambiarSalud(boolean nuevoEstado) {

        saludable = nuevoEstado;

        return saludable;
    }

    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Estado: " + (saludable ? "Saludable" : "Enfermo"));
        System.out.println("----------------------------");
    }

}