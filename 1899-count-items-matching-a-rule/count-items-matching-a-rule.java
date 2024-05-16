class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count=0;
        
        int key=0;
        if(ruleKey.equals("type"))
        {
            key=0;
        }
        else if(ruleKey.equals("color"))
        {
            key =1;
        }
        else
        {
            key=2;
        }

       for(List <String> item : items)
       {
            if(item.get(key).equals(ruleValue))
            {
                count = count+1;
            }
       }

       return count;
}
}