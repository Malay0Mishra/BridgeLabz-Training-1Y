import java.util.*;
public class ArrExm{
public static void main(String[]Args){
	int[] marks = {10,11,12,13,14};
	System.out.println("The Array is ");
	marks[2] = 9;
	for(int x : marks){
	System.out.println(x);
}	System.out.println(marks.length);
	System.out.println("the required is "+ marks[0]);
}}