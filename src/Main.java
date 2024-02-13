import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AddArray addArray = new AddArray();

        addArray.addTempDays(0, 2);
        addArray.addTempDays(1, 6);

        addArray.findTempDays(0);
        addArray.findTempDays(1);
        addArray.findTempDays(3);

        Scanner scanner = new Scanner(System.in);

        int days =scanner.nextInt();

        addArray.findTempDays(days);


    }
}