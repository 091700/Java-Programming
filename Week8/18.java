public class qishijiu{
    public static void main(String[] args) {
        int[] list = {1, 4, 8, 5, 9, 7};
        int i = linearSearch(list, 8);
        System.out.println("The key is found at index: " + i);
    }
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}
