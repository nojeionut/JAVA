# Consumer
- Consumer is a functional interface which represents an operation that accepts a single input argument and returns no result.
- It is a functional interface which takes an input and returns nothing.
- It has a single abstract method `accept(T t)` which accepts an input and returns nothing.
- It also has a default method `andThen(Consumer<? super T> after)` which returns a composed Consumer that performs, in sequence, this operation followed by the after operation.
- It is a part of `java.util.function` package.

### Example
```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello World");
    }
}
```
### Example with andThen
```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (s) -> System.out.println("Hello " + s);
        Consumer<String> consumer2 = (s) -> System.out.println("World " + s);
        consumer1.andThen(consumer2).accept("Java");
    }
}
```
