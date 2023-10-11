package thithu;
public class DoHoaPhat extends DoVat{
    private String chatLieu;

    public DoHoaPhat() {
    }

    public DoHoaPhat(String chatLieu, String maDoVat, String tenDoVat, int loai, double gia) {
        super(maDoVat, tenDoVat, loai, gia);
        this.chatLieu = chatLieu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chat Lieu : "+chatLieu);
    } 
}
