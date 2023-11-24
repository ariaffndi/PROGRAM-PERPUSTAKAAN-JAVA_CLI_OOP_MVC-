package View;

public class ViewMenu {
    public void menuUtama() {
        System.out.println("\n=== Program Perpustakaan Wisteria ===");
        System.out.println("""
            1. Transaksi Peminjaman / Pengembalian\s
            2. Manajemen Data Buku\s
            3. Manajemen Data Anggota\s
            4. Manajemen Data Admin / Pegawai""");
        System.out.print("Masukkan pilihan : ");
    }
    public void subMenu1() {
        System.out.println("\n--- Transaksi Peminjaman ---");
        System.out.println("""
                1. Input Data Peminjaman\s
                2. Cari Data Peminjaman\s
                3. Tampilkan Semua Data Peminjaman\s
                4. Input Data Pengembalian\s
                5. kembali ke menu Utama""");
        System.out.print("Masukkan pilihan : ");
    }
    public void subMenu2() {
        System.out.println("\n--- Manajemen Data Buku ---");
        System.out.println("""
                1. Input Data Buku\s
                2. Delete Data Buku\s
                3. Update Data Buku\s
                4. Cari Data Buku\s
                5. Tampilkan Semua Data Buku\s
                6. kembali ke menu Utama""");
        System.out.print("Masukkan pilihan : ");
    }
    public void subMenu3() {
        System.out.println("\n--- Manajemen Data Anggota ---");
        System.out.println("""
                1. Input Data Anggota\s
                2. Delete Data Anggota\s
                3. Update Data Anggota\s
                4. Cari Data Anggota\s
                5. Tampilkan Semua Data Anggota\s
                6. kembali ke menu Utama""");
        System.out.print("Masukkan pilihan : ");
    }

    public void subMenu4() {
        System.out.println("\n--- Manajemen Data Admin ---");
        System.out.println("""
                1. Input Data Admin\s
                2. Delete Data Admin\s
                3. Update Data Admin\s
                4. Cari Data Admin\s
                5. Tampilkan Semua Data Admin\s
                6. kembali ke menu Utama""");
        System.out.print("Masukkan pilihan : ");
    }
}
