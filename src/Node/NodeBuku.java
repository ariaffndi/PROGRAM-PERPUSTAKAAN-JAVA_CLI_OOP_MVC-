package Node;

public class NodeBuku {
    int tahunTerbit, stok;
    String kodeBuku, judulBuku, pengarang;

    public NodeBuku(String kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int stok) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public int getStok() {
        return stok;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}