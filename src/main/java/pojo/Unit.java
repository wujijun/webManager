package pojo;

public class Unit {
    private int unit_id;
    private String unit_name;
    private String unit_desc;



    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getUnit_desc() {
        return unit_desc;
    }

    public void setUnit_desc(String unit_desc) {
        this.unit_desc = unit_desc;
    }

    public Unit(int unit_id, String unit_name, String unit_desc) {
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.unit_desc = unit_desc;
    }

    public Unit() {
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unit_id=" + unit_id +
                ", unit_name='" + unit_name + '\'' +
                ", unit_desc='" + unit_desc + '\'' +
                '}';
    }
}
