package man2lebak.belajarjava.application;

import man2lebak.belajarjava.data.AppVersion;
import man2lebak.belajarjava.data.Computer;
import man2lebak.belajarjava.data.Country;
import man2lebak.belajarjava.data.MathUtil;

class App{

    public static void main(String[] args){

        //field static
        System.out.println(AppVersion.APPLICATION);
        System.out.println(AppVersion.VERSION);

        //method static
        System.out.println(MathUtil.sum(1,2));

        //inner class static
        Country.City city = new Country.City();
        city.setName("Bandung");

        System.out.println(city.getName());

        //block static
        System.out.println(Computer.PROCESSOR);

    }

}