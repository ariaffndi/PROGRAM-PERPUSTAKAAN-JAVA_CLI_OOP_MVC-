package View;

import Model.*;
import Node.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewPeminjaman {
    Scanner input = new Scanner(System.in);
    int incKodeTransaksi = 1;

    public void insertLoan(ModelAnggota modelAnggota, ModelBuku modelBuku, ModelPeminjaman modelPeminjaman) {
        System.out.println("\n--- Input Data peminjaman ---");
        boolean findName = false;
        boolean findBook = false;
        String namaPeminjam = null;
        String bukuPeminjam = null;
        do {
            System.out.print("Nama Anggota : ");
            String searchName = input.next();
            NodeAnggota member = modelAnggota.searchMemberbyName(searchName);
            if (member != null) {
                namaPeminjam = member.getNama();
                findName = true;
            } else {
                System.out.println("Nama Belum Terdaftar Sebagai Member !\n");
            }
        } while (!findName);
        do {
            System.out.print("Judul Buku : ");
            String searchBook = input.next();
            NodeBuku book = modelBuku.searchBookbyTitle(searchBook);
            if (book != null) {
                if (book.getStok() > 0) {
                    bukuPeminjam = book.getJudulBuku();
                    book.setStok(book.getStok()-1);
                    findBook = true;
                }
                else {
                    System.out.println("Stok Buku Kosong !\n");
                }
            } else {
                System.out.println("Judul Buku Tidak Ditemukan !\n");
            }
        } while (!findBook);
        String kodeTransaksi = "Loan" + this.incKodeTransaksi;
        System.out.print("Tanggal Pinjam : ");
        int inputTglPinjam = input.nextInt();
        System.out.print("Tanggal Kembali : ");
        int inputTglKembali = input.nextInt();
        modelPeminjaman.insertDataPinjam(kodeTransaksi, namaPeminjam, bukuPeminjam, inputTglPinjam, inputTglKembali);
        incKodeTransaksi++;
        System.out.println("Data Berhasil Ditambah!");
    }

    public void deleteDataPeminjaman(ModelPeminjaman modelPeminjaman, ModelBuku modelBuku) {
        System.out.println("\n--- Input Data Pengembalian ---");
        System.out.print("Kode Transaksi : ");
        String searchKode = input.next();
        NodePeminjaman peminjaman = modelPeminjaman.searchPeminjaman(searchKode);
        if (peminjaman != null) {
            String bukuKembali = peminjaman.getBuku();
            modelBuku.kembalikanStok(bukuKembali);
            modelPeminjaman.deleteDataPeminjaman(searchKode);
            System.out.println("Transaksi Pengembalian Berhasil!");
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void loanData(NodePeminjaman nodePeminjaman){
        System.out.println("Kode transaksi : " + nodePeminjaman.getKodeTransaksi());
        System.out.println("Nama Peminjam : " + nodePeminjaman.getNama());
        System.out.println("Buku yang Dipinjam : " + nodePeminjaman.getBuku());
        System.out.println("Tanggal Pinjam : " + nodePeminjaman.getTglPinjam());
        System.out.println("Tanggal Kembali : " + nodePeminjaman.getTglKembali());
        System.out.println("---------------------");
    }

    public void viewLoan(ModelPeminjaman modelPeminjaman) {
        System.out.println("\n--- Cari data Peminjaman ---");
        System.out.print("Kode Transaksi : ");
        String searchKode = input.next();
        NodePeminjaman loan = modelPeminjaman.searchPeminjaman(searchKode);
        if (loan != null) {
            System.out.println("--- Data Peminjaman ---");
            loanData(loan);
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void viewAllDataPeminjaman (ArrayList<NodePeminjaman> loan){
        if(incKodeTransaksi == 1) {
            System.out.println("\nData Masih Kosong !");
        }
        else {
            System.out.println("\n--- Semua Data Peminjaman ---");
            for (NodePeminjaman peminjaman : loan) {
                loanData(peminjaman);
            }
        }
    }
}
