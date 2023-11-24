package Model;

import Node.NodeBuku;

import java.util.ArrayList;

public class ModelBuku {
    public ArrayList<NodeBuku> books;

    public ModelBuku(){
        this.books = new ArrayList<>();
    }
    public void insertBook(String kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int stok){
        NodeBuku newBook = new NodeBuku(kodeBuku, judulBuku, pengarang, tahunTerbit, stok);
        this.books.add(newBook);
    }

    public ArrayList<NodeBuku> getBooks() {
        return books;
    }
    public void deleteBook (String kodeBuku) {
        NodeBuku deleteBook = searchBookbyCode(kodeBuku);
        books.remove(deleteBook);
    }

    public void updateBook (String kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int stok) {
        NodeBuku updateBook = searchBookbyCode(kodeBuku);
        updateBook.setJudulBuku(judulBuku);
        updateBook.setPengarang(pengarang);
        updateBook.setTahunTerbit(tahunTerbit);
        updateBook.setStok(stok);
    }

    public NodeBuku searchBookbyTitle (String judul) {
        NodeBuku findBook = null;
        for (NodeBuku book : books) {
            if (judul.equals(book.getJudulBuku())) {
                findBook = book;
            }
        }
        return findBook;
    }

    public NodeBuku searchBookbyCode (String kode) {
        NodeBuku findBook = null;
        for (NodeBuku book : books) {
            if (kode.equals(book.getKodeBuku())) {
                findBook = book;
            }
        }
        return findBook;
    }

    public void kembalikanStok (String judulBuku) {
        NodeBuku updateBook = searchBookbyTitle(judulBuku);
        updateBook.setStok(updateBook.getStok() + 1);
    }
}