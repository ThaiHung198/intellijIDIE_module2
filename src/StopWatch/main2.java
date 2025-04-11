package StopWatch;

import java.util.Random;

public class main2 {
    public static void main(String[] args) {
        // Tạo mảng 100,000 số ngẫu nhiên
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }
        // tạo đối tượng Stopwach
        StopWatchClass stopWatchClass = new StopWatchClass();
        // Bắt đầu đo time
        stopWatchClass.star();
        // thực hiện sắp xếp chọn
        selectionSort(numbers);
        //dừng do time
        stopWatchClass.stop();
        System.out.println("Thời gian thực thi : " +stopWatchClass.getElapsedTime());
    }
    // thuật toán sắp xếp chọn, dùng vòng lặp for
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // đổi vị trí
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
}
