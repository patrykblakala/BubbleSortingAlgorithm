# BubbleSortingAlgorithm
## Description

In this project I am creating and testing a method for sorting an array of integers.

## Definition of an Array

An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.

(![image](https://user-images.githubusercontent.com/22456028/204130184-63de226c-b71c-4850-8ffd-adbb34f0c1b0.png)


## Definition of a Bubble Sort Algorithm

In bubble sort algorithm, array is traversed from first element to last element. Here, current element is compared with the next element. If current element is greater than the next element, it is swapped.

![image](https://user-images.githubusercontent.com/22456028/204130688-7d38018a-c90b-4fb0-b22b-ec888e20f78d.png)

## Bubble sort algorithm time complexity

1. Best Case Complexity **O(n)** - It occurs when there is no sorting required, i.e. the array is already sorted. The best-case time complexity of bubble sort is O(n).
2. Average Case Complexity **O(n2)** - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. The average case time complexity of bubble sort is O(n2).
3. Worst Case Complexity 	**O(n2)** - It occurs when the array elements are required to be sorted in reverse order. That means suppose you have to sort the array elements in ascending order, but its elements are in descending order. The worst-case time complexity of bubble sort is O(n2).



## Getting Started

In the project I have tested created methods using Junit unit-testing framework. In order to implement it first I added junit-jupiter dependency to my pom.xml file.

### Dependencies

```java
<dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.0</version>
        </dependency>
```

### Solution of the problem

In the BubbleSort class I created a method taking as a parameter an array of integers and returning a sorted array.
The method iterates through the array using a for loop starting from the zeroindex, compares integers next to each other and swaps their places if the next integer has a greater value than the previous one.

```java
  public static int[] bubbleSort(int[] input) {
        if (input.length <=1) {
            return input;
        }
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temporary = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temporary;
                }
            }
        }
        return input;
    }

```
Notice that in the above methods first I am checking if the input length is less than 2 in which case the smethod should return the inoput:
```java
 if (input.length <=1) {
            return input;
        }
```
### Testing

In testing methods for the bubble sort algorithm I created I tested for input of: random integers, sorted integers, an empty array, negative values, an array with 1 element and an array with duplicates

## Author

## Patryk Blakala 

## Useful resources

[https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

[https://www.geeksforgeeks.org/bubble-sort/)


