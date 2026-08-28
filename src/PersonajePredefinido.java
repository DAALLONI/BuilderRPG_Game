public class PersonajePredefinido {

    public static Personaje guerreroPorDefecto(String nombre) {

        return new PersonajeBuilder(nombre, "Humano", "Guerrero")
                .conArma("Espada de Hierro")
                .conArmadura("Cota de Malla")
                .agregarHabilidad("Embestida")
                .build();
    }

    public static Personaje magoPorDefecto(String nombre) {

        return new PersonajeBuilder(nombre, "Elfo", "Mago")
                .conArma("Bastón de Madera")
                .conNivel(5)
                .agregarHabilidad("Bola de Fuego")
                .agregarHabilidad("Teletransportación")
                .build();
    }

    public static Personaje arqueroPorDefecto(String nombre) {

        return new PersonajeBuilder(nombre, "Elfo", "Arquero")
                .conArma("Arco Largo")
                .conArmadura("Armadura de Cuero")
                .agregarHabilidad("Disparo Preciso")
                .conNivel(3)
                .build();
    }
}