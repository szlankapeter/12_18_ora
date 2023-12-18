package jatek;

public class Del extends Helyszin implements MasikIrany{
        @Override
    public String leiras(){
        return "Dél";
    }

        @Override
    public Helyszin egyikIrany() {
        return new D2();
    }

    @Override
    public Helyszin masikIrany() {
        return new D1();

    }

    @Override
    public String gomb() {
        return "D2";
    }

    @Override
    public String gomb2() {
        return "D1";
    }
    
}
