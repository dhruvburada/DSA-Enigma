class Solution {
    public int firstUniqChar(String s) {
    
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;

        while(i<s.length())
        {
            char key = s.charAt(i);
            if(!map.containsKey(key))
            {
                map.put(key,1);

            }
            else
            {
                map.put(key,map.get(key)+1);

            }
            i++;
        }
 for(int j=0;j<s.length();j++)
       {
           if(map.get(s.charAt(j))==1)
           {
               return j;
           }
       }

        return -1;
    }
}