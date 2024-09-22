public class Jadwal {
    private String hari;
    private String waktuMulai;
    private String waktuSelesai;

    public Jadwal(String hari, String waktuMulai, String waktuSelesai) {
        this.hari = hari;
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
    }

    public String getHari() {
        return hari;
    }

    public String getWaktuMulai() {
        return waktuMulai;
    }

    public String getWaktuSelesai() {
        return waktuSelesai;
    }
}