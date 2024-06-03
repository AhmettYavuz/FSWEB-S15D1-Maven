package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static ArrayList<String> groceryList = new ArrayList<>();

    public static void startGrocery() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("0. Uygulamayı kapat");
            System.out.println("1. Ürün ekle");
            System.out.println("2. Ürün çıkar");
            System.out.println("3. Liste kontrol et");
            System.out.println("4. Listeyi sıralı şekilde göster");
            System.out.print("Seçiminizi yapınız: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Eklenmesini istediğiniz elemanları giriniz.");
                    String addInput = scanner.nextLine();
                    addItems(addInput);
                    break;
                case 2:
                    System.out.print("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String removeInput = scanner.nextLine();
                    removeItems(removeInput);
                    break;
                case 3:
                    System.out.print("Kontrol etmek istediğiniz ürünü giriniz: ");
                    String checkInput = scanner.nextLine();
                    checkItemIsInList(checkInput);
                    break;
                case 4:
                    printSorted();
                    break;
                case 0:
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
        scanner.close();
    }

    public static void addItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            if (!groceryList.contains(item)) {
                groceryList.add(item);
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String input) {
        String[] items = input.split(",");
        for (String item : items) {
            if (groceryList.contains(item)) {
                groceryList.remove(item);

            }
        }
        Collections.sort(groceryList);
    }

    public static void checkItemIsInList(String product) {
        if (groceryList.contains(product)) {
            System.out.println(product + " listede mevcut.");
        } else {
            System.out.println(product + " listede bulunamadı.");
        }
    }

    public static void printSorted() {
        Collections.sort(groceryList);

    }
}