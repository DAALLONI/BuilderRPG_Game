import java.util.ArrayList;
import java.util.List;

public class PersonajeBuilder {

    // Campos obligatorios
    private final String nombre;
    private final String raza;
    private final String clase;

    // Campos opcionales
    private String armaEquipada;
    private String armadura;
    private final List<String> habilidades;
    private String mascota;
    private int nivelInicial;

    // Constructor con los campos obligatorios
    public PersonajeBuilder(String nombre, String raza, String clase) {
        this.nombre = nombre;
        this.raza = raza;
        this.clase = clase;

        this.habilidades = new ArrayList<>();
        this.nivelInicial = 1;
    }

    public PersonajeBuilder conArma(String arma) {
        this.armaEquipada = arma;
        return this;
    }

    public PersonajeBuilder conArmadura(String armadura) {
        this.armadura = armadura;
        return this;
    }

    public PersonajeBuilder agregarHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
        return this;
    }

    public PersonajeBuilder conMascota(String mascota) {
        this.mascota = mascota;
        return this;
    }

    public PersonajeBuilder conNivel(int nivel) {
        this.nivelInicial = nivel;
        return this;
    }

    public Personaje build() {
        return new Personaje(this);
    }

    // Getters usados por Personaje
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
}