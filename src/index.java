public class index {
    public static void main(String[] args) {
        NhanVIen kha_banh = new NhanVIen() {
            @Override
            public int luong() {
                return 1000;
            }
        };
        kha_banh.setTen("banh");
        String pt = kha_banh.di_lam();
        System.out.println(kha_banh.luong());

        kha_banh = new NhanVienCaoCap();
        System.out.println(kha_banh.luong());
    }
}
