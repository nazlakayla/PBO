import java.util.*;

public class Family {
    private List<Uncle> uncles;
    private List<Niece> nieces;

    public Family() {
        this.uncles = new ArrayList<>();
        this.nieces = new ArrayList<>();
    }

    // Menambahkan Niece
    public boolean addNiece(String name, int day, int month, int year) {
        if (findNiece(name) != null) {
            return false;
        }
        nieces.add(new Niece(name, day, month, year));
        return true;
    }

    // Menambahkan Uncle
    public boolean addUncle(String name) {
        if (findUncle(name) != null) {
            return false;
        }
        uncles.add(new Uncle(name));
        return true;
    }

    // Mencari Niece berdasarkan nama
    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equalsIgnoreCase(name)) {
                return niece;
            }
        }
        return null;
    }

    // Mencari Uncle berdasarkan nama
    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equalsIgnoreCase(name)) {
                return uncle;
            }
        }
        return null;
    }

    // Menampilkan daftar Niece
    public void listNieces() {
        nieces.sort(Comparator.comparing(Niece::getBirthday));
        System.out.println("\nDaftar Niece:");
        for (Niece niece : nieces) {
            System.out.println(niece.getName() + " - " + niece.getBirthday());
        }
    }

    // Menampilkan daftar Uncle
    public void listUncles() {
        uncles.sort(Comparator.comparing(Uncle::getName));
        System.out.println("\nDaftar Uncle:");
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }

    // Getter untuk daftar Niece dan Uncle
    public List<Niece> getNieces() {
        return nieces;
    }

    public List<Uncle> getUncles() {
        return uncles;
    }
}
