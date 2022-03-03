public class getNama {
    String getNama(){
        return "Arif Nur Ramadhan";
    }
}

class getName extends getNama {
    String getName(){
        return "Elon Musk";
    }

    String getParentName(){
        return super.getNama();
    }
}
