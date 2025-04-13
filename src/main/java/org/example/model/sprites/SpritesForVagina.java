package org.example.model.sprites;
/**
 * Enum, содержащий спрайты вагин разных уровней
 */
public enum SpritesForVagina {
    VAGINA_LVL_SOLDIER("""     
            ဏ
            ."""),
    VAGINA_LVL_SERGEANT("""     
            ဏ
            ★"""),
    VAGINA_LVL_MAJOR("""     
             ဏ
            ★★★"""),
    VAGINA_LVL_GENERAL("""     
            ဏ
            ✪""");
    private final String spriteForVagina;

    SpritesForVagina(String spriteForVagina) {
        this.spriteForVagina = spriteForVagina;
    }

    @Override
    public String toString() {
        return this.spriteForVagina;
    }
}
