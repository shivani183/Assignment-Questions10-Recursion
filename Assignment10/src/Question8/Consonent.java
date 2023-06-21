package Question8;

public class Consonent {

	static boolean checkConsonant(char ch)
    {
        ch = Character.toLowerCase(ch);
       
        return (ch == 'a' || ch == 'e' || 
                ch == 'i' || ch == 'o' || 
                ch == 'u') == false && ch >= 97 && ch <= 122;
    }
   
    static int totalOfConsonent(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) 
       
            if (checkConsonant(str.charAt(i)))
                ++count;
        return count;
    }
      
    public static void main(String args[])
    {
        String str = "Shivani Singh";
        System.out.println( totalOfConsonent(str));
    }

}
