/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szlanka.peter
 */
public class Eszak extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez Észak";
    }

    @Override
    public String gomb() {
        return "E2";
    }

    @Override
    public Helyszin egyikIrany() {
        return new E2();
    }

    @Override
    public Helyszin masikIrany() {
        return new E1();

    }

    @Override
    public String gomb2() {
        return "E1";
    }
    
}
