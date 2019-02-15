package doctors.spring.hello.hellospring.controller;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author chenjunlin
 * @date 2019-02-13
 */
public class UserLombok {
    private final String name;
    private int age;
    private double score;
    private String[] tags;

    public UserLombok(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "UserLombok{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLombok that = (UserLombok) o;
        return age == that.age &&
                Double.compare(that.score, score) == 0 &&
                Objects.equals(name, that.name) &&
                Arrays.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, score);
        result = 31 * result + Arrays.hashCode(tags);
        return result;
    }
}
