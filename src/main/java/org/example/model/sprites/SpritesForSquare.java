package org.example.model.sprites;
/**
 * Enum, содержащий спрайты для ячеек игрового поля
 */
public enum SpritesForSquare {
    BLACK_SQUARE("▒▒"),
    WHITE_SQUARE("░░");
    private final String spriteForSquare;

    SpritesForSquare(String spriteForSquare) {
        this.spriteForSquare = spriteForSquare;
    }

    @Override
    public String toString() {
        return this.spriteForSquare;
    }
}
