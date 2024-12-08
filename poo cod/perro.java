
public class perro {

    // Atributos
    String raza;
    int edad;

    public perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Raza del perro: " + raza);
        System.out.println("Edad del perro: " + edad + " anos");
    }

    // Nuevo método: Simula el cumpleaños del perro
    public void cumpleaños() {
        edad++;
        System.out.println("¡Feliz cumpleanos para el perro de raza: " + raza + "! Ahora tiene " + edad + " anos.");
    }

    // Clase 
    public static class Dueno {
        String nombre;

        public Dueno(String nombre) {
            this.nombre = nombre;
        }

        public void pasearPerro(perro perro) {
            System.out.println(nombre + " esta paseando a un perro de raza: " + perro.raza);
        }
    }

    public static void main(String[] args) {
        perro perro1 = new perro("Golden", 3);
        
        Dueno dueno1 = new Dueno("Luis");

        perro1.mostrarInformacion();
        
        dueno1.pasearPerro(perro1);

        perro1.cumpleaños();
    }
}
