package b5;
public class DoAnNhanh extends DoAn{
    private double giamGia;

    public DoAnNhanh() {
    }

    public DoAnNhanh(double giamGia, String maDoAn, String tenDoAn, double soLuong, double donGia) {
        super(maDoAn, tenDoAn, soLuong, donGia);
        this.giamGia = giamGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Giam gia : "+giamGia);
    }
    
      
}
