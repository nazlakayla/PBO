public class Mahasiswa extends CivitasAkademika {
    private String kelas;

    public Mahasiswa(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("%-20s %-10s %-10s\n", getNama(), getId(), kelas);
    }
}