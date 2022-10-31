/*[Google] Add One To Number
You are given a non-negative number represented as an array of digits.

Example: 123 is represented as [1,2,3]

You must add 1 to the number ( increment the number represented by the digits ) and return the required array or list.

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3], the returned vector should be [1, 2, 4],

as 123 + 1 = 124.

Some notes:

Your returned array must not have any leading zeros. Example:
Input:
[0,0,2,1]
 
Ouput:
[2,2] // no leading zeros
Maximum size of the array is 300 so avoid converting it to a string or an integer. Instead, try to think of what happens when 1 is added to the number.*/


import java.util.Scanner;
import java.util.Arraylist;
class add_one_to_num {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
         
        int index = a.size()-1;
        int carry=1;
        while(index>=0){
            if(a.get(index)==9 && carry==1){
                a.set(index,0);
                carry=1;
            }
            else{
                a.set(index,a.get(index)+carry);
                carry=0;
            }
            index=index-1;
        }
        if(carry==1){
            a.add(0);
        }
        while(a.get(0)==0){
            a.remove(0);
        }
        return(a);
    }
      public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          ArrayList<Integer> b = new ArrayList<Integer>();
          while(sc.hasNextInt()){
              int i = sc.nextInt();
              b.add(i);
          }
          plusOne(b);
      }
  }
  /* 
  import java.util.ArrayList;

class solution {
  public static void main(String[] args){

    // create ArrayList
    ArrayList<String> languages = new ArrayList<>();

    // Add elements to ArrayList
    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    System.out.println("ArrayList: " + languages);
  }
}*/