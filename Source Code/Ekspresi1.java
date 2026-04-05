//Nama  : Muhammad Riswan
//Kelas : A3
//NIM   : 13020240086
//Waktu pengerjaan : 4 April 2026
public class Ekspresi1 {
    public static void main(String[] args) {

        /* KAMUS */
        int x = 1; 
        int y = 2; 
        float fx; 
        float fy;

        /* ALGORITMA */
        System.out.print("x/y (format integer) = " + x/y);
        System.out.print("\nx/y (format float) = " + (float)x/y);

        /* supaya hasilnya tidak nol */
        fx = x;
        fy = y;
        System.out.print("\nx/y (pakai float) = " + fx/fy);

        /* casting */
        System.out.print("\nfloat(x)/float(y) = " + (float)x/(float)y);

        x = 10; 
        y = 3;
        System.out.print("\nx/y (format integer) = " + x/y);
        System.out.print("\nx/y (format float) = " + (float)x/y);
    }
}