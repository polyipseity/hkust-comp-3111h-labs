# lab 2 submission

- student ID: &lt;student ID&gt;
- name: &lt;name&gt;

## part 1

`Book.java`

```Java
package Lab2b;

import java.util.Arrays;

/*  Comp3111L-Lab2/Lab2b/Book.java       */
public class Book {
  private final String[] chapters;
  private static final int DEFAULT_CHAPTERS = 10;

  public Book() {
    chapters = new String[DEFAULT_CHAPTERS];
    for (int i = 0; i < chapters.length; i++)
      chapters[i] = "n/a";
  }

  public Book(String[] argument) {
    /* construct the object with an array of chapter names */
    /* PLEASE ADD YOUR CODE HERE */
    this.chapters = new String[Math.max(DEFAULT_CHAPTERS, argument.length)];
    Arrays.fill(this.chapters, "n/a");
    System.arraycopy(argument, 0, this.chapters, 0, argument.length);
  }

  public String getChapter(int i) {
    /* return the chapter by the given index */
    /* PLEASE ADD YOUR CODE HERE */
    return getChapters()[i];
  }

  public String[] getChapters() {
    return chapters;
  }
}
```

## part 2

`MobileComputer.java`

```Java
package Lab2c;

/*  Comp3111-Lab2/Lab2c/MobileComputer.java
    Inherits from Computer, class library for Lab2 Exercise 3  */

public class MobileComputer extends Computer implements Chargeable {
  private int battery;

  public MobileComputer() {
    secret = "MobileComputer secret";
    battery = 5;
  }

  @Override
  public void work() {
    if (battery > 0) {
      System.out.println("It is working on my lap.");
      battery--;
    } else
      System.out.println("Running out of battery");
  }

  @Override
  public void charge() {
    if (battery < 10)
      battery++;
  }
}
```

The problem was `Charger#charge` requiring a `Chargeable` as its only parameter, but `MobileComputer` is not a
`Chargeable`. While `MobileComputer` does have a `charge` method, Java does not use duck typing. We must make
`MobileComputer` implement `Chargeable` in order for it to be a `Chargeable`. Then the `MobileComputer#charge` method
automagically implements the `Chargeable#charge` interface method. Optionally, we can add `@Override` so that the
compiler ensures `MobileComputer#charge` overrides the interface method (by causing a compile error if not), in case the
interface changes in the future.
