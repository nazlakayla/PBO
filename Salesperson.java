public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }

    public int compareTo(Salesperson other) {
        if (this.getSales() != other.getSales()) {
            return this.getSales() - other.getSales();
        } else {
            int lastNameCompare = this.lastName.compareTo(other.getLastName());
            if (lastNameCompare != 0) {
                return lastNameCompare;
            } else {
                return this.firstName.compareTo(other.getFirstName());
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
