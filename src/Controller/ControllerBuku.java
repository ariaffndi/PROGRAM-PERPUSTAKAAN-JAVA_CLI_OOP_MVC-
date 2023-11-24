package Controller;

import Model.ModelBuku;
import View.ViewBuku;

public class ControllerBuku {
    ModelBuku modelBuku;
    ViewBuku viewBuku;

    public ControllerBuku(ModelBuku modelBuku, ViewBuku viewBuku) {
        this.modelBuku = modelBuku;
        this.viewBuku = viewBuku;
    }

    public void insertBook() {
        viewBuku.insertBook(modelBuku);
    }
    public void deleteBook() {
        viewBuku.deleteBook(modelBuku);
    }
    public void updateBook() {
        viewBuku.updateBook(modelBuku);
    }
    public void searchBook() {
        viewBuku.viewBook(modelBuku);
    }
    public void viewAllBooks() {
        viewBuku.viewAllBooks(modelBuku.getBooks());
    }
}
