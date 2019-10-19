/**
 * Created by Sergey
 */
public class Cat {
    private String name;
    private Integer age;


    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;
        return age != null ? age.equals(cat.age) : cat.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
