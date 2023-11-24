package View;

import Model.ModelAdmin;
import Node.NodeAdmin;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewAdmin {
    Scanner input = new Scanner(System.in);
    int incId = 3;

    public void insertAdmin(ModelAdmin modelAdmin){
        System.out.println("\n--- Input data Admin ---");
        System.out.print("Nama Admin : ");
        String inputNama = input.next();
        System.out.print("Password : ");
        String inputPassword = input.next();
        String username = "admin" + this.incId;
        modelAdmin.insertAdmin(username, inputNama, inputPassword);
        incId++;
        System.out.println("Data Berhasil Ditambah!");
    }

    public void deleteAdmin(ModelAdmin modelAdmin) {
        System.out.println("\n--- Delete data Admin ---");
        System.out.print("Username : ");
        String searchUsername = input.next();
        NodeAdmin admin = modelAdmin.searchAdminbyUsername(searchUsername);
        if (admin != null) {
            modelAdmin.deleteAdmin(searchUsername);
            System.out.println("Data Berhasil Dihapus!");
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void updateAdmin(ModelAdmin modelAdmin) {
        System.out.println("\n--- Update Data Admin ---");
        System.out.print("Username : ");
        String searchUsername = input.next();
        NodeAdmin admin = modelAdmin.searchAdminbyUsername(searchUsername);
        if (admin != null) {
            System.out.print("Nama admin : ");
            String updateNama = input.next();
            System.out.print("Password : ");
            String updatePassword = input.next();
            modelAdmin.updateAdmin(searchUsername, updateNama, updatePassword);
            System.out.println("Data Berhasil Diupdate!");
        } else {
            System.out.println("Buku Tidak Ditemukan !");
        }
    }

    public void adminsData(NodeAdmin nodeAdmin){
        System.out.println("Username : " + nodeAdmin.getUsername());
        System.out.println("Nama Anggota : " + nodeAdmin.getNama());
        System.out.println("Password : " + nodeAdmin.getPassword());
        System.out.println("---------------------");
    }

    public void viewAdmin(ModelAdmin modelAdmin) {
        System.out.println("\n--- Cari data Admin ---");
        System.out.print("Nama Admin : ");
        String searchName = input.next();
        NodeAdmin admin = modelAdmin.searchAdminbyName(searchName);
        if (admin != null) {
            adminsData(admin);
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void viewAllAdmin (ArrayList<NodeAdmin> admins){
        System.out.println("\n--- Data Semua Anggota ---");
        for (NodeAdmin admin : admins) {
            adminsData(admin);
        }
    }

    public void cekLogin(ModelAdmin modelAdmin) {
        boolean login = false;
        do {
            System.out.println("\n--- Login Data Admin ---");
            System.out.print("Username : ");
            String searchUsername = input.next();
            System.out.print("Password : ");
            String searchPassword = input.next();
            NodeAdmin admin = modelAdmin.cekLogin(searchUsername, searchPassword);
            if (admin != null) {
                System.out.println("Login Berhasil !");
                login = true;
            } else {
                System.out.println("Login Gagal !");
            }
        } while (!login);
    }
}
