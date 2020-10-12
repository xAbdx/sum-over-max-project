package org.testteam.services;
import java.util.Arrays;  //you have to import java util arrays

public class ListMaxService {
    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 23};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest in given array is " + max);
    }
}
