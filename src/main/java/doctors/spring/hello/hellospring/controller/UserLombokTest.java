package doctors.spring.hello.hellospring.controller;

/**
 * @author chenjunlin
 * @date 2019-02-13
 */
public class UserLombokTest {
    public static void main(String[] args) {
        LombokUser lombokUser = new LombokUser("doctor");
        lombokUser.setAge(22);
        String[] array = new String[]{"apple","orange"};
        lombokUser.setTags(array);
        lombokUser.setScore(99.0);
        System.out.println(lombokUser);

    }
}
