package jatek;

public class Del extends Helyszin{
        @Override
    public String leiras(){
        return "Dél";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("");
    }

    @Override
    public String gomb() {
        return "tovább";
    }
    
}
