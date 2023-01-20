package TestGuava;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class HelloOtus {

    /**
     * To start the application:
     * ./gradlew build
     * java -jar ./L01-gradle/build/libs/gradleHelloWorld-0.1.jar
     * <p>
     * To unzip the jar:
     * unzip -l L01-gradle.jar
     * unzip -l gradleHelloWorld-0.1.jar
     */
        public static void main(String... args) {
            List<Integer> example = new ArrayList<>();
            int min = -2;
            int max = 19;
            for (int i = min; i < max; i++) {
                example.add(i);
            }

            System.out.println(Lists.reverse(example));
        }
    }

