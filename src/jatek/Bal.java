package jatek;

public class Bal extends Helyszin {


    @Override
    public String leiras() {
        return "Ez balra van -- Keletre vagy Nyugatra?";
    }


    @Override
    public String gomb() {
        return "Nyugat";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
}
