package Model;

import Node.NodeAdmin;

import java.util.ArrayList;

public class ModelAdmin {
    public ArrayList<NodeAdmin> admins;

    public ModelAdmin(){
        this.admins = new ArrayList<>();
    }
    public void insertAdmin(String username, String nama, String password){
        NodeAdmin newAdmin = new NodeAdmin(username, nama, password);
        this.admins.add(newAdmin);
    }

    public ArrayList<NodeAdmin> getAdmins() {
        return admins;
    }
    public void deleteAdmin (String username) {
        NodeAdmin deleteAdmin = searchAdminbyUsername(username);
        admins.remove(deleteAdmin);
    }

    public void updateAdmin (String username, String nama, String password) {
        NodeAdmin updateAdmin = searchAdminbyUsername(username);
        updateAdmin.setNama(nama);
        updateAdmin.setPassword(password);
    }

    public NodeAdmin searchAdminbyName (String nama) {
        NodeAdmin findAdmin = null;
        for (NodeAdmin admin : admins) {
            if (nama.equals(admin.getNama())) {
                findAdmin = admin;
            }
        }
        return findAdmin;
    }

    public NodeAdmin searchAdminbyUsername (String username) {
        NodeAdmin findAdmin = null;
        for (NodeAdmin admin : admins) {
            if (username.equals(admin.getUsername())) {
                findAdmin = admin;
            }
        }
        return findAdmin;
    }

    public NodeAdmin cekLogin (String username, String password) {
        NodeAdmin login = null;
        for (NodeAdmin admin : admins) {
            if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
                login = admin;
            }
        }
        return login;
    }
}