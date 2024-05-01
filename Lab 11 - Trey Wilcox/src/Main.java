import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            BlueRayCollection bcr = new BlueRayCollection();
            boolean determine = true;
            Scanner sc = new Scanner(System.in);
            while (determine) {
                System.out.println("0. Quit\n1. Add BlueRay to collection\n2. See collection");
                int choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        determine = false;
                        break;
                    case 1:
                        System.out.println("What is the title?");
                        String t = sc.next();
                        System.out.println("What is the director?");
                        String d = sc.next();
                        System.out.println("What is the year of release?");
                        int y = sc.nextInt();
                        System.out.println("What is the cost?");
                        double c = sc.nextDouble();
                        bcr.add(t, d, y, c);
                        break;
                    case 2:
                        bcr.show_all();
                        break;
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}