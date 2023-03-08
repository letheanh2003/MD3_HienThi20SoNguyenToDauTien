import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong so nguyen to can in ra: ");
            int number = input.nextInt();
            for (int i = 2; count < number; i++) {
                boolean check = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    count++;
                    System.out.println(i + ",");
                }
            }
        }while (true);
    }
}