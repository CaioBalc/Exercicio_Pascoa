import java.util.Calendar;

public class Calendar {
    public static int ano(int ano){
        int diaDourado = (ano % 19) + 1;
        System.out.println("A páscoa no ano de " + ano + " é no dia:");

        // Pesquisar pelo método Calendar para usar este:
        Calendar c = Calendar.getInstance();
        c.set(year, month, day)

        switch (diaDourado) {
            case 1:
                System.out.println("14 de abril");
                break;
            case 2:
                System.out.println("3 de abril");
                break;
            case 3:
                System.out.println("23 de março");
                break;
            case 4:
                System.out.println("11 de abril");
                break;
            case 5:
                System.out.println("31 de março");
                break;
            case 6:
                System.out.println("18 de abril");
                break;
            case 7:
                System.out.println("8 de abril");
                break;
            case 8:
                System.out.println("28 de março");
                break;
            case 9:
                System.out.println("16 de abril");
                break;
            case 10:
                System.out.println("5 de abril");
                break;
            case 11:
                System.out.println("25 de março");
                break;
            case 12:
                System.out.println("13 de abril");
                break;
            case 13:
                System.out.println("2 de abril");
                break;
            case 14:
                System.out.println("22 de março");
                break;
            case 15:
                System.out.println("10 de abril");
                break;
            case 16:
                System.out.println("30 de março");
                break;
            case 17:
                System.out.println("17 de abril");
                break;
            case 18:
                System.out.println("7 de abril");
                break;
            case 19:
                System.out.println("27 de março");
                break;
        }
        return diaDourado;
    }
}
