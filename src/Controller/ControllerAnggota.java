package Controller;

import Model.ModelAnggota;
import View.ViewAnggota;

public class ControllerAnggota {
    ModelAnggota modelAnggota;
    ViewAnggota viewAnggota;

    public ControllerAnggota (ModelAnggota modelAnggota, ViewAnggota viewAnggota) {
        this.modelAnggota = modelAnggota;
        this.viewAnggota = viewAnggota;
    }

    public void insertMember() {
        viewAnggota.insertMember(modelAnggota);
    }
    public void deleteMember() {
        viewAnggota.deleteMember(modelAnggota);
    }
    public void updateMember() {
        viewAnggota.updateMember(modelAnggota);
    }
    public void searchMember() {
        viewAnggota.viewMember(modelAnggota);
    }
    public void viewAllMembers() {
        viewAnggota.viewAllMembers(modelAnggota.getMembers());
    }
}
