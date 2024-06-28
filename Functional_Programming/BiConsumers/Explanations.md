# BiConsumer
- BiConsumer is a functional interface defined in java.util.function package
- It represents an operation that accepts two input arguments and returns no result.
- It is a functional interface which means it has only one abstract method.
- It has a method `accept()` which accepts two arguments and returns no result.
- It also has a default method `andThen()` which is used to combine two BiConsumers.

### Example
```java
BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);
add.accept(10, 20); // Output: 30
```

### Default Methods

#### andThen()
- `andThen()` method is used to combine two BiConsumers.
- It takes another BiConsumer as an argument and returns a new BiConsumer which performs the operation of the first BiConsumer followed by the second BiConsumer.

```java
BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);
BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println(a * b);

BiConsumer<Integer, Integer> addAndMultiply = add.andThen(multiply);
addAndMultiply.accept(10, 20); // Output: 30, 200
``` 

### Use Cases
- BiConsumer is used to perform some operations on two input arguments.
- It is used in the forEach() method of collections to perform some operation on each element of the collection.
- It is used in the reduce() method of streams to perform some operation on the elements of the stream.
- It is used in the accept() method of the BiConsumer interface to perform some operation on the input arguments.
```

