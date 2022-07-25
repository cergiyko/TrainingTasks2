//Task1
// You will be given an array of numbers. You have to sort
// the odd numbers in ascending order while leaving the
// even numbers at their original positions.

//[7, 1]  =>  [1, 7]
//[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
//[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

//Task2
//Write a function that will return the count of distinct
// case-insensitive alphabetic characters and numeric digits
// that occur more than once in the input string. The input
// string can be assumed to contain only alphabets
// (both uppercase and lowercase) and numeric digits.

//Task3
//Given two arrays a and b write a function comp(a, b)
// (orcompSame(a, b)) that checks whether the two arrays
// have the "same" elements, with the same multiplicities
// (the multiplicity of a member is the number of times it appears).
// "Same" means, here, that the elements in b are the elements
// in a squared, regardless of the order.

//Task4
//Create a method that will take an integer, square each digit,
// and return an integer made up of those digits:
//
// 9119 -> 811181
// 22638 -> 4436964

//Task5
//You probably know the "like" system from Facebook and other pages.
// People can "like" blog posts, pictures or other items. We want to
// create the text that should be displayed next to such an item.
//Implement the function which takes an array containing the names
// of people that like an item. It must return the display text as
// shown in the examples:
//[]                                -->  "no one likes this"
//["Peter"]                         -->  "Peter likes this"
//["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"


package com.company;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        sortArray(new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        System.out.println();

        System.out.println("Task2");
        duplicateCount("aabbcde");
        duplicateCount("Indivisibilities");

        System.out.println("Task3");
        int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a,b));

        System.out.println("Task4");
        squareDigits(9119);

        System.out.println("Task5");
        whoLikesIt("Max", "John", "Mark");
    }

    //Task1
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]%2==1){
                for (int j = 0; j < array.length-1; j++) {
                    if(array[j]%2==1&&array[i]<array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }}
        for (int t:array) {
            System.out.print(" "+ t);
        }
        return array;
    }

    //Task2
    public static int duplicateCount(String text) {
        text = text.toLowerCase(Locale.ROOT);
        char [] arr = text.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                if(arr[i]==arr[j]&& i != j){set.add(arr[j]);}
            }
        }
        System.out.println(set.size());
        return set.size();
    }

    //task3
    public static boolean comp(int[] a, int[] b) {
        boolean bool = false;
        for (int i = 0; i <a.length; i++) {
            if (bool==true){break;}
            for (int j = 0; j < b.length; j++) {
                if (b[j]/Math.pow(a[i],2)==0){bool = true;
                }
            }
        }
        return bool;
    }
    //Task4
    public static int squareDigits(int n) {
        String s = Integer.toString(n);
        String s1 = "";
        char [] arr = s.toCharArray();
        for (int i = 0; i <arr.length; i++) {
            s1 += Integer.parseInt(String.valueOf(arr[i]))*Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(Integer.parseInt (s1));
        return Integer.parseInt (s1);
    }

    //Task5
    public static String whoLikesIt(String... names) {
        String s = "";
        String s1 = " like this";
        int others = names.length-2;

        if(names.length<1||names[0]==""){s = "no one likes this";}
        if (names.length==1){s = names[0]+" likes this";}
        if (names.length==2){s = names[0]+" and "+names[1]+s1;}
        if (names.length==3){s = names[0]+", " + names[1] + " and " + names[2] + s1;}
        if (names.length==4){s = names[0]+", " + names[1] + " and " + others + " others" + s1;}
        System.out.println(s);
        return s;
    }


    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        System.out.println(accounts.length);
        System.out.println(accounts[0].length);
        for (int i=0;i<accounts.length; i++){

            int a =0;
            for (int j = 0; j <accounts[0].length; j++) {
                a+=accounts[i][j];
                System.out.println("i = "+i+" j = "+j + " n = "+accounts[i][j]);
            }
            if ( max < a ){ max = a;}
        }

        return max;
    }

    public static int solution(int number) {
        int sum = 0;
        if(number<=0){return 0;}
        else {
            for (int i = 0; i <number; i++) {
                if (i%3==0||i%5==0) {sum += i;}
            }
            return sum;
        }}

}



