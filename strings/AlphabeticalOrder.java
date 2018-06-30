package strings;

/**
 * Created by Govind on 2/05/2017
 */


// print character of string in alphabetical order
// print words of a string in alphabetical order

public class AlphabeticalOrder {

    public static void printWordsInOrder(String str){
        String[] stringArray = str.split(" ");
        for (int i = 1; i < stringArray.length; i++) {
            String key = stringArray[i];
            int j = i - 1;
            while( j >= 0 && key.charAt(0) < stringArray[j].charAt(0)) {
                stringArray[j + 1] = stringArray[j];
                j--;
            }
            stringArray[j + 1] = key;
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " " );
        }
    }

    public static void printStringCharacterInOrder(String str){
        Character[] arr = new Character[str.length()];
        arr[0] = str.charAt(0);
        for (int i = 1 ; i < str.length()  ; i++) {
            Character temp = str.charAt(i);
            arr[i] = temp;
            int j = i - 1  ;
            while ( j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
//        printStringCharacterInOrder("heyhowyoudoing");
        printWordsInOrder("how are you doing");
    }
}
