
public class coche {

    // Atributos
     String color;
     String marca;

    // Constructor para inicializar los atributos
    public coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    // Método para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("El color del coche es: " + color);
        System.out.println("La marca del coche es: " + marca);
    }

    // Clase relacionada: Conductor
    public static class Conductor {
         String nombre;

        public Conductor(String nombre) {
            this.nombre = nombre;
        }

        public void conducir(coche coche) {
            System.out.println(nombre + " esta conduciendo un coche de color: " + coche.color);
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de Coche
        coche coche1 = new coche("Blanco", "Audi");
        
        // Crear una instancia de Conductor
        Conductor conductor1 = new Conductor("juan");
        
        // Mostrar información del coche
        coche1.mostrarInformacion();
        
        // Conductor usa la relación con el coche
        conductor1.conducir(coche1);
    }
}