public class JadwalPerkuliahan {
    private Jadwal jadwal;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private Ruangan ruangan;
    private String kodeMataKuliah; // Atribut baru
    private String jenisMataKuliah; // Atribut baru

    // Konstruktor yang diperbarui
    public JadwalPerkuliahan(Jadwal jadwal, MataKuliah mataKuliah, Dosen dosen, Ruangan ruangan, String kodeMataKuliah, String jenisMataKuliah) {
        this.jadwal = jadwal;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
        this.kodeMataKuliah = kodeMataKuliah;
        this.jenisMataKuliah = jenisMataKuliah;
    }

    // Getter baru untuk kodeMataKuliah dan jenisMataKuliah
    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public String getJenisMataKuliah() {
        return jenisMataKuliah;
    }

    // Getter untuk jadwal, mata kuliah, dosen, dan ruangan (sudah ada, tidak berubah)
    public Jadwal getJadwal() {
        return jadwal;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }
}