import java.util.*;

public class Niece {
    private String name;
    private int day;
    private int month;
    private int year;
    private Map<Uncle, String> presents;

    public Niece(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }

    // Menghapus semua present
    public int clearPresents() {
        int count = presents.size();
        presents.clear();
        return count;
    }

    // Menampilkan daftar present yang diterima Niece
    public void listPresents(List<Uncle> allUncles) {
        System.out.println("\nDaftar Present untuk " + name + ":");
        for (Uncle uncle : allUncles) {
            if (presents.containsKey(uncle)) {
                System.out.println(uncle.getName() + " memberikan: " + presents.get(uncle));
            } else {
                System.out.println(uncle.getName() + " tidak memberikan present.");
            }
        }
    }

    // Menambahkan present yang diterima
    public boolean addPresent(Uncle giver, String description) {
        if (presents.containsKey(giver)) {
            return false;
        }
        presents.put(giver, description);
        return true;
    }
}
