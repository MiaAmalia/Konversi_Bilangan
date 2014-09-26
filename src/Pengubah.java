/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fikri Anggara
 */
public class Pengubah {
    int bil;
    public int pengubah(int jenis, String bilangan){
        switch (jenis){
            case 1:
                bil = Integer.parseInt(bilangan,2);
                break;
            case 2:
                bil = Integer.parseInt(bilangan,10);
                break;
            case 3:
                bil = Integer.parseInt(bilangan, 8);
                break;
            case 4:
                bil = Integer.parseInt(bilangan, 16);
                break;
        }
        return bil;
    }
}
