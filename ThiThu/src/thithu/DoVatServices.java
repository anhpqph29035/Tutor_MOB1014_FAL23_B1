package thithu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DoVatServices {
    ArrayList<DoVat> listDV = new ArrayList<>();
    
    public void themDoVat(DoVat dv){
        listDV.add(dv);
    }
    
    public ArrayList<DoVat> xuatDoVat(){
        return listDV;
    }
    
    public DoVat timDoVat(String ma){
        for (DoVat d : listDV) {
            if(d.getMaDoVat().equalsIgnoreCase(ma)){
                return d;
            }
        }
        return null;
    }
    
    public void xoaDoVat(String ten){
        for (DoVat d : listDV) {
            if(d.getTenDoVat().equalsIgnoreCase(ten)){
                listDV.remove(d);
                break;
            }
        }
    }
    
    public ArrayList<DoVat> sapXepMa(){
        Comparator<DoVat> cmp = new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
                return o1.getMaDoVat().compareToIgnoreCase(o2.getMaDoVat());
            }
        };
        Collections.sort(listDV,cmp);
        return listDV;        
    }
    
    public DoVat timDoVatGia(double bd,double kt){
        for (DoVat d : listDV) {
            if(d.getGia()>=bd&&d.getGia()<=kt){
                return d;
            }
        }
        return null;
    }
    
    public ArrayList<DoVat> sapXepGia(){
        Comparator<DoVat> cmp = new Comparator<DoVat>() {
            @Override
            public int compare(DoVat o1, DoVat o2) {
                return Double.compare(o1.getGia(),o2.getGia());
            }
        };
        Collections.sort(listDV,cmp);
        Collections.reverse(listDV);
        return listDV;        
    }
}
