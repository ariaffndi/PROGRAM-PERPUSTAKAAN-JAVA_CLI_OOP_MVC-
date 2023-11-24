package Node;

public class NodePeminjaman {
    String kodeTransaksi, nama, buku;
    int tglPinjam, tglKembali;

    public NodePeminjaman(String kodeTransaksi, String nama, String buku, int tglPinjam, int tglKembali) {
        this.kodeTransaksi = kodeTransaksi;
        this.nama = nama;
        this.buku = buku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
    }

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNama() {
        return nama;
    }

    public String getBuku() {
        return buku;
    }

    public int getTglPinjam() {
        return tglPinjam;
    }

    public int getTglKembali() {
        return tglKembali;
    }
}
