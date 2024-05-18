package pack;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //запись в коллекцию #0
        ArrayList<Birth> collection = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src/pack/BirthsKingCountry2001.txt"))) {
            for (int i = 0; i < 2500; i += 1) {
                Birth birth = new Birth(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
                        sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                collection.add(birth);
            }
        } catch (IOException e) {
            System.out.println("error");
        }
        ArrayList<Integer> countOfChildren = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Integer> education = new ArrayList<>();
        int k = 0;
        int married = 0;
        int cmarried = 0;
        int notmarried = 0;
        int notcmarried = 0;
        for (int i = 0; i < 2500; i += 1) {
            if (collection.get(i).married == 1) {
                cmarried += 1;
                married += collection.get(i).gestation;
            } else {
                notcmarried += 1;
                notmarried += collection.get(i).gestation;
            }

            if (countOfChildren.indexOf(collection.get(i).parity) == -1) {
                k += 1;
                countOfChildren.add((collection.get(i).parity));
                int index = countOfChildren.indexOf(collection.get(i).parity);
                count.add(index, 1);
                education.add(index, collection.get(i).education);


            } else {
                int index = countOfChildren.indexOf(collection.get(i).parity);
                int ed = education.get(index);
                int cou = count.get(index);
                count.remove(index);
                education.remove(index);
                count.add(index, cou + 1);
                education.add(index, collection.get(i).education + ed);


            }

        }

        for (int i = 0; i < k; i += 1) {
//1
            System.out.println("count of children = " + countOfChildren.get(i) + " average education = " + (education.get(i) / count.get(i)));
        }
        if (married / cmarried < notmarried / notcmarried) {//проверка факта №2
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //#3
        String text = "";
        for (int i = 0; i < 2500; i += 1) {
            text = text + collection.get(i).gender + " " + collection.get(i).married + " " + collection.get(i).gestation + " \n";
        }

        try {
            FileOutputStream fos = new FileOutputStream("file.txt");
            byte[] textBytes = text.getBytes();
            fos.write(textBytes);
            fos.close();
        } catch (IOException e) {
            System.out.println("error");
        }
        try (FileReader reader = new FileReader("file.txt")) {

            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException e) {

            System.out.println("error");
        }


    }
}