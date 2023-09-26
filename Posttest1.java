package com.mycompany.posttest1;
//import com.mycompany.posttest1.laptop;
import java.util.ArrayList;
public class Posttest1 {

    public static void main(String[] args) {
        ArrayList<laptop> laptops = new ArrayList<>();
        

        laptops.add(new laptop("Acer", "Aspire 5", 2020));
        laptops.add(new laptop("HP", "Spectre x360", 2022));
        laptops.add(new laptop("Dell", "XPS 13", 2019));
        laptops.add(new laptop("Lenovo", "ThinkPad X1 Carbon", 2021));
        laptops.add(new laptop("Apple", "MacBook Pro", 2023));

        for (laptop laptop : laptops) {
            System.out.println("Laptop " + laptop.getMerek() + " " + laptop.getModel() + " tahun " + laptop.getTahunProduksi());
        }
    }
  }
   

