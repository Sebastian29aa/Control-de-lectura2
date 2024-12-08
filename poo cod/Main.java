
public class Main {

    public static class Jugador {
         String nombre;

        public Jugador(String nombre) {
            this.nombre = nombre;
        }

        public void usarPelota(Pelota pelota) {
            System.out.println(nombre + " esta usando una pelota de tipo: " + pelota.getTipo());
        }
    }

    // Clase Pelota 
    public static class Pelota {
         String tipo;
         String color;

        public Pelota(String tipo, String color) {
            this.tipo = tipo;
            this.color = color;
        }

        public String getTipo() {
            return tipo;
        }

        public void mostrarInformacion() {
            System.out.println("Tipo: " + tipo + ", Color: " + color);
        }
    }

    public static void main(String[] args) {
        
        Pelota pelota1 = new Pelota("Futbol", "Blanco");
        
        Jugador jugador1 = new Jugador("Carlos");
        
        // Mostrar información y la relación
        pelota1.mostrarInformacion();
        jugador1.usarPelota(pelota1);
    }
}

