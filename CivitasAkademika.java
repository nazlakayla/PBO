public class CivitasAkademika {
    private String nama;
    private String id;

    public CivitasAkademika(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", ID: " + id);
    }
}