package ru.dobrianskysp;

import java.util.HashMap;
import java.util.LinkedList;

public class StringToArray {

    public String[][] linetoarray(String line){
        String[] array = line.split("\n");
        String[][] retunrarray = new String[array.length][];
        for (int i = 0; i < array.length; i++) {
            retunrarray[i] = array[i].split(" ");
        } return retunrarray;
    }

    public void comparison(String[][] arr, LinkedList keys){
        String[] match = new String[keys.size()];
        int arrindex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < keys.size(); k++) {
                    if (arr[i][j].equals(keys.get(k))){
                        match[arrindex] = arr[i][j];
                        System.out.print(match[arrindex] + ", ");
                        keys.remove(k);
                        arrindex++;
                        break;
                    }
                }
            }
        }
        System.out.println("\nВсего найдено: " + arrindex + " совпадений");
    }

    public void howmanytimeshashmap(String[][] arr, HashMap key){
        for (int i = 0; i < key.size() ; i++) {
            int times = 0;
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if (key.get(i).equals(arr[j][k])){
                        times++;
                    }
                }
            }
            System.out.println("Слово: " + key.get(i) + " встретилось: " + times + " раз.");
        }
    }
}
