/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        long left=1;
        long right=(long)Math.pow(2,31)-1;
        long mid=0;

        long ans=0;

        while(left<=right)
        {
            mid = left+(right-left)/2;

            if(guess((int)mid)==0)
            {
                ans=mid;
                return (int)ans;
            }
            else if(guess((int)mid)==-1)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }

        return (int)ans;

    }
}