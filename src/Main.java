public class Main {

    public static void main(String[] args) {
        Lingkaran bulat = new Lingkaran();
        BujurSangkar kotak = new BujurSangkar();

        bulat.setRadius(50);
        bulat.hitungkelilinglingkaran();
        System.out.println("HASIL DARI KELILING LINGKARAN ADALAH = " + bulat.getKelilingLingkaran());

        kotak.setSisi(150);
        kotak.hitungkelilingbujursangkar();
        System.out.println("HASIL DARI KELILING BUJUR SANGKAR ADALAH = " + kotak.getKelilingBujurSangkar());
    }
}
