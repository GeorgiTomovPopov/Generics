package GenBoxOfInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box> boxes = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            int currentInt = Integer.parseInt(scanner.nextLine());
            Box box = new Box(currentInt);
            boxes.add(box);
        }

        boxes.forEach(System.out::println);
    }
}
