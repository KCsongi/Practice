import java.util.*;

public class Main {
    public static void main(String[] args) {

/*        nonRepeatedCharacter("akarmi");

        onlyDigits("Sz3vasztok");

        duplicate("van valami a levegőben");*/
        //Try...
/*        vowelCounter("Gyere mondd el mi a baj baby én figyelek rád");
        characterCounter("Gyere mondd el mi a baj baby én figyelek rád", 'e');
        printPermutn("ABC", "");
        String d = "ABCDE";
        System.out.println(d.substring(1));
        reverseWords("Ez teljesen jó");
        System.out.println(palindrome("kosarasok"));*/
        int[] h = {5,10,15,5,6,10,1,56,89,0,2345,89};
/*        findDuplicatedNumber(h);
        smallestAndLargestNum(h);*/
        duplicate("macska");
        duplicatedChar("macska aki okos");
        removeDuplicates(h);

    }
    //1.feladat
    //Print duplicate characters from String
    public static void duplicatedChar(String myString) {
        Set<Character> mySet = new HashSet<>();
        char[] myChar = myString.toCharArray();
        for (int i = 0; i < myChar.length; i++) {
            for (int j = i+1; j < myChar.length; j++) {
                if(myChar[i] == myChar[j]) {
                    mySet.add(myChar[i]);
                }
            }
        }
        System.out.println(mySet);
    }
    //2.feladat
    //Check if two Strings are anagrams of each other
    public static void anagrams(String first, String second) {
        //Beletöltöm őket egy char tömbbe
        char[] c1 = first.toCharArray();
        char[] c2 = second.toCharArray();
        //Rendezem
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2));
    }
    //3.feladat
    // Print the first non-repeated character from String
    public static void nonRepeatedCharacter(String myString) {
        for (char i : myString.toCharArray()) {
            if(myString.indexOf(i) == myString.lastIndexOf(i)) {
                System.out.println("Megvan: " + i);
                break;
            }
        }
    }
    //4.feladat
    public static void recursive(String myString) {


    }
    //5.feladat
    //Check if a String contains only digits
    public static boolean onlyDigits(String myString) {
        for (char i : myString.toCharArray()) {
            if(Character.isDigit(i)){
                System.out.println("Ebbe bizony van szám");
                return true;
            }
        }
        System.out.println("Ez csak betű");
        return false;
    }
    //6.feladat
    //Find duplicate characters in a String
    public static void duplicate(String myString) {
        Set<Character> a = new HashSet<>();
        for (char i : myString.toCharArray()) {
            if (myString.indexOf(i) != myString.lastIndexOf(i)) {
                a.add(i);
            }
        }
        System.out.println("A duplikátumok: " + a);
    }
    //7.FELADAT
    // Count many vowels and consonants in a given String
    public static void vowelCounter(String myString) {
        //a, á, e, é, i, í, o, ó, ö, ő, u, ú, ü, ű.
        char[] vowelss = {'a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'ö', 'ő', 'u', 'ú', 'ü', 'ű'};
        int vowels = 0;
        for (char a : myString.toCharArray()){
            for (int i = 0; i < vowelss.length; i++) {
                if(vowelss[i] == a) {
                    vowels++;
                }
            }
        }
        System.out.println("Ennyi magánhangzó van benne: " + vowels);
    }
    //8.Feladat
    // Count the occurrence of a given character in String
    public static void characterCounter(String myString, char myChar) {
        int counter = 0;
        for (char a : myString.toCharArray()) {
            if(a == myChar) {
                counter++;
            }
        }
        System.out.println("A " + myChar + " karakter " + counter + " alkalommal szerepel");
    }
    //9.Feladat
    // Find all permutations of String
    public static void permutations(String myString) {
        //ABC
        //ACB
        //BAC
        //BCA

        for (int i = 0; i < myString.length(); i++) {
            char a = myString.charAt(i);
            String b = myString.substring(0, i) + myString.substring(i + 1);
            System.out.println(b + "" + a);
        }
    }
    public static void printPermutn(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring( i + 1);
            printPermutn(ros, ans+ch);
        }
    }
    //10.Feladat
    //Reverse words in a given sentence without using any library method
    public static void reverseWords(String myString) {
        String[] h = myString.split(" ");
        String help = "";
        for (int i = h.length - 1; i >= 0; i--) {
            help += h[i] + " ";
        }
        System.out.println(help);
    }
    //11.Feladat
    //Check if two String is a rotation of each other

    //12.Feladat
    //Check if the given String is Palindrome
    public static boolean palindrome(String myString) {
        char[] a = myString.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length-1; j >= 0; j--) {
                if((a[i] == a[j]) && a[i+1] == a[j-1]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    // 14. Feladat
    //Find the duplicate number on a given integer array
    public static void findDuplicatedNumber(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.println("Ez többször is szerepel " + myArray[i]);
                }
            }
        }
    }

    //15. Feladat
    //The largest and smallest number in an unsorted integer array
    public static void smallestAndLargestNum(int[] myArray) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] < min) {
                min = myArray[i];
            }
            if(myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("A tömbben a legkissebb szám: " + min);
        System.out.println("A tömbben a legnagyobb szám: " + max);
    }

    //16. Feladat
    // Find all pairs of integer arrays whose sum is equal to a given number


    //17.Feladat
    // Find duplicate numbers in an array if it contains multiple duplicates

    //18.feladat
    //Remove duplicates from the given array in Java
    public static void removeDuplicates(int[] myArray) {
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < myArray.length; i++) {
            mySet.add(myArray[i]);
        }
        System.out.println(mySet);
    }
}