public class DifferenceMatrix {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int difference = Math.abs(arr[0] - arr[arr.length - 1]);

        System.out.println("Difference = " + difference);
    }
}
