package Node;

public class NodeAnggota {
    String idAnggota, nama, alamat;

    public NodeAnggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getIdAnggota() {
        return idAnggota;
    }


    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}