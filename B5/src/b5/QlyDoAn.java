package b5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QlyDoAn {
    private ArrayList<DoAn> listDA = new ArrayList<>();
    
    public void themDoAn(DoAn da){
        listDA.add(da);
    }
    
    public ArrayList<DoAn> getDA(){
        return listDA;
    }
    
    public DoAn timTen(String ten){
        for (DoAn d : listDA) {
            if(d.getTenDoAn().equalsIgnoreCase(ten)){
                return d;
            }
        }
        return null;
    }
    
    public ArrayList<DoAn> sapXep(){
        Comparator<DoAn> cmp = new Comparator<DoAn>() {
            @Override
            public int compare(DoAn o1, DoAn o2) {
                return Double.compare(o1.getDonGia(),o2.getDonGia());
            }
        };
        Collections.sort(listDA, cmp);
        return listDA;
    }
}
