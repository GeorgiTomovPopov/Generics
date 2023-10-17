package box;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box> boxes = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Box box = new Box(line);
            boxes.add(box);
        }

        boxes.forEach(System.out::println);
    }

}
