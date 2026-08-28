import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private final String nombre;
    private final String raza;
    private final String clase;

    private final String armaEquipada;
    private final String armadura;
    private final List<String> habilidades;
    private final String mascota;
    private final int nivelInicial;

    // Constructor privado:
    // solo el Builder puede crear Personajes.
    Personaje(PersonajeBuilder builder) {
        this.nombre = builder.getNombre();
        this.raza = builder.getRaza();
        this.clase = builder.getClase();

        this.armaEquipada = builder.getArmaEquipada();
        this.armadura = builder.getArmadura();

        // Copia defensiva para mantener la inmutabilidad
        this.habilidades = Collections.unmodifiableList(
                new ArrayList<>(builder.getHabilidades())
        );

        this.mascota = builder.getMascota();
        this.nivelInicial = builder.getNivelInicial();
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getClase() {
        return clase;
    }

    public String getArmaEquipada() {
        return armaEquipada;
    }

    public String getArmadura() {
        return armadura;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public String getMascota() {
        return mascota;
    }

    public int getNivelInicial() {
        return nivelInicial;
    }

    @Override
    public String toString() {

        StringBuilder ficha = new StringBuilder();

        ficha.append("=== HOJA DE PERSONAJE ===\n");
        ficha.append("Nombre: ").append(nombre).append("\n");
        ficha.append("Raza: ").append(raza).append("\n");
        ficha.append("Clase: ").append(clase).append("\n");
        ficha.append("Nivel: ").append(nivelInicial).append("\n");

        if (armaEquipada != null) {
            ficha.append("Arma: ").append(armaEquipada).append("\n");
        }

        if (armadura != null) {
            ficha.append("Armadura: ").append(armadura).append("\n");
        }

        if (mascota != null) {
            ficha.append("Mascota: ").append(mascota).append("\n");
        }

        if (!habilidades.isEmpty()) {
            ficha.append("Habilidades: ")
                 .append(String.join(", ", habilidades))
                 .append("\n");
        }

        return ficha.toString();
    }
}