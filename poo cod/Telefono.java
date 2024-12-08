
public class Telefono {

    // Atributos
    String modelo;
    String sistemaOperativo;

    public Telefono(String modelo, String sistemaOperativo) {
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void mostrarInformacion() {
        System.out.println("Modelo del telefono: " + modelo);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
    }

    // Nuevo método para encender el teléfono
    public void encenderTelefono() {
        System.out.println("El telefono " + modelo + " esta encendiendo...");
    }

    public static class Propietario {
        String nombre;

        public Propietario(String nombre) {
            this.nombre = nombre;
        }

        public void usarTelefono(Telefono telefono) {
            System.out.println(nombre + " esta usando un telefono con sistema operativo: " + telefono.sistemaOperativo);
        }
    }

    public static void main(String[] args) {
        Telefono telefono1 = new Telefono("iPhone 13", "iOS");
        
        Propietario propietario1 = new Propietario("Maria");

        telefono1.mostrarInformacion();
        
        telefono1.encenderTelefono();
        
        propietario1.usarTelefono(telefono1);
    }
}
