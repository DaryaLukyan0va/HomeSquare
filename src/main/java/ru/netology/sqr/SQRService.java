package ru.netology.sqr;

public class SQRService {
         public int homeSquare(int min, int max) {
            int count = 0;
             for (int s = 10; s <= 99; s++) {
                int q = s * s;
                if (q >= min && q <= max) {
                    count++;}
                } System.out.println("Количество чисел, входящих в диапазон равно " + count);
             return count;
         }
    }


