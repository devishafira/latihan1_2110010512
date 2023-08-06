# ini adalah matematika.java
  public class Matematika {
    private double bil1, bil2;
    
    public Matematika (double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    double setPengurangan(){
        return bil1 - bil2;
    }
    
    double setPerkalian(){
        return bil1 * bil2;
    }
    
    double setPembagian(){
        return bil1 / bil2;
    }
    
}

# ini adalah MatetamatikaBeraksi.java
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

