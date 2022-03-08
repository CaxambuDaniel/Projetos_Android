package alura.com.aluraviagens.util;

import androidx.annotation.NonNull;

public class DiasUtil {
    public static final String PLURAL = "dias";
    public static final String SINGULAR = " dia";

    @NonNull
    public static String formataEmTexto(int qtd_dias) {
        if (qtd_dias > 1 ){
            return qtd_dias + " " + PLURAL;
        }
        return qtd_dias + SINGULAR;
    }
}
