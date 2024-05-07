package Java_Package;

class Prep {
    static String isVowel(char ch)
    {
        String str = "aeiouAEIOU";
        return (str.indexOf(ch) != -1) ? "Vowel" : "Consonant";
    }
    public static void main(String[] args)
    {
        System.out.println("It is a " + isVowel('a'));
        System.out.println("It is a " + isVowel('x'));
    }
}
