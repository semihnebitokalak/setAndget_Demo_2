public class Main {
    public static void main(String[] args) {
        // Kitap nesnesi oluştur ve constructor ile değerleri başlat
        Book book = new Book("Simyacı", "Paulo Coelho", 184, 1988);
        // Kitap bilgilerini ekrana yazdır
        System.out.println("Kitap Bilgileri:");
        System.out.println("Ad: " + book.getName());
        System.out.println("Yazar: " + book.getAuthor());
        System.out.println("Sayfa Sayısı: " + book.getPages());
        System.out.println("Yayın Yılı: " + book.getYear());

        // Kitap bilgilerini güncelleme
        book.setPages(200);
        System.out.println("\nGüncellenmiş Sayfa Sayısı: " + book.getPages());
    }
}
