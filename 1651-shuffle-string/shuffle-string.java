class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder newString = new StringBuilder(s);
        for(int i=0;i<indices.length;i++)
        {
            newString.setCharAt(indices[i],s.charAt(i));
        }

        return newString.toString();
    }
}