public class Search {
    public static void main(String[] args) {
        int[] nums = {1, 2, 31, 4, 12, 6, 7, 8, 5, 10, };
        int val = 5;
        boolean found = false;
        int temp = 0;
        for(int x : nums){
            if (x == val){
                found = true;
                break;

            }
        }
        if (found){
            System.out.println("Значение знайдено!");
        }
    }
}
