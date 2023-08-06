
package hitung;
import java.util.Scanner;

public class MatematikaBerakssi {
    public static void main(String[] args) {
    //membuat objek
    Matematika mtk = new Matematika (4,5);
    
    System.out.println("Hasil penjumlahan : "+mtk.setPenjumlahan());
    System.out.println("Hasil pengurangan : "+mtk.setPengurangan());
    System.out.println("Hasil perkalian   : "+mtk.setPerkalian());
    System.out.println("Hasil pembagian   : "+mtk.setPembagian());
    }
}
