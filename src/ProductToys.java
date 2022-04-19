public class ProductToys {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ProductToys(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "\n наименование: " + name +
                ",\n год выпуска: " + year;
    }
}
