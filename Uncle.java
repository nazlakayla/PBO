import java.util.*;

public class Uncle {
    private String name;
    private Map<Niece, String> presents;

    public Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    // Menambahkan present untuk Niece
    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsKey(recipient) || presents.containsValue(description)) {
            return false;
        }
        presents.put(recipient, description);
        return true;
    }

    // Menampilkan daftar present yang diberikan Uncle
    public void listPresents(List<Niece> allNieces) {
        System.out.println("\nDaftar Present oleh " + name + ":");
        for (Niece niece : allNieces) {
            if (presents.containsKey(niece)) {
                System.out.println(niece.getName() + " menerima: " + presents.get(niece));
            } else {
                System.out.println(niece.getName() + " tidak menerima present.");
            }
        }
    }
}
