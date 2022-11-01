import com.github.javafaker.Faker;
import com.github.javafaker.HarryPotter;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) throws InterruptedException {
        Faker faker = new Faker();

        System.out.println(faker.name().fullName());

        System.out.println(faker.chuckNorris().fact().replace("Chuck Norris", "Umid"));

        HarryPotter harryPotter = faker.harryPotter();

        System.out.println(harryPotter.character());

        System.out.println(faker.numerify("+7-77#-###-####"));
        System.out.println(faker.letterify("???, ??, ???, ??????"));
        System.out.println(faker.bothify("###???"));
    }
}
