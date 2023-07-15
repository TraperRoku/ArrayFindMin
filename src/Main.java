import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        findMin(readElements(readInteger()));
    }


    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ilosc elementow tablicy");
        int howMany= scanner.nextInt();
        //scanner.close();
        return howMany;

    }
    private static int[] readElements(int howMany){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz wartosci tablicy");
        int[] tablica = new int[howMany];
        for(int i=0;i<howMany;i++){
            tablica[i] = Integer.parseInt(scanner.nextLine());

        }

        System.out.println(Arrays.toString(tablica));
        return tablica;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("Minimalna cyfra = "+ min);
        return min;
    }
}