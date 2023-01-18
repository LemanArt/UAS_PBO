/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_oop;

/**
 *
 * @author Leman
 */
public class programmer implements karyawan {

    String nama;
    String bagian;
    int gp;
    Task mTask;

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getbagian() {
        return bagian;
    }

    public void setbagian(String bagian) {
        this.bagian = bagian;
    }

    public int getgp() {
        return gp;
    }

    public void setgp(int gp) {
        this.gp = gp;
    }

    public Task getmtmTask() {
        return mTask;
    }

    public void setmtask(Task mTask) {
        this.mTask = mTask;
    }

    public programmer() {
        mTask = new uas_oop.Task();
    }

    @Override
    public String intro() {
        return "Nama Saya " + this.nama + "\n Jabatan saya adalah seorang " + this.bagian
                + "\n Gaji Pokok saya adalah Rp." + this.gp;
    }

    @Override
    public String jobdesk() {
        return "Pekerjaan saya adalah " + mTask.getTask();
    }
}
