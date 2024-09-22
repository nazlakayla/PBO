public class Dosen extends CivitasAkademika {
    public Dosen(String nama, String kodeDosen) {
        super(nama, kodeDosen);
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("%-20s %-15s\n", getNama(), getId());
    }
}
