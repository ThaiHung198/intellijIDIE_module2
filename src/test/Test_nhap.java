package test;

public class Test_nhap {
    private String hoTen;
    private  double diem;
    public Test_nhap(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;// local
    }
    public void hienthithongtin(){
        System.out.println(hoTen + " : " + diem);
    }
    public double tinhDTB(double diemToan, double diemLy){
        return (diemToan + diemLy)/2;
    }
    public double tinhDTB(double diemToan, double diemLy, double diemAnh){
        return (diemToan + diemLy+ diemAnh)/3;
    }
    public double tinhDTB(double diemToan, double diemLy, String hung){
        return (diemToan + diemLy)/2;
    }
    public String getHoTen() {
        return hoTen;
    }
    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    // toString

    @Override
    public String toString() {
        return hoTen + "// " + diem;
    }
    //suppor Method
    private boolean checkDiem(){
        return this.diem >= 20;
    }
    //service Method
    public void checkHopLeDiem(){
        if(checkDiem()){
            System.out.println("điểm hợp lệ");
        } else {
            System.out.println("Điểm k hợp lệ, kiểm tra lại");
        }
    }
    // parameter list
    public double tongdiem(double ... arr){
        double sum = 0.0;// đây cũng đc gọi là local
        for (double x: arr){
            sum +=x;
        }
        return sum;
    }
}
