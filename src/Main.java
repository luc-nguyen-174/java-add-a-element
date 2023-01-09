import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] defaultArray = {3, 5, 6, 7, 9, 8, 1};
        System.out.println("Mảng ban đầu " + Arrays.toString(defaultArray));
        System.out.println("Có độ dài " + defaultArray.length);

        System.out.print("Nhập số cần thêm vào mảng: ");
        int x = scanner.nextInt();
        System.out.print("Nhập vào vị trí: ");
        int index = scanner.nextInt();

        if ((index < 0) || (index > (defaultArray.length))) {
            System.out.println("Không chèn được phần tử vào vị trí vừa nhập, mời nhập lại!!!");
        } else {
            for (int i = defaultArray.length-1; i>=index; i--) {
                defaultArray[i] =defaultArray[i - 1];
            }
            defaultArray[index] = x;
            System.out.println("Mảng sau khi thêm phần tử "+x+" vào vị trí: "+index+" là "+Arrays.toString(defaultArray));
        }
    }
}