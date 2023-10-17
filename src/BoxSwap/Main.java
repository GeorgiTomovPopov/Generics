package BoxSwap;

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

        String[] coords = scanner.nextLine().split("\\s+");

        swapElements(boxes, Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));

        boxes.forEach(System.out::println);
    }




    public static <T> void swapElements(List<T> type, int firstIndex, int secondIndex) {
        type.add(type.get(firstIndex));
        type.set(firstIndex, type.get(secondIndex));
        type.set(secondIndex, type.get(type.size() - 1));
        type.remove(type.size() - 1);
    }
}



