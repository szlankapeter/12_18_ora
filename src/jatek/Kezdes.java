package jatek;

public class Kezdes extends Helyszin{
    
    @Override
    public String leiras(){
        return "Ez a kezdes";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public String gomb() {
        return "menj balra";
    }
    
    
    
}
