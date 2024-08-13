import java.util.Arrays;

public class Solution {
        public static int numberOfBouquet(int[] bloomDay, int k, int day) {
            int count = 0;
            int bouquet = 0;
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= day) {
                    count++;
                } else {
                    bouquet += (count / k);
                    count = 0;
                }
            }
            bouquet += (count / k);
            return bouquet;
        }

        public static int minDays(int[] bloomDay, int m, int k) {
            //cant use Arrays.sort(bloomDay); it will effect orignal bloomArray
            int low = Arrays.stream(bloomDay).min().getAsInt();
            int high = Arrays.stream(bloomDay).max().getAsInt();
            int mid;
            int ans = -1;

    if(k*m>bloomDay.length)
        {
            return -1;
        }

            while (low <= high) {
                mid = (low + high) / 2;
                if (numberOfBouquet(bloomDay, k, mid) >= m) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return ans;
        }
    }

