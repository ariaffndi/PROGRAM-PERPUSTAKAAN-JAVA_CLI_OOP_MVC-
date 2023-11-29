package View;

import Model.ModelBuku;
import Node.NodeBuku;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewBuku {
    Scanner input = new Scanner(System.in);
    int total = 0;
    int incKode = 1;

    public void insertBook(ModelBuku modelBuku){
        System.out.println("\n--- Input data buku ---");
        System.out.print("Judul buku : ");
        String inputJudulBuku = input.next();
        System.out.print("Pengarang : ");
        String inputPengarangBuku = input.next();
        System.out.print("Tahun Terbit : ");
        int inputTahunBuku = input.nextInt();
        System.out.print("Stok : ");
        int inputStokBuku = input.nextInt();
        String kode = "B" + this.incKode;
        modelBuku.insertBook(kode, inputJudulBuku, inputPengarangBuku, inputTahunBuku, inputStokBuku);
        incKode++;
        total++;
        System.out.println("Data Berhasil Ditambah!");
    }

    public void deleteBook(ModelBuku modelBuku) {
        System.out.println("\n--- Delete data buku ---");
        System.out.print("Kode buku : ");
        String searchKodeBuku = input.next();
        NodeBuku buku = modelBuku.searchBookbyCode(searchKodeBuku);
        if (buku != null) {
            modelBuku.deleteBook(searchKodeBuku);
            System.out.println("Data Berhasil Dihapus!");
            total--;
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void updateBook(ModelBuku modelBuku) {
        System.out.println("\n--- Update Data Buku ---");
        System.out.print("Kode buku : ");
        String searchKodeBuku = input.next();
        NodeBuku buku = modelBuku.searchBookbyCode(searchKodeBuku);
        if (buku != null) {
            System.out.print("Judul Buku : ");
            String updateJudul = input.next();
            System.out.print("Pengarang : ");
            String updatePengarang = input.next();
            System.out.print("Tahun Terbit : ");
            int updateTahunTerbit = input.nextInt();
            System.out.print("Stok : ");
            int updateStok = input.nextInt();
            modelBuku.updateBook(searchKodeBuku, updateJudul, updatePengarang, updateTahunTerbit, updateStok);
            System.out.println("Data Berhasil Diupdate!");
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void booksData(NodeBuku book){
        System.out.println("kode buku : " + book.getKodeBuku());
        System.out.println("judul buku : " + book.getJudulBuku());
        System.out.println("pengarang buku : " + book.getPengarang());
        System.out.println("tahun terbit buku : " + book.getTahunTerbit());
        System.out.println("stok buku : " + book.getStok());
        System.out.println("---------------------");
    }

    public void viewBook(ModelBuku modelBuku) {
        System.out.println("\n--- Cari data Buku ---");
        System.out.print("Judul Buku : ");
        String searchJudul = input.next();
        NodeBuku buku = modelBuku.searchBookbyTitle(searchJudul);
        if (buku != null) {
            System.out.println("--- Data Buku ---");
            booksData(buku);
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void viewAllBooks(ArrayList<NodeBuku> books){
        if(total < 1) {
            System.out.println("\nData Masih Kosong !");
        }
        else {
            System.out.println("\n--- Data Semua Buku ---");
            for (NodeBuku book : books) {
                booksData(book);
            }
        }
    }
}
