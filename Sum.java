import java.util.*;
public class Sum{
  // prepare a function to add and return all elements in ArrayList
  public int total(ArrayList<Integer>){
    int sum=0;
    for(int i:list){
      sum=sum+i;
    } 
  }
  public static void main(String[]args){
  // Create ArrayList Object
    List<Integer> arrayList=new ArrayList<Integer>();
    // Add Elements to it using For Loop
    for(int i=0;i<5;i++){
      arrayList.add(i+1);
    }
    Sum sm=new Sum();
     System.out.println("Sum of ArrayList elements: " + sm.total(arrayList));
  // total is your function name it should return total value
  }
}