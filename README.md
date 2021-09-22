# Geometry Line Package

## Problem Description
This repository aims to model a 2D line in cartesian coordinate and computing its length.

## Proposed Solution
In our solution, we represent two points coordinate as (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>).
To compute the length, we use Euclidean distance: &#8730;(x<sub>1</sub> - x<sub>2</sub>)<sup>2</sup> + (y<sub>1</sub> - y<sub>2</sub>)<sup>2</sup>).

## Dev Environment Setup
- Ensure that you have JDK 11 version or newer installed in your local machine.
- Ensure that you have Gradle 6.5.1 version or newer installed in your local machine.

## How to Test
- Run `./gradlew test` in your CLI to test all the available test cases.

## How to Build
- Run `./gradlew build` in your CLI.
- Navigate to `build/libs` directory, and you will see that `pairing-homework-1.0-SNAPSHOT.jar` is inside the directory.

## How to Use
- Create libs directory in your Java project if you haven't done that previously.
- Copy and paste the mentioned file `pairing-homework-1.0-SNAPSHOT.jar` above into your Java project `libs` directory.

### Using Gradle
```groovy
dependencies {
    implementation files('libs/pairing-homework-1.0-SNAPSHOT.jar')
}
```

### Usage Example
```java
package com.yourcompany.yourmodule;

import com.pairing.Line;

public class ExampleClass {

    public static void main(String[] args) {
        double lineLength = Line.calculateLength(0, 1, 2, 3);

        System.out.println(lineLength);
    }
}
```

