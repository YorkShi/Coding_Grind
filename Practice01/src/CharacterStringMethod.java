/**
 * Created by lizbai on 17/9/16.
 */
public class CharacterStringMethod {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++)
        {
            String temp = args[i]; // Do operations on each String in Command Line Arguments
            //Insert your code here

            /* Exercise #1
            Output the digits in Command Line Arguments
            by method 'isDigit'
             */
            if(temp != null && temp.length() != 0){
                int L = temp.length();
                for( int m = 0 ; m < L ; m++){

                    if(Character.isDigit(temp.charAt(m))){

                        System.out.print(temp.charAt(m));

                    }
                }
                System.out.println();
            }

            /* Exercise #2
            Output the Command Line Arguments in upper case
            by method 'toUpperCase'
             */
            if(temp != null && temp.length() != 0){
            
                System.out.println(temp.toUpperCase());
                
                }
        }
        /* Exercise #3
            Given three arguments: towards the first argument, output the index in it
            where the second and third argument appears firstly.
            E.g., Input-> Java va a
                  Output-> 2 1
            by method 'indexOf'
         */
        String temp1 = args[1];
        String temp2 = args[2];
        String temp3 = args[3];
        
        if(temp1 != null && temp1.length() != 0){
            for( int j = 0; j < temp2.length() ; j++){
                System.out.println(temp1.indexOf(temp2.charAt(j)));
                break;
            }
            
            for( int k = 0; k < temp2.length() ; k++){
                System.out.println(temp1.indexOf(temp3.charAt(k)));
                break;
            }
        }
    }
}
