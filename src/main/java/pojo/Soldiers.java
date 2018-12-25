package main.java.pojo;

public class Soldiers extends PageBean{
    private int id;
    private String name;
    private String age;
    private String img;
    private String address;
    private String unit;
    private String rank;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Soldiers(int id, String name, String age, String img, String address, String unit, String rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.img = img;
        this.address = address;
        this.unit = unit;
        this.rank = rank;
    }

    public Soldiers() {
    }

    @Override
    public String toString() {
        return "Soldiers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", img='" + img + '\'' +
                ", address='" + address + '\'' +
                ", unit='" + unit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
