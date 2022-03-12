package man2lebak.belajarjava.data;

public class Company {

    private String name;

    // Inner Class = membuat class didalam class
    public class Programmer{

        private String name;

        public String getName(){
            return name;
        }
    }
}
