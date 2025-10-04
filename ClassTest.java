import java.util.Scanner;
import java.util.Arrays;
public class ClassTest {
    public static void main(String[] args){
        int[] arrays={2,5,8,3,4,6,10,15,20,1,11};
        Scanner input= new Scanner(System.in);
        int number;
        System.out.print("Enter a number from the array above:");
        number=input.nextInt();
        int index= -1;
        //Finding index of a given a number
        for(int i=0;i<arrays.length;i++){
            if (arrays[i]==number){
                index=i;
                break;
            }          
        }
        if(index==-1){
            System.out.println("The index of the number is not found");
        }
        else{
            System.out.println("The index of the number is"+index);
        }

        //Task 2.. Asking the user for two numbers to swap
        System.out.println("Enter the index of the numberin the array you want to swap:");
        int firstNumber;
        firstNumber=input.nextInt();
        System.out.println("Enter the index of the  number in the array you want to swap:");
        int secondNumber;
        
        secondNumber=input.nextInt();
        // int indexOffirstnumber=-1;
        // for(int i=0;i<arrays.length;i++){
        //     if (arrays[i]==firstNumber){
        //         indexOffirstnumber=i;
        //         break;
        //     }          
        // }
        // int indexOfsecondnumber=-1;
        // for(int i=0;i<arrays.length;i++){
        //     if (arrays[i]==secondNumber){
        //         indexOfsecondnumber=i;
        //         break;
        // }
        // }
        // int indexwithnojob;
        // indexwithnojob=arrays[indexOffirstnumber];
        // indexOffirstnumber=arrays[indexOfsecondnumber];
        // indexOfsecondnumber=indexwithnojob;
        int[] newarrays={2,5,8,3,4,6,10,15,20,1,11};
        int temp=newarrays[firstNumber];
        newarrays[firstNumber]=newarrays[secondNumber];
        newarrays[secondNumber]=temp;
        // for(int i=0;i<newarrays.length;i++){
        //     System.out.println(newarrays[i]);

        // }
        System.out.println(Arrays.toString(newarrays));
        
        //Task 3
        //Sort the array in ascending and descending order
        //Ascending order
        
        for(int i=0;i<arrays.length-1;i++){
            for (int k=0;k<arrays.length-1-i;k++){
                if(arrays[k]>arrays[k+1]){
                    int sub=arrays[k];
                    arrays[k]=arrays[k+1];
                    arrays[k+1]=sub;
                }
            }
        } 
        System.out.println(Arrays.toString(arrays));
        //Descending order
        for (int i=0;i<arrays.length/2;i++){
            int k=arrays[i];
            arrays[i]=arrays[arrays.length-1-i];
            arrays[arrays.length-1-i]=k;
        
        }
        System.out.println(Arrays.toString(arrays));

        //Task 4 
        //Linear search
        int LinearIndex=-1;
         System.out.print("Enter the number you want to search for: ");
        int newIndex = input.nextInt();
        
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == newIndex) {
                LinearIndex = i;
                break;  
            }
        }

        if (LinearIndex == -1) {
            System.out.println("Number not found in the array.");
        } else {
            System.out.println("Number found at index: " + LinearIndex);
        }

        //Binary search
        System.out.println("Enter your number to search for: ");
        int BinaryIndex = input.nextInt();

        int low = 0;
        int high = arrays.length - 1;
        int foundIndex = -1;  // -1 means not found

        while (low <= high) {
            int mid = (low + high) / 2;  

            if (arrays[mid] ==BinaryIndex) {
                foundIndex  = mid;
                break;
            } else if (arrays[mid] < foundIndex) {
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }

        if (foundIndex== -1) {
            System.out.println("Number not found in the array.");
        } else {
            System.out.println("Number found at index: " + foundIndex);
        }
    }
 
}




