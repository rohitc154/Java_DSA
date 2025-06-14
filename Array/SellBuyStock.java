package Array;

public class SellBuyStock {
    public static int main(String[] args) {
        int arr[] = {};
        int mini = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            int cost = arr[i] - mini;
            maxProfit = (maxProfit > cost) ? maxProfit : cost;
            mini = (mini < arr[i] ? mini : arr[i]);
        }
        return maxProfit;
    }
}
