import java.util.Random;

public class Maintest {
    public static void main(String[] args) {
        // Tạo mảng 100,000 số ngẫu nhiên
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }

        // Tạo đối tượng Test_nhap
        Test_nhap stopwatch = new Test_nhap();

        // Bắt đầu đo thời gian
        stopwatch.start();

        // Thực hiện thuật toán sắp xếp chọn
        selectionSort(numbers);

        // Dừng đo thời gian
        stopwatch.stop();

        // Hiển thị thời gian thực thi
        System.out.println("Thời gian thực thi (ms): " + stopwatch.getElapsedTime());
    }

    // Thuật toán sắp xếp chọn
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi vị trí
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}