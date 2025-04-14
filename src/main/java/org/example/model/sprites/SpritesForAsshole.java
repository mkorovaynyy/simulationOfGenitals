package org.example.model.sprites;
/**
 * Enum, содержащий спрайты задниц разных уровней
 */
public enum SpritesForAsshole {
    ASSHOLE_LVL_SOLDIER("ω."),
    ASSHOLE_LVL_SERGEANT("ω*"),
    ASSHOLE_LVL_MAJOR("ω★"),
    ASSHOLE_LVL_GENERAL("ω✪");
    private final String spriteForAsshole;

    SpritesForAsshole(String spriteForAsshole) {
        this.spriteForAsshole = spriteForAsshole;
    }

    @Override
    public String toString() {
        return this.spriteForAsshole;
    }
}
