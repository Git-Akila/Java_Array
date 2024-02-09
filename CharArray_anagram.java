public class array4{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        String a="Care";
        String b="Race";
        a=a.toLowerCase();
        b=a.toLowerCase();
        char[] char1=a.toCharArray();
        char[] char2=a.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean result=Arrays.equals(char1,char2);
        if(result){
            System.out.println("It's Anagram");
        }else{
            System.out.println("It's not Anagram");
        }



}}

