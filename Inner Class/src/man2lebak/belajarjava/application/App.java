package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.Company;

public class App {
    
    public static void main(String[] args){
        //membuat object inner class
        Company company = new Company();
        company.setName("Microsoft");

        Company.Programmer springbootSpecialist = Microsoft.new Company();
    }

}
