# JLox
JLox is a faithful Java implementation of [Crafting Interpreters][1]'s tree-walk interpreter tutorial. It executes programs written in the author's original language [Lox][2].

## License

I claim no copyright to this work. All copyright goes to Robert Nystrom, the original author of Crafting Interpreters. Thus is all source code in this repository also licensed under the [MIT license][3] as per the tutorial's [GitHub repository][4]'s license.

## Dependencies

- [Java 17 JDK][5]
- [Maven][6]

## Build

Build the project with Maven.

```
mvn install
```

## Run

Run the project by executing the jar and passing it the path to a Lox file. Example Lox source files can be found [here][7].

```
java -jar target/JLox-1.0.0.jar <path_to_lox_file>
```

## Notes

This implementation of JLox has not been exhaustively tested for correctness against the expectation of each test file provided at the above link. However, it was validated against any example Lox code provided in each chapter of the tutorial to demonstrate the expected behavior of each language feature.

[1]: https://craftinginterpreters.com/
[2]: https://craftinginterpreters.com/the-lox-language.html
[3]: https://choosealicense.com/licenses/mit/
[4]: https://github.com/munificent/craftinginterpreters/
[5]: https://openjdk.org/projects/jdk/17/
[6]: https://maven.apache.org/download.cgi
[7]: https://github.com/munificent/craftinginterpreters/tree/master/test/
