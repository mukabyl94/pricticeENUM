import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ai jazynyz");
        String nameMonth = scan.nextLine();
        Summer summer = Summer.valueOf(nameMonth.toUpperCase());

        switch(summer){
            case JUNE -> System.out.println("Jai mezgilinin birinchi aiy");
            case JULY -> System.out.println("Jai mezgilinin ekinchi aiy bul aida kun aiabai ysyit");
            case AUGUST -> System.out.println("Jai mezgilinin uchunchu aiy momo-jemish byshkan mezgil");
        }
    }
}