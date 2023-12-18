package jatek;

public class Kezdes extends Helyszin implements MasikIrany{
    
    @Override
    public String leiras(){
        return "Ez a kezdes! Jobbra vagy balra?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }

    @Override
    public String gomb() {
        return "Jobbra";
    }
    
    
    
}
