package task3;

import java.util.GregorianCalendar;  // Impor GregorianCalendar
import java.util.Calendar;           // Impor Calendar untuk mengambil tahun

class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";  // Inisialisasi variabel secretaryName
    }

    @Override
    public void raiseSalary(double byPercent) {
        // Tambahkan bonus 1/2% untuk setiap tahun kerja
        GregorianCalendar todaysDate = new GregorianCalendar();  // Membuat instance GregorianCalendar
        int currentYear = todaysDate.get(Calendar.YEAR);  // Mengambil tahun saat ini
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    // Getter untuk secretaryName (meskipun belum digunakan)
    public String getSecretaryName() {
        return secretaryName;
    }

    // Setter untuk secretaryName (opsional jika diperlukan untuk mengubah nilai)
    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }
}