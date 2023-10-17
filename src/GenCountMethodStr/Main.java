package GenCountMethodStr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> boxes = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            Box box = new Box(line);
            boxes.add(String.valueOf(box));
        }

        Box newBox = new Box<>(scanner.nextLine());

        System.out.println(countGreater(boxes, String.valueOf(newBox)));




    }




    public static <T> void swapElements(List<T> type, int firstIndex, int secondIndex) {
        type.add(type.get(firstIndex));
        type.set(firstIndex, type.get(secondIndex));
        type.set(secondIndex, type.get(type.size() - 1));
        type.remove(type.size() - 1);
    }


    public static <T extends Comparable<T>> int countGreater(List<T> list, T element) {
        int counter= 0;
        for (int i = 0; i < list.size(); i++) {
            if (element.compareTo(list.get(i)) < 0) {
                counter++;
            }
        }
        return counter;
    }
}



