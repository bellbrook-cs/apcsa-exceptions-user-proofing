# User Proofing

## Problem Statement

The included project contains some code that reads in files containing different animals properties. Each file contains 1 and only 1 animal.

Your goal is to look through the code and finish "User-Proofing" the code.

Each portion that you need to modify is marked with a comment similar to the following:

```java
// TODO: some description of the problem
```

I suggest you follow this order in completing this lab:

1. Use a try-catch structure to check whether the file entered by the user exists.
2. Use a loop to continue asking for a file name until a valid file name is entered by the user.
3. Use a loop and a try-catch structure to ensure a proper integer is given inside of the `getIntFromConsole` method. Don't return anything, or leave the method until the user enters an integer.
4. Try running the program a few times, and seeing how the program acts with the different sampleX.txt files.
5. Add the throws clause to the different methods: `getIntFromFile`, `getBooleanFromFile`, and `readAnimalFromFile`
6. Use a try-catch structure to stop the program from ending when you call `readAnimalFromFile`
   - Make sure you print some error to console explaining the file was not formatted correctly.
   - Only add **valid** animals to the array list.
7. Modify the `getIntFromConsole` method to be user proofed. Don't return anything or end the method until the user enters a proper integer.
   - Keep telling the user there was an error and re prompt the user for another attempt.

## Input Description

The files included can serve as your input. I have included multiple files that should cause a couple different errors that should be accounted for.

The input files should be in the following format:

```
Name (String)
Species (String)
Noise (String)
number of legs (int)
vegetarian (boolean)

```

## Sample Input/Output

### Sample Input

animal1.txt

- Should run fine, and contain no errors.

animal2.txt

- Should run fine, and contain no errors.

animal3.txt

- Is not formatted correctly.
- You will likely get an exception because there are not enough entries.

animal4.txt

- Is not formatted correctly.
- You will likely get an exception becuase the number of legs is not an int.

animal5.txt

- Is not formatted correctly.
- You will likely get an exception because there is not new line at the end of the file.

### Sample Output

The following is an example run of the program that handles all errors properly:

```
How many files would you like me to read? 5.0
Sorry, that doesn't look like an integer. Try again: a
Sorry, that doesn't look like an integer. Try again: 5
Enter a file name: animal1.txt
Enter a file name: animal2.txt
Enter a file name: animal3.txt
ERROR: It looks like the file was not formatted correctly.
Enter a file name: animal4.txt
ERROR: It looks like the file was not formatted correctly.
Enter a file name: animal5.txt
ERROR: It looks like the file was not formatted correctly.
I am a Dog named Geoff.
I am a Cat named Fluffy.

Woof

```

## Submission

Please submit the following to google classroom:

1. `Main.java`
    * Hover over `Main.java`.
    * Click the three dots to the right of the file name.
    * Click `Download`.
    * Upload the downloaded file to google classroom.
2. A link to your replit project

## Rubric

<table>
<tbody>
  <tr>
    <td valign="top"><b>Coded Solution</b><br><br>The coded solutions works correctly with no syntax, logic, or run-time errors.</td>
    <td valign="top"><b>8pts</b><br><br>* The submitted code compiles successfully. <br><br>* The submitted program is free of run-time and logic errors. <br><br>* The submitted program returns the anticipated output for all input tested.
</td>
    <td valign="top"><b>4pts</b><br><br>* The submitted program compiles successfully. <br><br>* The submitted program includes run-time and/or logic errors that result in correct output. <br><br>* The submitted program returns the anticipated output for most (but not all) input tested.
</td>
    <td valign="top"><b>2pts</b><br><br>* A program is submitted but it fails to compile. <br><br><b><em>or</em></b> <br><br>* The submitted program compiles correctly. <br><br>* The submitted program includes run-time and/or logic errors that result in incorrect output. <br><br>* The submitted program returns the anticipated output for less than half of the input tested.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted.
</td>
  </tr>
  <tr>
    <td valign="top"><b>Target Concepts</b><br><br>The program effectively uses the intended target concepts.</td>
    <td valign="top"><b>8pts</b><br><br>* The program effectively uses the target concepts being discussed in class or outlined within the project specifications for the given problem situation.
</td>
    <td valign="top"><b>4pts</b><br><br>* The program incorrectly uses the target concepts being discussed in class or outlined within the project specifications for the given problem situation. <br><br>* Moderate effort to use the target concepts is evident.
</td>
    <td valign="top"><b>2pts</b><br><br>* The program incorrectly uses the target concepts being discussed in class or outlined within the project specifications for the given problem situation. <br><br>* Minimal effort to use the target concepts is evident.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted. <br><br><b><em>or</em></b><br><br> * No attempt was made to use the target concepts being discussed in class or outlined within the project specifications for the given problem situation.
</td>
  </tr>
  <tr>
    <td valign="top"><b>User Interface</b><br><br>The program produces output that is easy for the user to read.</td>
    <td valign="top"><b>2pts</b><br><br>* Output demonstrates appropriate spacing for best user readability. <br><br>* Output contains no spelling or grammatical errors.
</td>
    <td valign="top"><b>1pts</b><br><br>* Output includes minor spacing problems which results in information which is inconsistent or confusing. <br><br>* Output contains minor spelling or grammatical errors.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted. <br><br><b><em>or</em></b> <br><br>* Output includes major spacing problems which is severely inconsistent or confusing. <br><br>* Output contains major spelling or grammatical errors.
</td>
  </tr>
  <tr>
    <td valign="top"><b>Readability of Code</b><br><br>The program code is documented and formatted for human readability.</td>
    <td valign="top"><b>2pts</b><br><br>* The submitted solution includes the required header documentation (name, date, purpose). <br><br>* Header documentation includes appropriate modification comments if the submitted solution is a modification to a previously submitted program. <br><br>* Code is properly formatted. Open and close brackets are properly aligned and code within the brackets is appropriately indented. <br><br>* All variables are self-documented (i.e. named in such a way that the name indicates the purpose of the variable).
</td>
    <td valign="top"><b>1pts</b><br><br>* The submitted solution includes the some, but not ALL, of the required header documentation (name, date, purpose). <br><br>* In the case of modifications to a previously submitted program, modification comments are missing or incomplete. <br><br>* Code is unformatted and difficult to follow. Brackets aren't aligned and/or code within brackets is not indented. <br><br>* Numerous variable names are ambiguous (i.e. x) and do not indicate the purpose of the variable.
</td>
    <td valign="top"><b>0pts</b><br><br>* A program solution is not submitted. <br><br><b><em>or</em></b> <br><br>* The submitted solution includes no documentation of any kind.</td>
  </tr>
</tbody>
</table>
