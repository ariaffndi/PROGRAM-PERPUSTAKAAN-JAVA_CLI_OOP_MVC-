package Node;

public class NodeAdmin {
    String username, nama, password;

    public NodeAdmin(String username, String nama, String password) {
        this.username = username;
        this.nama = nama;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}