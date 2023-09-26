package com.mycompany.posttest1;
public class laptop {
    public String Merek;
    public String Model;
    public int Tahun;
    
  public laptop(String merek, String model, int tahunProduksi) {
        this.Merek = merek;
        this.Model = model;
        this.Tahun = tahunProduksi;
    }
  
    // Getter untuk merek
    public String getMerek() {
        return Merek;
    }

    // Getter untuk model
    public String getModel() {
        return Model;
    }

    // Getter untuk tahunProduksi
    public int getTahunProduksi() {
        return Tahun;
    }
}




