package utils;

public enum Colors {
    // Resetear color
    RESET("\033[0m"),

    // Colores en negrita
    BLACK_BOLD("\033[1;30m"),   // Negre
    RED_BOLD("\033[1;31m"),     // Vermell
    GREEN_BOLD("\033[1;32m"),   // Verd
    YELLOW_BOLD("\033[1;33m"),  // Groc
    BLUE_BOLD("\033[1;34m"),    // Blau
    MAGENTA_BOLD("\033[1;35m"), // Magenta
    CYAN_BOLD("\033[1;36m"),    // Cyan
    WHITE_BOLD("\033[1;37m");   // Blanc


    private final String code;


    // Constructor del enum
    Colors(String code) {
        this.code = code;
    }


    @Override
    // El override s'utilitza per substituir la funció toString per la que vull possar. En aquest cas vull que em retorni la variable.
    public String toString() {
        return code;
    }
}