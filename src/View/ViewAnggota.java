package View;

import Model.ModelAnggota;
import Node.NodeAnggota;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewAnggota {
    Scanner input = new Scanner(System.in);
    int incId = 1;

    public void insertMember(ModelAnggota modelAnggota){
        System.out.println("\n--- Input data Anggota ---");
        System.out.print("Nama Anggota : ");
        String inputNama = input.next();
        System.out.print("Alamat : ");
        String inputAlamat = input.next();
        String id = "M" + this.incId;
        modelAnggota.insertMember(id, inputNama, inputAlamat);
        incId++;
        System.out.println("Data Berhasil Ditambah!");
    }

    public void deleteMember(ModelAnggota modelAnggota) {
        System.out.println("\n--- Delete data Anggota ---");
        System.out.print("Id Anggota : ");
        String searchIdMember = input.next();
        NodeAnggota member = modelAnggota.searchMemberbyId(searchIdMember);
        if (member != null) {
            modelAnggota.deleteMember(searchIdMember);
            System.out.println("Data Berhasil Dihapus!");
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void updateMember(ModelAnggota modelAnggota) {
        System.out.println("\n--- Update Data Anggota ---");
        System.out.print("Id Anggota : ");
        String searchIdMember = input.next();
        NodeAnggota member = modelAnggota.searchMemberbyId(searchIdMember);
        if (member != null) {
            System.out.print("Nama Anggota : ");
            String updateNama = input.next();
            System.out.print("Alamat : ");
            String updateAlamat = input.next();
            modelAnggota.updateMember(searchIdMember, updateNama, updateAlamat);
            System.out.println("Data Berhasil Diupdate!");
        } else {
            System.out.println("Buku Tidak Ditemukan !");
        }
    }

    public void membersData(NodeAnggota nodeAnggota){
        System.out.println("Id Anggota : " + nodeAnggota.getIdAnggota());
        System.out.println("Nama Anggota : " + nodeAnggota.getNama());
        System.out.println("Alamat : " + nodeAnggota.getAlamat());
        System.out.println("---------------------");
    }

    public void viewMember(ModelAnggota modelAnggota) {
        System.out.println("\n--- Cari data Anggota ---");
        System.out.print("Nama Anggota : ");
        String searchName = input.next();
        NodeAnggota member = modelAnggota.searchMemberbyName(searchName);
        if (member != null) {
            membersData(member);
        } else {
            System.out.println("Data Tidak Ditemukan !");
        }
    }

    public void viewAllMembers (ArrayList<NodeAnggota> members){
        if(incId == 1) {
            System.out.println("\nData Masih Kosong !");
        }
        else {
            System.out.println("\n--- Data Semua Anggota ---");
            for (NodeAnggota member : members) {
                membersData(member);
            }
        }
    }
}
