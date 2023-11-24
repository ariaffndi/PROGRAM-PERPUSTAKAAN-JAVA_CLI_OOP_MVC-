package Controller;

import Model.*;
import View.ViewPeminjaman;

public class ControllerPeminjaman {
    ModelAnggota modelAnggota;
    ModelBuku modelBuku;
    ModelPeminjaman modelPeminjaman;
    ViewPeminjaman viewPeminjaman;

    public ControllerPeminjaman(ModelAnggota modelAnggota, ModelBuku modelBuku, ModelPeminjaman modelPeminjaman, ViewPeminjaman viewPeminjaman) {
        this.modelAnggota  = modelAnggota;
        this.modelBuku = modelBuku;
        this.modelPeminjaman = modelPeminjaman;
        this.viewPeminjaman = viewPeminjaman;
    }

    public void insertLoanData() {
        viewPeminjaman.insertLoan(modelAnggota, modelBuku, modelPeminjaman);
    }

    public void insertPengembalianData() {
        viewPeminjaman.deleteDataPeminjaman(modelPeminjaman, modelBuku);
    }
    public void searchLoanData() {
        viewPeminjaman.viewLoan(modelPeminjaman);
    }
    public void viewAllLoanData() {
        viewPeminjaman.viewAllDataPeminjaman(modelPeminjaman.getPeminjaman());
    }
}
