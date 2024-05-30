class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for(char value:letters)
        {
            if(value>target)
            {
                return value;
            }
        }
        return letters[0];
    }
}