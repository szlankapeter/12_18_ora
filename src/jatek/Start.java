package jatek;

public class Start extends Helyszin {
    

    @Override
    public String leiras() {
        return "Ez a START!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }
    
    @Override
    public String gomb() {
        return "menj tovább";
    }
    
}
