package doctors.spring.hello.hellospring.controller;

import lombok.Data;

/**
 * @author chenjunlin
 * @date 2019-02-13
 */
@Data
public class LombokUser {
    private final String name;
    private int age;
    private double score;
    private String[] tags;
}
