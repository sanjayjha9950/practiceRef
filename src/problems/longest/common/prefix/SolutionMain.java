package problems.longest.common.prefix;

public class SolutionMain {

    static String[] words = {"flower", "flower", "flower","floster"};
    public static void main(String[] args) {


        String prefix = getLongestCommonPrefix();
        if(prefix!=null && !prefix.isEmpty()){
            System.out.println(prefix);
        }else {
            System.out.println("There is no common prefix among the input strings.");
        }
    }

    private static String getLongestCommonPrefix(){
        int i=0;
        char d ='a';
        if (words.length<1)
            return null;
        else if (words.length == 1)
            return words[0];
        else {
            char[] chars = getShortestString().toCharArray();
            for (i = 0; i <chars.length;i++){
                for (int j = 1; j<words.length;j++) {
                    if(words[j].charAt(i)!=chars[i])
                        return words[0].substring(0,i);
                }
            }
        }
        return words[0].substring(0,i);
    }
    private static String getShortestString(){
        String min=words[0];
        for (int i = 1; i< words.length;i++){
            if (words[i].length()< min.length())
                min=words[i];
        }
        return min;
    }
}
