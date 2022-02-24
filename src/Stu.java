public class Stu implements Comparable<Stu> {
    private String name;
    private int age;
    private String address;

    @Override
    public int compareTo(Stu o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Stu(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Stu() {
    }
}
