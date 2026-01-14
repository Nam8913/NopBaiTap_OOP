public class NhanVien 
{
    private String ten;
    private String ngaySinh;
    private boolean gioiTinh;
    private double luong;

    public NhanVien(String ten, String ngaySinh, boolean gioiTinh, double luong) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
    }

    public String xemTen() {
        return ten;
    }

    public void datTen(String ten) {
        this.ten = ten;
    }

    public String xemNgaySinh() {
        return ngaySinh;
    }

    public void datNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean xemGioiTinh() {
        return gioiTinh;
    }

    public void datGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double xemLuong() {
        return luong;
    }

    public void datLuong(double luong) {
        this.luong = luong;
    }
}