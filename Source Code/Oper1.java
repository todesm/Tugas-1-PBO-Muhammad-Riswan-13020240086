//Nama  : Muhammad Riswan
//Kelas : A3
//NIM   : 13020240086
//Waktu pengerjaan : 4 April 2026
public class Oper1 {
    public static void main(String[] args) {

        /* KAMUS */
        int n = 10; /* 1010 */
        int x = 1;  /* 0001 */
        int y = 2;  /* 0010 */

        /* ALGORITMA */
        System.out.println("n = " + n);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("n & 8 = " + (n & 8));     /* 1010 AND 1000 */
        System.out.println("x & ~8 = " + (x & ~8));   /* 0001 AND 0111 */
        System.out.println("y << 2 = " + (y << 2));   /* 0010 -> 1000 = 8 */
        System.out.println("y >> 3 = " + (y >> 3));   /* 0010 -> 0000 = 0 */
    }
}