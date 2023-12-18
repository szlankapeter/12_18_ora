/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author szlanka.peter
 */
public class Jobbra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Ez van jobbra";
    }

    @Override
    public String gomb() {
        return "Dél";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Del();
    }

    @Override
    public Helyszin masikIrany() {
        return new Eszak();

    }

    @Override
    public String gomb2() {
        return "Észak";
    }

}
