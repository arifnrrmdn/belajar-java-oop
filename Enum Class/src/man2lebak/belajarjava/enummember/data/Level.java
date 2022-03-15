package man2lebak.belajarjava.enummember.data;

public enum Level {

    //membuat enum member
    STANDARD("Member Biasa"),
    PREMIUM("Member Premium"),
    VIP("Member VIP");

    
    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}