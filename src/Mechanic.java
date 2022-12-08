public class Mechanic <T extends Transport> {
    private final String name;
    private final String surname;
    private final String copmany;

    public Mechanic(String name, String surname, String copmany) {
        this.name = name;
        this.surname = surname;
        this.copmany = copmany;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCopmany() {
        return copmany;
    }

    public boolean service(T t) {
       return t.service();

    }

    public void repair(T t) {
        t.repair();

    }
}
