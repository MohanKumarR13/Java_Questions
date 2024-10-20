Second Largest Number In Array Without Sorting Array
====================================================
public class SecondLargest {

    public static Integer findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return null; // Not enough elements
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second && number < first) {
                second = number;
            }
        }

        return second == Integer.MIN_VALUE ? null : second;
    }

    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        Integer secondLargest = findSecondLargest(array);
        System.out.println("The second largest number is: " + secondLargest);
    }
}
First Largest Number In Array Without Sorting Array
====================================================
public class LargestElement {

    public static Integer findLargest(int[] arr) {
        if (arr.length == 0) {
            return null; // No elements in the array
        }

        int largest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        Integer largestElement = findLargest(array);
        System.out.println("The largest number is: " + largestElement);
    }
}
First Smallest Number In Array Without Sorting Array
====================================================
public class SmallestElement {

    public static Integer findSmallest(int[] arr) {
        if (arr.length == 0) {
            return null; // No elements in the array
        }

        int smallest = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        Integer smallestElement = findSmallest(array);
        System.out.println("The smallest number is: " + smallestElement);
    }
}
Second Smallest Number In Array Without Sorting Array
====================================================
public class SecondSmallestElement {

    public static Integer findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            return null; // Not enough elements
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number > smallest && number < secondSmallest) {
                secondSmallest = number;
            }
        }

        return secondSmallest == Integer.MAX_VALUE ? null : secondSmallest;
    }

    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        Integer secondSmallestElement = findSecondSmallest(array);
        System.out.println("The second smallest number is: " + secondSmallestElement);
    }
}

ExcelReader
=============
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        String excelFilePath = "path/to/your/excel/file.xlsx"; // Change this to your Excel file path
        try {
            FileInputStream fis = new FileInputStream(new File(excelFilePath));
            Workbook workbook = new XSSFWorkbook(fis); // For .xlsx files

            Sheet sheet = workbook.getSheetAt(0); // Read the first sheet

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("Unknown Type\t");
                    }
                }
                System.out.println(); // New line after each row
            }

            workbook.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
Arstrction and INterface In Java
=================================
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Output: The dog barks.
        myDog.sleep(); // Output: The animal is sleeping.

        myCat.sound(); // Output: The cat meows.
        myCat.sleep(); // Output: The animal is sleeping.
    }
}

// Interface
interface Shape {
    void draw(); // Abstract method
}

// Implementing the interface in classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        Shape myRectangle = new Rectangle();

        myCircle.draw(); // Output: Drawing a circle.
        myRectangle.draw(); // Output: Drawing a rectangle.
    }
}


Type of joins in SQL
https://www.softwaretestingo.com/mphasis-interview-questions-process/

import java.util.ArrayList;
import java.util.List;

public class CharacterCombinations {
    public static void main(String[] args) {
        String input = "I Love Dogs";
        List<String> combinations = generateCombinations(input);
        
        // Print the results
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    private static List<String> generateCombinations(String input) {
        // Remove spaces for combinations
        String cleanedInput = input.replace(" ", "");
        List<String> results = new ArrayList<>();
        
        // Generate combinations
        for (int i = 0; i < cleanedInput.length(); i++) {
            for (int j = 0; j < cleanedInput.length(); j++) {
                if (i != j) { // Ensure characters are not the same
                    results.add("" + cleanedInput.charAt(i) + cleanedInput.charAt(j));
                }
            }
        }
        
        return results;
    }
}


