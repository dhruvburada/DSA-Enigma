class Solution {
    public String defangIPaddr(String address) {
        StringBuilder newString = new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            {
                newString.append("[.]");
            }
            else{
            newString.append(address.charAt(i));
            }
        }

        return newString.toString();
    }
}