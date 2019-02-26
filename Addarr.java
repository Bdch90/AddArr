import java.util.Scanner;

public class AddArr
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào từng phần tử 2 mảng :");
        for (int x = 0; x < arr1.length; x++)
        {
            System.out.println("Phần tử "+ x + " của mảng 1");
            arr1[x] = scanner.nextInt();
        }
        for (int x = 0; x < arr2.length; x++) {
            System.out.println("Phần tử "+ x + " của mảng 2");
            arr2[x] = scanner.nextInt();
        }
        for (int x = 0, y = 0 ,z = 0; x < arr3.length; x++, y++)
        {
            if (x <= 2)
            {
                arr3[x] = arr1[y];
            }
            else
            {
                arr3[x] = arr2[z];
                z++;
            }
        }
        System.out.println("Mảng sau khi gộp :");
        for (int x = 0; x < arr3.length; x++)
        {
            System.out.println(arr3[x]);
        }
    }
}
