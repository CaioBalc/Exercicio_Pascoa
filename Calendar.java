public class Calendar {
    public static int ano(int ano){
        int diaDourado = (ano % 19) + 1;
        return diaDourado;
    }
}
