package test;

public class Maintest {
    public static void main(String[] args) {
        Test_nhap sv1 = new Test_nhap("tý",9);
        sv1.hienthithongtin();
        System.out.println(sv1.getHoTen());
        System.out.println(sv1.getDiem());
        // thay đổi sv1
        sv1.setHoTen("red");
        sv1.hienthithongtin();

        sv1.setDiem(25);
        sv1.hienthithongtin();
        //test phương thức có kiểu trả về
        double dtbsv1 = sv1.tinhDTB(2.5,7.5);
        System.out.println("Điểm trung bình của SV1: " +dtbsv1);
        sv1.hienthithongtin();
        System.out.println(sv1);

        //Test support và service Method
        sv1.checkHopLeDiem();
        double testdiem = sv1.tinhDTB(5,6,7);
        System.out.println(testdiem);
        double testdiem2 = sv1.tinhDTB(5,6);
        System.out.println(testdiem2);

        sv1.tongdiem(1,2,3,5,4,8,9,6);
        double kp =sv1.tongdiem(1,2,3,5,4,8,9,6);
        System.out.println(kp);
    }
}
