import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUtils {

public static void removeEven(ArrayList<Integer> list) {
list.removeIf(num -> num % 2 == 0);
}

public static Integer findMin(ArrayList<Integer> list) {
if (list.isEmpty()) {
throw new IllegalArgumentException("The list is empty.");
}

Integer min = list.get(0);
for (Integer num : list) {
if (num < min) {
min = num;
}
}

return min;
}

public static Integer findMax(ArrayList<Integer> list) {
if (list.isEmpty()) {
throw new IllegalArgumentException("The list is empty.");
}

Integer max = list.get(0);
for (Integer num : list) {
if (num > max) {
max = num;
}
}

return max;
}

public static double findAverage(ArrayList<Integer> list) {
if (list.isEmpty()) {
throw new IllegalArgumentException("The list is empty.");
}

int sum = 0;
for (Integer num : list) {
sum += num;
}

return (double) sum / list.size();
}

public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();

Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();

System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
int num = scanner.nextInt();
numbers.add(num);
}

System.out.println("Before removing even numbers: " + numbers);

removeEven(numbers);

System.out.println("After removing even numbers: " + numbers);

Integer min = findMin(numbers);
System.out.println("Minimum value: " + min);

Integer max = findMax(numbers);
System.out.println("Maximum value: " + max);

double average = findAverage(numbers);
System.out.println("Average value: " + average);
}
}
