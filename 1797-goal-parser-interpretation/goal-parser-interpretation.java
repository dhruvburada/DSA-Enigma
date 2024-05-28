class Solution {
    public String interpret(String command) {
        String newStr = command.replace("()","o");
        newStr = newStr.replace("(al)","al");

        return newStr;
    }
}