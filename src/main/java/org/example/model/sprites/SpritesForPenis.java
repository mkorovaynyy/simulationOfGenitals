package org.example.model.sprites;
/**
 * Enum, содержащий спрайты пенисов разных уровней
 */
public enum SpritesForPenis {
    PENIS_LVL_SOLDIER("ᖱᖲ."),
    PENIS_LVL_SERGEANT("ᖱᖲ*"),
    PENIS_LVL_MAJOR("ᖱᖲ★"),
    PENIS_LVL_GENERAL("ᖱᖲ✪");
    private final String spriteForPenis;


    SpritesForPenis(String spriteForPenis) {
        this.spriteForPenis = spriteForPenis;
    }

    @Override
    public String toString() {
        return this.spriteForPenis;
    }
}
