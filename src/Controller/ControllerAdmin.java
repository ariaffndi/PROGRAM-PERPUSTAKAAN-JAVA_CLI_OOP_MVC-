package Controller;

import Model.ModelAdmin;
import View.ViewAdmin;

public class ControllerAdmin {
    ModelAdmin modelAdmin;
    ViewAdmin viewAdmin;

    public ControllerAdmin (ModelAdmin modelAdmin, ViewAdmin viewAdmin) {
        this.modelAdmin = modelAdmin;
        this.viewAdmin = viewAdmin;
    }

    public void insertAdmin() {
        viewAdmin.insertAdmin(modelAdmin);
    }
    public void deleteAdmin() {
        viewAdmin.deleteAdmin(modelAdmin);
    }
    public void updateAdmin() {
        viewAdmin.updateAdmin(modelAdmin);
    }
    public void searchAdmin() {
        viewAdmin.viewAdmin(modelAdmin);
    }
    public void viewAllAdmin() {
        viewAdmin.viewAllAdmin(modelAdmin.getAdmins());
    }
    public void cekLogin() {
        viewAdmin.cekLogin(modelAdmin);
    }
}
