package Model;

import Node.NodeAnggota;

import java.util.ArrayList;

public class ModelAnggota {
    public ArrayList<NodeAnggota> members;

    public ModelAnggota(){
        this.members = new ArrayList<>();
    }
    public void insertMember(String idAnggota, String nama, String alamat){
        NodeAnggota newMember = new NodeAnggota(idAnggota, nama, alamat);
        this.members.add(newMember);
    }

    public ArrayList<NodeAnggota> getMembers() {
        return members;
    }
    public void deleteMember(String idAnggota) {
        NodeAnggota deleteMember = searchMemberbyId(idAnggota);
        members.remove(deleteMember);
    }

    public void updateMember (String idAnggota, String nama, String alamat) {
        NodeAnggota updateMember = searchMemberbyId(idAnggota);
        updateMember.setNama(nama);
        updateMember.setAlamat(alamat);
    }

    public NodeAnggota searchMemberbyName (String nama) {
        NodeAnggota findMember = null;
        for (NodeAnggota member : members) {
            if (nama.equals(member.getNama())) {
                findMember = member;
            }
        }
        return findMember;
    }

    public NodeAnggota searchMemberbyId (String id) {
        NodeAnggota findMember = null;
        for (NodeAnggota member : members) {
            if (id.equals(member.getIdAnggota())) {
                findMember = member;
            }
        }
        return findMember;
    }
}