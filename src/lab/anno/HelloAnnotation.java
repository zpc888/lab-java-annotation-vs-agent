package lab.anno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface HelloAnnotation {
    String value() default "World!";
}
