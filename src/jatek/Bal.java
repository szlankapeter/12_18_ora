package jatek;

public class Bal extends Helyszin implements MasikIrany{


    @Override
    public String leiras() {
        return "Ez balra van -- Keletre vagy Nyugatra?";
    }


    @Override
    public String gomb() {
        return "Kelet";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kelet();
    }

    @Override
    public Helyszin masikIrany() {
        return new Nyugat();
    }

    @Override
    public String gomb2() {
        return "Nyugat";
    }
       
}
