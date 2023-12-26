package hanhTinh;

public class HanhTinh {
    private String tenTV;
    private String tenTA;
    private double chuKy;
    private double dienTich;
    private double khoiLuong;

    public HanhTinh(String tenTV, String tenTA, double dienTich, double khoiLuong, double chuKy) {
        this.tenTV = tenTV;
        this.tenTA = tenTA;
        this.chuKy = chuKy;
        this.dienTich = dienTich;
        this.khoiLuong = khoiLuong;
    }

    @Override
    public String toString() {
        return "HanhTinh [tenTV=" + tenTV + ", tenTA=" + tenTA + ", chuKy=" + chuKy + ", dienTich=" + dienTich
                + ", khoiLuong=" + khoiLuong + "]";
    }

    public String getTenTV() {
        return tenTV;
    }

    public void setTenTV(String tenTV) {
        this.tenTV = tenTV;
    }

    public String getTenTA() {
        return tenTA;
    }

    public void setTenTA(String tenTA) {
        this.tenTA = tenTA;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public double getChuKy() {
        return chuKy;
    }

    public void setChuKy(double chuKy) {
        this.chuKy = chuKy;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

}
