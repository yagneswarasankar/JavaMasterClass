package chapters.Strings;

public class StringOperations {

    private static String s = "Girija";//new String("Girija");
    private static char[] str = s.toCharArray();
    static int[] intArray = {1,2,3};
    public static void main(String[] args) {

        String str1 = new String();
        System.out.println(s);
        System.out.println(str1.isEmpty());

        for(int i: intArray){
            System.out.println(i);
        }

        for(char c: str ){
            System.out.println("println "+c );
        }

        System.out.println("Girija".substring(2));
        System.out.println("Girija".indexOf('i',2));

    }
}
