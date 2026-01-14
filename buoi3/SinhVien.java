public class SinhVien 
{
    private String ten;
    private String ngaySinh;
    private boolean gioiTinh;
    private String lop;

    public SinhVien(String ten, String ngaySinh, boolean gioiTinh, String lop) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
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

    public String xemLop() {
        return lop;
    }

    public void datLop(String lop) {
        this.lop = lop;
    }

    
}