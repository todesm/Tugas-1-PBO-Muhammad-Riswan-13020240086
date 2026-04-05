//Nama  : Muhammad Riswan
//Kelas : A3
//NIM   : 13020240086
//Waktu pengerjaan : 4 April 2026
public class Oprator {
    public static void main(String[] args) {

        /* Kamus */
        boolean Bool1, Bool2;
        int i, j;
        float x, y;

        System.out.println("=== OPERASI BOOLEAN ===");
        Bool1 = true;
        Bool2 = false;

        System.out.println("Bool1 && Bool2 = " + (Bool1 && Bool2));
        System.out.println("Bool1 || Bool2 = " + (Bool1 || Bool2));
        System.out.println("!Bool1 = " + (!Bool1));
        System.out.println("Bool1 ^ Bool2 = " + (Bool1 ^ Bool2));

        System.out.println("\n=== OPERASI INTEGER ===");
        i = 5;
        j = 2;

        System.out.println("i + j = " + (i + j));
        System.out.println("i - j = " + (i - j));
        System.out.println("i * j = " + (i * j));
        System.out.println("i / j = " + (i / j)); // pembagian bulat
        System.out.println("i % j = " + (i % j));

        System.out.println("\n=== OPERASI FLOAT ===");
        x = 5;
        y = 5;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));

        System.out.println("\n=== OPERASI RELASIONAL INTEGER ===");
        System.out.println("i == j = " + (i == j));
        System.out.println("i != j = " + (i != j));
        System.out.println("i < j = " + (i < j));
        System.out.println("i > j = " + (i > j));
        System.out.println("i <= j = " + (i <= j));
        System.out.println("i >= j = " + (i >= j));

        System.out.println("\n=== OPERASI RELASIONAL FLOAT ===");
        System.out.println("x != y = " + (x != y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x <= y = " + (x <= y));
        System.out.println("x >= y = " + (x >= y));
    }
}