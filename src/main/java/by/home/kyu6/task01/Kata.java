package by.home.kyu6.task01;

public class Kata {
    public static void main(String[] args) {
        double result01 = Kata.findUniq(new double[]{1, 2, 1});
        System.out.println(result01);
    }

    public static double findUniq(double[] arr) {
        if(arr[0] != arr[1]){
            if (arr[0] == arr[2]) {
                return arr[1];
            } else {
                return arr[0];
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                arr[0] = arr[i];
                break;
            }
        }
        return arr[0];
    }
}
