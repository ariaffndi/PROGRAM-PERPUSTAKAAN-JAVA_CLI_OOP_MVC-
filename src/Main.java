import Controller.*;
import Database.Database;
import View.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //object menu, buku, admin, anggota
        ViewMenu viewMenu = new ViewMenu();
        ViewBuku viewBuku = new ViewBuku();
        ViewAnggota viewAnggota = new ViewAnggota();
        ViewAdmin viewAdmin = new ViewAdmin();
        ViewPeminjaman viewPeminjaman = new ViewPeminjaman();
        ControllerBuku controllerBuku = new ControllerBuku(Database.databaseBooks, viewBuku);
        ControllerAnggota controllerAnggota = new ControllerAnggota(Database.databaseMembers, viewAnggota);
        ControllerAdmin controllerAdmin = new ControllerAdmin(Database.databaseAdmin, viewAdmin);
        ControllerPeminjaman controllerPeminjaman = new ControllerPeminjaman(Database.databaseMembers, Database.databaseBooks, Database.databasePeminjaman, viewPeminjaman);

        //cek login admin dengan sample admin static
        Database.databaseAdmin.insertAdmin("admin1", "Anya", "pass1");
        Database.databaseAdmin.insertAdmin("admin2", "Damian", "pass2");
        controllerAdmin.cekLogin();

        //program utama
        int pilihan;
        do {
            viewMenu.menuUtama();
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    int pilih1;
                    do {
                        viewMenu.subMenu1();
                        pilih1 = input.nextInt();
                        switch (pilih1) {
                            case 1:
                                controllerPeminjaman.insertLoanData();
                                break;
                            case 2:
                                controllerPeminjaman.searchLoanData();
                                break;
                            case 3:
                                controllerPeminjaman.viewAllLoanData();
                                break;
                            case 4:
                                controllerPeminjaman.insertPengembalianData();
                                break;
                            case 5:
                                continue;
                            default:
                                System.out.println("Masukan pilihan 1-4!");
                        }
                    } while (pilih1 >= 1 && pilih1 <= 4);
                    break;

                case 2:
                    int pilih2;
                    do {
                        viewMenu.subMenu2();
                        pilih2 = input.nextInt();
                        switch (pilih2) {
                            case 1:
                                controllerBuku.insertBook();
                                break;
                            case 2:
                                controllerBuku.deleteBook();
                                break;
                            case 3:
                                controllerBuku.updateBook();
                                break;
                            case 4:
                                controllerBuku.searchBook();
                                break;
                            case 5:
                                controllerBuku.viewAllBooks();
                                break;
                            case 6:
                                continue;
                            default:
                                System.out.println("Masukan pilihan 1-5!");
                        }
                    } while (pilih2 >= 1 && pilih2 <= 5);
                    break;

                case 3:
                    int pilih3;
                    do {
                        viewMenu.subMenu3();
                        pilih3 = input.nextInt();
                        switch (pilih3) {
                            case 1:
                                controllerAnggota.insertMember();
                                break;
                            case 2:
                                controllerAnggota.deleteMember();
                                break;
                            case 3:
                                controllerAnggota.updateMember();
                                break;
                            case 4:
                                controllerAnggota.searchMember();
                                break;
                            case 5:
                                controllerAnggota.viewAllMembers();
                                break;
                            case 6:
                                continue;
                            default:
                                System.out.println("Masukan pilihan 1-6!");
                        }
                    } while (pilih3 >= 1 && pilih3 <= 5);
                    break;

                case 4:
                    int pilih4;
                    do {
                        viewMenu.subMenu4();
                        pilih4 = input.nextInt();
                        switch (pilih4) {
                            case 1:
                                controllerAdmin.insertAdmin();
                                break;
                            case 2:
                                controllerAdmin.deleteAdmin();
                                break;
                            case 3:
                                controllerAdmin.updateAdmin();
                                break;
                            case 4:
                                controllerAdmin.searchAdmin();
                                break;
                            case 5:
                                controllerAdmin.viewAllAdmin();
                                break;
                            case 6:
                                continue;
                            default:
                                System.out.println("Masukan pilihan 1-6!");
                        }
                    } while (pilih4 >= 1 && pilih4 <= 5);
                    break;

                case 99:
                    System.out.println("=== Terimakasih ===");
                    break;

                default:
                    System.out.println("Masukan pilihan 1-4!");
            }
        }while (pilihan != 99 ) ;
    }
}