import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifySequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] numStrings = input.split(" ");
        List<Integer> nums = new ArrayList<>();

        for (String numStr : numStrings) {
            nums.add(Integer.parseInt(numStr));
        }

        List<Integer> evenNums = new ArrayList<>();
        List<Integer> oddNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNums.add(num);
            } else {
                oddNums.add(num);
            }
        }

        evenNums.sort(Integer::compareTo);
        oddNums.sort(Integer::compareTo);

        List<Integer> modifiedList = new ArrayList<>(evenNums);
        modifiedList.addAll(oddNums);

        System.out.print("Modified Sequence: ");
        for (int i = 0; i < modifiedList.size(); i++) {
            System.out.print(modifiedList.get(i));
            if (i < modifiedList.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
