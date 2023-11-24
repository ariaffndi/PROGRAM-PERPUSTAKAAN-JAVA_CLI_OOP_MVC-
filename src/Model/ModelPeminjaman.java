package Model;

import Node.NodePeminjaman;

import java.util.ArrayList;

public class ModelPeminjaman {
    public ArrayList<NodePeminjaman> peminjaman;
    public ModelPeminjaman(){
        this.peminjaman = new ArrayList<>();
    }

    public void insertDataPinjam(String kodeTransaksi, String nama, String buku, int tgl_pinjam, int tgl_kembali){
        NodePeminjaman newPeminjaman = new NodePeminjaman(kodeTransaksi, nama, buku, tgl_pinjam, tgl_kembali);
        this.peminjaman.add(newPeminjaman);
    }

    public ArrayList<NodePeminjaman> getPeminjaman() {
        return peminjaman;
    }

    public void deleteDataPeminjaman (String kodeTransaksi) {
        NodePeminjaman deletePeminjaman = searchPeminjaman(kodeTransaksi);
        peminjaman.remove(deletePeminjaman);
    }

    public NodePeminjaman searchPeminjaman (String kode) {
        NodePeminjaman dataPinjam = null;
        for (NodePeminjaman searchPinjam : peminjaman) {
            if (kode.equals(searchPinjam.getKodeTransaksi())) {
                dataPinjam = searchPinjam;
            }
        }
        return dataPinjam;
    }

}