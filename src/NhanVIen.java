public abstract class NhanVIen {
    private String ten;
    private String gioi_tinh;
    private int tuoi;
    private int kn;
    private String chuc;
    public abstract int luong();

    public void setTen(String ten) {
        // giam doc, truong phong, quet don
        /* luong = 3000 + tuoi * 500
         * truong phong
         * */
        this.ten = ten;
    }

    public void setChuc(String chuc) {
        this.chuc = chuc;
    }

    public String getChuc() {
        return chuc;
    }

    public String getTen() {
        return ten;
    }

    public String di_lam() {
        return "xe may";
    }
}
