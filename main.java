package org.odev6;

import javax.swing.*;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] metinDizisi = {"Merhaba", "Meliha", "İpek", "Test", "Otomasyon", "Dersi"};
        Set<Character> result = findUniqueCharacters(metinDizisi);
     if (result != null) {
        System.out.println("Oluşturulan Yeni Metin : " + yeniMetin);
       } else {
        System.out.println("İki kelime bulunamadı.");
        }
    }
}
public static Set<Character> findUniqueCharacters(String[] metinDizisi) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (String metin : metinDizisi) {
            for (int i = 0; i < metin.length(); i++) {
                char karakter = metin.charAt(i);
                uniqueCharacters.add(karakter);
            }
        }

        return uniqueCharacters;
    }
}

