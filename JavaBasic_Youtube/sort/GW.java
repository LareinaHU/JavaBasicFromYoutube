package sort;

public class GW implements Comparable<GW>{
    private String name;
    private int age;
    private int hittingValue;

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

    public int getHittingValue() {
        return hittingValue;
    }

    public void setHittingValue(int hittingValue) {
        this.hittingValue = hittingValue;
    }

    @Override
    public String toString() {
        return "GW{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hittingValue=" + hittingValue +
                '}';
    }

    @Override
    public int compareTo(GW o) {
        return this.hittingValue - o.hittingValue;
    }
}
