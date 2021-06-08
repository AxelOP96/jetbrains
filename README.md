# jetbrains
Practicas de java: Curso de JAVA en ingles y posteriormente traducido por mi.
 Learn Java while building real functional applications. You'll get to choose a project that suits your level and will get all the necessary knowledge to complete it. Completing the full track will prepare you to deal with various tasks related to desktop application or web development in Java. While progressing through different projects of this track you can learn to:
Understand the syntax of Java and write well readable and efficient code.
Work with professional development tools and GitHub.
Apply the principles of object-oriented programming widely used in commercial development.
Simplify your application design with functional programming.
Use collections to effectively process data in your application.
Use multicore processing to optimize the speed of your app.
Use the Swing library for desktop development.
Build an efficient web application with SpringBoot.
Work with data formats like JSON and XML.
Work with databases.
Aprende Java mientras construyes aplicaciones reales funcionales. Puedes elegir un proyecto de acuerdo a tu nivel y tendras todo el conocimiento para completarlo. Completar el camino completo te preparará para manejar tareas varias relacionadas a aplicaciones de escritorio o desarrollo web en Java. Mientras progresas a través de diferentes proyectos de este camino aprenderas: a entender la sintaxis en Java y escribir un codigo eficiente y leible; a trabajar con herraminetas profesionales de desarrollo y GitHub; a aplicar los principios de programacion orientada a objetos usada en desarrollo comercial; a simplificar el diseño de tu aplicacion con programcion funcional; a usar procesamiento multinucleo para optimizar la velocidad de tu app; a usar la libreria swing para desarrollo de escritorio; a crear una aplicacion web eficiente con springboot; a trabajar con formatos de data como JSONy XML; y a trabajar con bases de datos. 

Project: Simple Tic-Tac-Toe
About:
Everybody remembers this paper-and-pencil game from childhood: Tic-Tac-Toe, also known as Noughts and crosses or Xs and Os. A single mistake usually costs you the game, but thankfully it is simple enough that most players discover the best strategy quickly. Let’s program Tic-Tac-Toe and get playing!

primer desafio:
You have a guest list of the people who registered their stay at the hotel. There are 4 rooms in the hotel: 1 single room, 2 double rooms and 1 family room for three guests. The guest list consists of 4 lines. Each line contains the name or the names of the guests registered together in one room.

Read the names of the registered guests from the list and output each name in a separate line and in reverse order starting with the last registered guest. Note that the order of the guests registered in each room is undefined.

Sample Input 1:

Jane Kate
John
Mary Susan Paul
Boris Ann
Sample Output 1:

// Ann
// Boris
// Paul
// Susan
// Mary
// John
// Kate
// Jane
// 3desafio
// IntelliJ IDEA can do something with context near the cursor.

// How to ask for it?

//  Select one option from the list

// Using Alt+Enter keystroke

// Using the Change to action

// Going to File | Settings

// Creating a new file

// Creating a new project
// 4desafio
// Modify this program to output

// Cats are robots!
// desafio
// Remember the conventions for naming variables? Make the variable CACTUS@HEIGHT not only syntactically correct, but also compliant with those recommendations. Enter the result.

// What you'll do in this stage 1/5: Welcome to the battlefield!
// Description
// Tic-tac-toe is known all over the world. Each country may have its own version of the name, sometimes the rules are different, but the essence of the game remains the same. Below are the main rules that may be familiar to you since childhood.

// Tic-tac-toe is a game played by two players on a 3x3 grid. One of the players is 'X', and the other player is 'O'. X plays first, then O takes the next turn, and so on.

// The players write 'X' and 'O' on a 3x3 field.

// The first player that puts 3 X's or 3 O's in a straight line (including diagonals) wins the game.

// Objectives
// Your first task in this project is to print the game grid in the console output. Use what you’ve learned about the print() function to print three lines, each containing three characters (X’s and O’s) to represent a game of tic-tac-toe where all fields of the grid have been filled in.

 Example
 The example below shows how your output might look:

 X O X
 O X O
 X X O 
What is Java?
Java is a general-purpose modern programming language initially developed by Sun Microsystems, and currently owned by Oracle Corporation. The key feature of the language is platform independence: it means that the same Java program can be run on multiple platforms without any changes! This principle is also known as "write once, run anywhere" (or WORA).

Java has been one of the most popular programming languages for many years. It has earned the top position in the TIOBE index (a programming language popularity index). This language is used by a huge community of developers around the world! If you have a problem, you can always ask other developers or find a suitable answer online.

Java is used in our Android smartphones, the financial services industry, telecommunications, embedded systems, and in many other areas. Medical applications use it to store patient data, computer games, such as Minecraft, are created using Java; development tools like IntelliJ IDEA and Eclipse wouldn't exist without it.

A short history of Java
The Java language project was initiated in 1991 by James Gosling and his colleagues. In the beginning, the language was called "Oak." Later the project was renamed "Java" as a reference to Java coffee. For this reason, the language’s logo is a cup of coffee.

Sun Microsystems released Java 1.0 in 1996. After that, new versions were released every 1 to 3 years. Since Java 9, released in 2017, new versions have been released every 6 months. You can read more about its history and find the most recent version here.

Some important features of Java
As we've mentioned before, the most important feature of Java is platform independence.

Another important feature is a simple and clear syntax. Many elements of the language are easy to read and are widely used in other programming languages such as C/C++, C#, JavaScript, and Go.

If you have ever written programs in C/C++, you know that manual memory cleaning can lead to bugs in the code. Fortunately, Java has a garbage collector that automatically cleans memory from unused objects during runtime.

It is also important to note that Java supports multiple programming paradigms; you will get to know more about them in these topics. Java is primarily an imperative language based on the object-oriented concept: almost every part of a program is an object. Therefore, a program itself can be considered as a set of interacting objects. Also, it partially supports modern programming paradigms such as generic programming, concurrent programming, functional programming, and some others.

If you are a beginner in programming, it may be difficult to comprehend all the features of Java right now. This is not a bad thing. Throughout this set of topics, you will learn about all of these concepts.
In conclusion, Java is a modern and popular programming language that can be successfully used in almost all domains.
Literals
Regardless of its complexity, a program always performs operations on numbers, strings, and other values. These values are called literals. There are many different sorts of literals in Java, but in this topic we will focus only on a few of them: the ones that surround us all the time in everyday life.

Let's consider integer numbers, strings, and characters in the format in which they are written in Java.

Integer numbers
These numbers are used to count things in the real world. Also, we will often use them in Java.

Here are several examples of valid integer number literals separated by commas: 0, 1, 2, 10, 11, 100.

If an integer value contains a lot of digits, we can add underscores to divide the digit into blocks for increased readability: 1_000_000. It's more readable than the same value written as 1000000.

Characters
A single character can represent a digit, a letter or another symbol. To write a character we use single quotes as follows: 'A', 'B', 'C', 'x', 'y', 'z', '0', '1', '2', '9'. Character literals can represent symbols of an alphabet, digits from '0' to '9', whitespaces (' '), or other characters or symbols ('$').

Do not confuse characters that represent numbers (e.g. '9'), with numbers themselves (e.g. 9).

A character can't include two and more digits or letters because it represents only a single symbol. The following two examples are incorrect: 'abc', '543'. These literals contain too many characters.

Strings
A string is a sequence of any individual characters. Strings represent text information such as a text of advertising, an address of a web page or a login on a site.

To write a string we use double quotes instead of single ones. Here are some valid examples: "text", "I want to know Java", "123456", "e-mail@gmail.com". A string consisting of a single character like "A" is also a valid string, but do not confuse it with the 'A' character.

As you can see, strings can include letters, digits, whitespaces, and other characters.

Remember
Do not confuse these literals:

123 is an integer number, "123" is a string;
'A' is a character, "A" is a string;
'1' is a character, 1 is an integer number.

In this topic, we will build our very first Java program. Our program will simply print "Hello, World!" on the screen (a tradition by most programmers when learning new languages). Our code may not seem too exciting at first, however, we will learn about the basic template that all Java programs need to follow.
The Hello World program
Here is the Java code of this program:

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
} 
You can type this code in the Your Code section here and then press the execute button. In the result section, you will see:

Hello, World!
If you have already installed Java, you can run the program on your computer. If not, there is no need to install it right now. We will do that later.
The basic terminology
Now that you have seen the result, let's learn some basic terminology and then try to understand this program.

Program – a sequence of instructions (called statements), which are executed one after another in a predictable manner. Sequential flow is the most common and straightforward sequence of statements, in which statements are executed in the order that they are written – from top to bottom in a sequential manner;
Statement – a single action (like print a text) terminated by semi-colon (;);
Block – a group of zero, one or more statements enclosed by a pair of braces {...}; There are two such blocks in the program above.
Method – a sequence of statements that represents a high-level operation (also known as subprogram or procedure).
Syntax – a set of rules that define how a program needs to be written in order to be valid; Java has its own specific syntax that we will learn;
Keyword – a word that has a special meaning in the programming language (public, class, and many others). These words cannot be used as variable names for your own program;
Identifier or name – a word that refers to something in a program (such as a variable or a function name);
Comment – a textual explanation of what the code does. Java comments start with //.
Whitespace – all characters that are not visible (space, tab, newline, etc.).
The Hello World program under a microscope
The Hello World program illustrates the basic elements of Java programs. For now, we will discuss only the most important elements.

1. The public class. It is the basic unit of a program. Every Java program must have at least one class. The definition of a class consists of the class keyword followed by the class name. A class can have any name, such as App, Main, or Program, but it must not start with a digit. A set of braces {...} encloses the body of a class.

public class Main {
    // ...
}
The text after // is just a comment, not a part of the program. We will learn about comments in detail in later topics.

2. The main method. To make the program runnable, we put a method named main inside a class. It is the entry point for a Java program. Again, the braces {...} enclose the body of the method, which contains programming statements.

public static void main(String[] args) {
    // statements go here
}
The keywords public, static, and void will be discussed later, so just remember them for now. The name of this method (main) is predefined and should always be the same. Capitalization matters; if you name your first method like Main, MAIN or something else, the program cannot start.

The element String[] args represents a sequence of arguments passed to the program from the outside world. Don't worry about them right now.

3. Printing "Hello, world!". The body of the method consists of programming statements that determine what the program should do after starting. Our program prints the string "Hello, World!" using the following statement:

System.out.println("Hello, World!"); //  each statement has to end with ;
This is one of the most important things to understand from the Hello World program. We invoke a special method println to display a string followed by a new line on the screen. We will often use this approach to print something of interest to the screen. The text is printed without double quotes.

Important, that "Hello, World!" is not a keyword or an identifier; it is just a text to be printed.
Keywords
As you can see, even a simple Java program consists of many elements, including keywords that are parts of the language. In total, Java provides more than 50 keywords which you will gradually learn on this platform. The full list is here, but do not try to remember them at this moment.

Note, main is outside the given list because it is not a keyword
Conclusion
We have discussed the simplest program you can write in Java. It has a single class with a single main method. Every Java program must have a main method as it is the first to be executed when the program runs. Don't worry about memorizing every single term used in the topic (syntax, statement, block). These terms will reappear in further materials. Do not forget to use the provided Hello World program as a template for your own programs.

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

<!---- Displaying text using println() and print()-----!>

Standard output is a receiver to which a program can send information (text). It is supported by all common operating systems. Java provides a special object System.out to work with the standard output. We will often use it to print something.

The println method displays the passed string followed by a new line on the screen (print-line). As an example, the following code fragment prints four lines.

System.out.println("I ");
System.out.println("know ");
System.out.println("Java ");
System.out.println("well.");
The output:

I
know
Java
well.
All strings were printed as is, without double quotes.

The method allows you to print an empty line when no string is given:

System.out.println("Java is a popular programming language.");
System.out.println(); // prints empty line
System.out.println("It is used all over the world!");
The output:

Java is a popular programming language.

It is used all over the world!
The print method displays the passed value and places the cursor (the position where we display a value) after it. As an example, the code below outputs all strings in a single line.

System.out.print("I ");
System.out.print("know ");
System.out.print("Java ");
System.out.print("well.");
The output:

I know Java well.
Pay attention to the spaces between words. We pass them to methods for printing.

Printing numbers and characters
Both methods println and print allow a program to print not only strings and characters, but also numbers.

Let's print two secret codes.

System.out.print(108);   // printing a number
System.out.print('c');   // printing a character that represents a letter
System.out.print("Q");   // printing a string
System.out.println('3'); // printing a character that represents a digit

System.out.print(22);
System.out.print('E');
System.out.print(8);
System.out.println('1');
It outputs:

108cQ3
22E81
As is the case with strings, none of the characters contain quotes.
<!----- Declaring and initializing-----!>

A variable is a placeholder for storing a value of a particular type: a string, a number, or something else. Every variable has a name (also known as an identifier) to distinguish it from others. Before you start using a variable, you must declare it.

The general form of declaration is the following:

DataType variableName = initialization;
The left part of this statement describes the variable, and the right part describes something that is assigned to it.

The type (or data type) of a variable determines what possible operations can be performed on the variable and which values can be stored in it. Here we use a non-existing data type (DataType) to demonstrate the general form of declaration.
The name (or identifier) distinguishes the variable from others. The name of a variable cannot start with a digit; it usually starts with a letter. Always try to choose meaningful and readable names for variables to make your code easy to understand.
The assignment operator denoted as = is used to assign a single value or a result of an expression to a variable.
The initialization is a value or a result of an expression that is assigned to the variable.
According to this declaration, we can declare a variable of the type String and assign the word "java" to it:

String language = "java";
We can also declare a variable of the type int to store an integer number:

int numberOfApples = 5;

The case in the name of a variable makes a difference: language is not the same as Language.
Variables can store not only strings and numbers, but also characters and other data types which we will learn about later in the next topics.

Accessing the value of a variable
Once a variable has been declared, its value can be accessed and modified using the name. In the example below, we declare a variable and then print it:

String dayOfWeek = "Monday";
System.out.println(dayOfWeek); // Monday
It is also possible to assign a value of one variable to another one:

int one = 1;
int num = one;
System.out.println(num); // 1
One important feature of variables is that they can be changed. You don't need to declare a variable again to change its value; just assign a new value to it using the = operator.

Let's declare a variable named dayOfWeek and print its value before and after changing:

String dayOfWeek = "Monday";
System.out.println(dayOfWeek); // Monday

dayOfWeek = "Tuesday";
System.out.println(dayOfWeek); // Tuesday
There is one restriction for variables: you can only assign a value of the same type as the type of the initial variable. So, the following code is not correct:

int number = 10;
number = 11; // ok
number = "twelve"; // it does not work!
Alternative forms of declaration
There are several alternative forms of declaration which are less commonly used in practice. Here are several of them in particular examples.

Declaring several variables of the same type as a single statement:
String language = "java", version = "8 or newer";
Separating declaration and initialization into statements:
int age; // declaration
age = 35; // initialization 
However, as we have already noted, these forms are rarely used.

Type inference
Since Java 10, you can write var instead of a specific type to force automatic type inference based on the type of assigned value:

var variableName = initialization;
Here are two examples below:

var language = "Java"; // String
var version = 10; // int
This feature can be a bit controversial: on the one hand, it allows your code to be more concise. On the other hand, since it doesn't indicate the type explicitly, it may affect the code readability in a bad way. For now, it's enough to understand the basic idea. We will not use type inference in our theory so that our educational platform is suitable for people who use earlier versions of Java. But if you would like to practice it, you may use type inference in our exercises as they fully support Java 10.

int i = 0, j = 0, k = 0;
String s = "s", str = "str";

Enter the number of declared variables in the code fragment.

For example, if you think that eight variables are here, enter the number:
en este caso son 5 ya que reasignar una variable cuenta como asignarla

<!----- -----!>
Inside a Java program, you can write a special text that will be ignored by the java compiler — known as the comment. Comments allow you to exclude code from the compilation process (disable it) or clarify a piece of code to yourself or other developers. In our materials, we use comments in the theory and practice lessons to explain how and why our code works.

The Java programming language supports three kinds of comments.

End-of-line comments
The java compiler ignores any text from // to the end of the line.

class Program {
    public static void main(String[] args) {
        // The line below will be ignored
        // System.out.println("Hello, World");
        // It prints the string "Hello, Java"
        System.out.println("Hello, Java"); // Here can be any comment
    }
}
In the example above the text after // is ignored by the compiler.

Multi-line comments
The compiler ignores any text from /* and the nearest */. It can be used as multiple and single-line comments.

class Program {
    public static void main(String[] args) {
        /* This is a single-line comment */
        /*  This is an example of
            a multi-line comment */
  }
}
You can use comments inside other comments:

class Program {
    public static void main(String[] args) {
        /*
        System.out.println("Hello"); // print "Hello"
        System.out.println("Java");  // print "Java"
        */
    }
}
The part of the code above is ignored by the compiler because of /* ... */ comments.

Java documentation comments
The compiler ignores any text from /** to */ just like it ignores multi-line comments.

These kinds of comments can be used to automatically generate documentation about your source code by using the javadoc tool. Usually, these comments are placed above declarations of classes, interfaces, methods and so on. Some special labels such as @param or @return are often used for controlling the tool. However, they are optional and we will not deal with them for now. Just don't be surprised in case you see one.

See the example below.

class Program {
    /**
     * The main method accepts an array of string arguments
     *
     * @param args from the command line
     */
    public static void main(String[] args) {
        // do nothing
    }
}
Do not be afraid if you have not understood the documentation comments completely. This will be considered in other topics.

<!---------- ----------!>
There's a question that you bump into when moving from simple single-line programs to more complicated ones: how to write code that is clean and easy to read? This is trickier than it may seem at the beginning, and this is quite important: in real life, programming is a process that involves a lot of people that work together. In fact, you often spend more time reading code than writing it. Even when you're working alone and writing a program "for yourself", after a while, it may become difficult for you to understand your own program if it's badly written.

That is why you need to follow common best practices concerning programming style. This way, other programmers and yourself could read your code easily. Writing good code may help you get your first job and make a good impression on your colleagues.

Good coding style is like correct punctuation: you can manage without it, butitsuremakesthingseasiertoread. – The Tidyverse Style Guide by Hadley Wickham
Java Conventions
A list of recommendations on how to write code for some particular language is usually called coding style guide or style conventions. The conventions help developers standardize and support well-readable code. They are more like recommendations than strict rules, but by following them a programmer creates code that is clean and consistent so that other developers will be happy to work with it.

In most cases, companies and individual developers do not create their own style conventions. There are two generally accepted Java conventions that are used all over the world:

Oracle Code Conventions
Google Style Guide
Sometimes they could be modified or extended by a particular company to meet their needs.

In all our code examples and exercises, we will follow the Oracle Code Conventions and we urge you to do the same while learning here. After completing the course, you can follow any conventions you want. Actually, it doesn't really matter which one to follow, the main challenge is to be consistent across your code.
There is no need to learn all the conventions at once: just remember to open them from time to time after learning some new syntactic concepts. We will provide the information throughout the course when needed.

Now let's look at some of the most basic Java conventions according to Oracle Code Conventions.

The number of spaces
The first convention is to use 4 spaces as the unit of indentation in the whole program code. You have already seen our code examples before and you might note that we used this value there.

Good:

public class NumberOfSpacesExample {

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
Very bad:

public class NumberOfSpacesExample {

  public static void main(String[] args) {
     System.out.println("Hi!");
   System.out.println("I'm a Java program.");
 }
}
As you can see, the second code example looks ugly and requires some effort to be read.

Sometimes tabulation is used to create an indentation. However, tab may correspond to 8 spaces instead of 4 in some IDEs, that is why we recommend you stick to spaces in this course.
The location of curly braces
Some time ago, developers were arguing a lot about where to put opening and closing curly braces in C-like programming languages. The next convention describes what to do in Java:

Put the opening curly brace at the end of the line where the block begins.
Put the closing curly brace at the beginning of the next line.
There are two examples below which illustrate these rules.

Good:

public class NumberOfSpacesExample {

    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
Not that bad, but not Java-way:

public class NumberOfSpacesExample 
{
    public static void main(String[] args) 
    {
        System.out.println("Hi!");
        System.out.println("I'm a Java program.");
    }
}
Here, the second code example doesn't look ugly, but it is just not a Java way. Most of the common conventions follow the first example.

Avoid extra spaces
Sometimes you may add some spaces even if you don't really need them. This will reduce the readability of your code.

Avoid extra spaces within parentheses.
Good:

System.out.println("Hello!");
Bad:

System.out.println( "Hello!" );
Avoid an extra space before an open parenthesis.
Good:

System.out.println("OK");
Bad:

System.out.println ("Shifted braces");
Avoid extra spaces before a semicolon:
Good:

System.out.println("No extra spaces");
Bad:

System.out.println("It has an extra space") ;
The length of a line
The last recommendation concerns the maximum length of a line. Oracle Code Conventions propose avoiding lines longer than 80 characters. Plenty of developers consider this restriction as outdated since modern monitors can easily display longer lines, whereas others would go on following this rule, which is handy, for example, if laptops are used.

Keeping ourselves off this dispute, we will use 80 characters in the course to avoid scrollbars in our examples and web code editor. We recommend that you do the same while learning here, but keep in mind that you can violate this limitation after you start working on a real project or learning elsewhere.

Other popular limit values are 100, 120, and sometimes even 140 characters.

Conclusion
Style guides provide the conventions to help create well-readable and consistent code. For Java, the two most popular ones are Oracle Code Conventions and Google style guide. One of their main objectives is to provide an effective way for developers to work on the code together. Because of that, it is not as important to strictly follow one of the existing style guides as to stay consistent within the project. Later on, you will learn a lot of things about Java and become a skillful programmer, but maintaining the code style will always remain important. Do not worry, though: you do not need to learn all the conventions at once. In all the following topics, we will follow the Oracle Code Conventions and encourage you to do it with us!
<!---------- Why is naming important?---------!>

As you may know, every variable has a name that uniquely identifies it among other variables. Giving a good name to a variable may not be as simple as it seems. Experienced programmers put a lot of care into naming to make their programs easy to understand. It is important because programmers spend a lot of their time getting through the code written by other programmers. If variables have bad names, even your own code will seem unclear to you in a few months.

Always try to give descriptive and concise names to all variables. As a result, any programmer will enjoy your code for a long time.

In addition, there are two sets of rules that restrict the possible names for variables.

Rules for naming variables
Java has some rules for naming variables:

names are case-sensitive;
a name can include Unicode letters, digits, and two special characters ($, _);
a name cannot start with a digit;
a name must not be a keyword (class, static, int are illegal names).
Based on these rules, you may conclude that whitespaces are not allowed in the name of a variable.

It is important not to break these rules; otherwise, the program will not work.
Here are some valid names of variables:

number, $ident, bigValue, _val, abc, k, var
Note that to keep backward compatibility the word var can be used as a variable name even after Java 10 was released.
And here are some invalid ones:

@ab, 1c, !ab, class
Since Java 9 the single character _ is an invalid name for a variable, but _a and __ (double _ ) are legal names.

Naming conventions for variables
Also, there are the following conventions for naming variables:

if a variable name is a single word it should be in lowercase (for instance: number, price);
if a variable name includes multiple words it should be in lowerCamelCase, i.e. the first word should be in lowercase and each word after the first should have its first letter written in uppercase (for instance: numberOfCoins);
variable names should not start with _ and $ characters, although they are allowed;
choose a name that makes sense, e.g. score makes more sense than s, although they are both valid.
These conventions are optional, but it is strongly recommended to follow them. As we mentioned at the beginning of this lesson, they make your code more readable for you and other Java programmers.

<!----------Theory: Scanning the input-----------!>
The standard input is a stream of data going into a program. It is supported by the operating system. By default, the standard input obtains data from the keyboard input but it's possible to redirect it from a file.

Actually, not all programs need to use the standard input. But we will often use it here to help you master your programming skills! The typical way to solve programming problems is the following:

Read data from the standard input (System.in);
Process data to obtain a result;
Output the result to the standard output (System.out).
This type of code challenge can be easily tested by different formats of input data, and for this reason, we will use them a lot.

Reading data with a scanner
The simplest way to obtain data from the standard input is to use the standard class Scanner. It allows a program to read values of different types (string, numbers, etc) from the standard input. In this topic, we will consider reading data from the input.

To use this class you should add the following import statement to the top of your file with the source code.

import java.util.Scanner;
Then you add the following construction after the import:

Scanner scanner = new Scanner(System.in);
With this line, we create an object of Scanner class, that enables us to use its methods. We will learn more about creating objects in other topics. System.in indicates that the program will read text that you type in the standard input. For now, you will always require this line exactly.

There are two ways to read strings with a Scanner class. If your input is an integer number or a single word, you can read the data using next() method. As an example, the following code fragment reads the user’s name and prints hello message:

String name = scanner.next();

System.out.println("Hello, " + name + "!");
For instance, the user's name is James. The output of the program will be the following:

Hello, James!
If the user's input is an integer number like 123, the program will output this number. Note that the next() method will store 123 or another integer number as a string, even if we know that this string consists of a number.

Hello, 123!
There are more specialized methods for reading other types of input values. In this topic, we only consider reading strings.
But, if the user prints a compound name like Erich Maria, the program will output only the first word:

Hello, Erich!
In this case, you'll need another method, a nextLine() method, which reads and outputs the whole line:

Hello, Erich Maria!
As you may notice, the next() method reads one word only and doesn't include any whitespace. By contrast, the nextLine() method includes all space characters it encounters.

Note that in Java whitespace includes not only the space character, but mostly everything that looks empty when printed: a tab, the newline character, and other non-printing characters.
In this article, we are dealing with space and newline characters: technically, we produce a corresponding character when pressing Enter and starting a new line. The term "whitespace" is used to refer to either of them. The more correct term to refer to what we’ve called “word” is token: it is a piece of text surrounded by whitespace. We can say now that the next() method finds and returns the next token, while the nextLine() reads all data till the end of the current line.

Now you can read a whole word and even a whole line invoking these two methods. To invoke both of them correctly, it is important to know the difference between them.

Reading a multiline input
Reading multiline input may still be a bit tricky: you should take into account the position of the cursor and the reading methods behavior.

Let’s investigate this process with an example:

|This is a simple

multiline input,

that is being read
| is a position of the cursor before reading the input.

If we invoke the next() method, the program will read the input till the whitespace, as indicated by the color blue:

This| is a simple

multiline input,

that is being read
After invoking the nextLine() method the program reads the whole line starting from the whitespace. This data is indicated by a green color. The nextLine() places the cursor at the beginning of a new line (if there is such a line in your input):

This is a simple

|multiline input,

that is being read
Then, let's invoke the next() method two times. The first input is indicated by an orange color. You may see that the position of the cursor is right after the word and before the whitespace:

This is a simple

multiline| input,

that is being read
Now we invoke the next() method again. The program outputs the second word in the line without whitespace. It doesn't even matter how many space characters are there, because the next() method will skip the whitespace until it finds the next token.

The second input is indicated by light blue color. As you may see, the position of the cursor is still at the current line right before the new line and after the comma:

This is a simple

multiline input,|

that is being read
Here is a tricky thing about the nextLine() method that also shows a major difference between the next() and the nextLine() methods. As you already know, the program will read input from the position of the cursor till the new line (again, if there is such a line in your input). In this example the cursor is located before the new line: thus, the nextLine() method will return an empty line ("") and place the cursor at the beginning of a new line.

This is a simple

multiline input,

|that is being read
To sum up, let's look at the code as a whole and consider the variables we have just read:

import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        String word1 = scanner.next(); // "This"
        String line1 = scanner.nextLine(); // " is a simple" 
        String word2 = scanner.next(); // "multiline"
        String word3 = scanner.next(); // "input,"
        String line2 = scanner.nextLine(); // "" 
        
    }
}
This example may seem artificial, but it should help you to catch the difference between these two methods. Remember that usually the variables are named in a more expressive way.

Conclusion
We can read data from the standard input with a special Scanner class. The next() and the nextLine() methods will help you to read strings. Both of them are used for getting input, but they act differently. The next() method can read the input only till the whitespace while the nextLine() method reads the input till the end of the whole line.

We recommend you to use the class Scanner when solving programming problems. It is one of the simplest ways to get values from the standard input. More complex ways to read data will be discussed in further topics.

<!--------  Theory: Arithmetic operations ----------!>
In real life, we often perform arithmetic operations. They help us to determine the change from a purchase, calculate the area of a room, count the number of people in a queue, and so on. The same operations are used in programs.

Binary arithmetic operators
The Java programming language provides operators to perform arithmetic operations:

addition +
subtraction -
multiplication *
integer division /
remainder %
The operators are called binary because they take two values as operands.

The following example prints results of addition, subtraction, and multiplication.

System.out.println(13 + 25); // prints 38
System.out.println(20 + 70); // prints 90

System.out.println(70 - 30); // prints 40
System.out.println(30 - 70); // prints -40

System.out.println(21 * 3);  // prints 63
System.out.println(20 * 10); // prints 200
The / operator returns the integer part of the division of two integer numbers, and any fractional part is discarded.

System.out.println(8 / 3); // prints 2
System.out.println(41 / 5); // prints 8
The % in Java is the modulus or remainder operator. It returns the remainder of the division of two numbers. Note, that when the dividend is less than the divisor, the quotient is zero and the remainder equals the dividend. If you still feel uneasy about modulo operation, check out the wiki.

System.out.println(10 % 3) // prints 1, because 10 divided by 3 leaves a remainder of 1
System.out.println(12 % 4) // prints 0, because 12 divided by 4 leaves no remainder
System.out.println(5 % 9) // prints 5, because 5 divided by 9 leaves a remainder of 5
Writing complex expressions
The operations can be combined to write more complex expressions:

System.out.println(1 + 3 * 4 - 2); // prints 11
The calculation order coincides with arithmetic rules. Multiplication has a higher priority level than addition and subtraction, so the operation 3 * 4 is calculated first.

To specify the order of execution we can use parentheses as in the following:

System.out.println((1 + 3) * (4 - 2)); // prints 8
As in arithmetic, parentheses can be nested. You can also use them for clarity.

Unary operators
A unary operator takes a single value as the operand.

The unary plus operator indicates a positive value. It's an optional operator.
System.out.println(+5); // prints 5
The unary minus operator negates a value or an expression.
System.out.println(-8);  // prints -8
System.out.println(-(100 + 4)); // prints -104
They both have a higher level of precedence than the multiplication and division operators.

The precedence order
There is a precedence order of all arithmetic operators, including parentheses. The list below is sorted from the highest to the lowest precedence level.

parentheses
unary plus/minus
multiplication, division
addition, subtraction
<!----------- Theory: Integer types and operations-----------!>
Basic information about integer types
Java provides several types which represent integer numbers including positive, negative and zero. In practice, the most used types are int and long. The first type can store numbers from a smaller range than the second one, but it is often enough (especially, in this topic). You can perform all arithmetic operations (+, -, *, /, %) with variables of integer types.

Let's look at some examples below.

int two = 2;
int ten = 10;

int twelve = two + ten; // 12
int eight = ten - two;  // 8
int twenty = two * ten; // 20
int five = ten / two;   // 5
int zero = ten % two;   // 0, no remainder

int minusTwo = -two; // -2
This code demonstrates how to assign values to int variables as well as how to perform arithmetic operations with them. We hope that you already understand all operations well.

To improve the readability of your code, the special underscore character _ can be used to separate groups of digits within a number.

int million = 1_000_000;
You may also print a value of an int variable:

int number = 100;
System.out.println(number); // 100
All arithmetic operations work with the long type as well.

long one = 1L;
long twentyTwo = 22L; // L or l is a literal for longs
long bigNumber = 100_000_000_000L;

long result = bigNumber + twentyTwo - one; 
System.out.println(result); // 100000000021
If a number ends with the letter L or l it is considered as long, otherwise, it is int. We recommended you to use the uppercase letter L because the lower case letter l is very similar to the digit 1.

Note, use long's numbers only if it is really necessary (to process big values)
The forms of the assignment operator
Suppose, you want to add some value to a variable. You may write something like this:

int n = 10;
n = n + 4; // 14
The assignment operator = has several forms which combine it with an operation to avoid repeating the variable twice:

int n = 10;
n += 4; // 14
As you may see, this form looks more concise. There are a few other possible forms *=, /=, %= and some others.

Reading numbers from the standard input
As a rule, to solve a problem you need to read some data from the outside world, process it, and output the result. The following program reads two numbers from the standard input, adds them, and prints the sum.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println(sum);
    }
}
This simple code uses Scanner to read data.

If we know that the input numbers can be quite large, we can read long's instead of int's:

long a = scanner.nextLong();
long b = scanner.nextLong();

long sum = a + b;
No more lines need to be changed in this code.

Now you have enough knowledge to write useful programs that process data. You may use the template above for solving code challenges in this lesson. Try to give meaningful names to variables when solving problems.

Para obtener el siguiente numero par al numero ingresado por teclado
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a += 2 - (a % 2);
        System.out.println(a);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        System.out.println(input1 + 2 - input1 % 2);
    }
}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int given = scanner.nextInt();
        if (0 == given % 2) {
            System.out.println(given + 2);
        } else {
            System.out.println(given + 1);
        }
    }
}

<!--------- Theory: Units of information ----------!>
Throughout life, we always find something to measure: the amount of food we need to cook for the family, the length and width of that couch you want to put in the room, our weight and height. The latter is especially exciting: it's really cool to learn that in just one year you grew by a full 2 inches!

Each measurement requires an instrument and its own unit of measurement. For example, bodyweight is measured with scales in kilograms (or pounds), time is measured with clocks in seconds, etc. But how does one measure information?

Bit: the smallest unit of information
The information entered into the computer should be specific and unambiguous. For a long time, people have used ciphers. The simplest and most convenient of them were digital. Any information from the names of flowers to the days of the week can be presented in the form of numbers. When processed with a conventional computer, the data is encoded by numbers. They are represented by the electrical signals that the computer works with. For the convenience of distinguishing, signals of two levels are used in classical electronic computers. One of them corresponds to the number 1, and the other to 0. Any letter, sound, or image on a computer is represented by a set of numbers. The numbers 1 and 0 are called binary. These are the symbols that make up the language understood and used by the computer. Any information on the computer is represented by binary digits: 1, meaning "there is a signal" and 0, meaning "no signal".

The smallest unit of information is the bit (b).
Each digit of the machine binary code carries the amount of information equal to one bit. It can take only one of two values: either 1 or 0. It is very inconvenient to measure information in bits because the numbers come out too big.

Byte: a sequence of eight bits
Since people do not consider the mass of ships in grams, larger and hence more convenient units were invented for measuring information as well.

The processing of information takes place in the processor. This is a device that can work with several bits at once (8, 16, 32, 64, ...). The more bits of information are processed simultaneously, the faster the computer operation is. The first computers processed 8 bits of information simultaneously, so we needed a new unit of measurement which was called a byte (B) that means 8 bits.

Bit marks are easily confused with byte marks. Note that the abbreviations for bit numbers uses the lowercase letter "b", while bytes are denoted using the capital "B".
Large units of information
There are larger units of information since modern computers process huge amounts of information significantly exceeding bytes.

The computer industry has historically used the units kilobyte, megabyte, and gigabyte in at least two slightly different measurement systems which are slightly contradictory to each other.

The first one is a decimal-based system, which uses bytes in the powers of ten: kilobyte (10^3 bytes), megabyte (10^6 bytes), and gigabyte (10^9 bytes) and so on. These units are used by the International System of Units (SI).
The second one is a binary-based system which uses bytes in the powers of two: kilobyte (2^10 bytes), megabyte (2^20 bytes), gigabyte (2^30 bytes) and so on. This system was actively used to describe computer memory.
To resolve this confusion, the International Electrotechnical Commission (IEC) suggested to use prefixes kilo, mega and giga only for the decimal-based system and to use new prefixes kibi, mebi, gibi for the binary-based system. Here bi means binary: kibibyte is kilo binary byte.

Here is a table with commonly used units of information according to the modern international standards.

SI metric	Symbol	Powers of ten	IEC metric	Symbol	Powers of two
Kilobyte	kB	10^3 B (1000 B)	Kibibyte	KiB	2^10 B (or 1024 B)
Megabyte	MB	10^6 B (1000 kB)	Mebibyte	MiB	2^20 B (or 1024 KiB)
Gigabyte	GB	10^9 B (1000 MB)	Gibibyte	GiB	2^30 B (or 1024 MiB)
Terabyte	TB	10^12 B (1000 GB)	Tebibyte	TiB	2^40 B (or 1024 GiB)
Petabyte	PB	10^15 B (1000 TB)	Pebibyte	PiB	2^50 B (or 1024 TiB)
Of course, not all units of measurement are listed here. We hope, this classification will not cause you any difficulties. It is good that a byte is always 8 bit :) But even this did not come immediately.

Note that some people and organizations still prefer kilo, mega, and giga to describe powers of two. In this course, we follow the recommendations of the IEC and use modern prefixes kibi, mebi, and gibi.
Measurement units conversion
To strengthen your newly obtained knowledge, let's look at the solution of a rather typical problem where you need to convert 1 GiB to KiB. When we convert bigger units into smaller ones, we need to resort to an arithmetic operation called multiplication:

1 GiB = 1 * 1024 * 1024 = 1048576 KiB
Accordingly, when you need to convert small units into big ones, you use division. Let's try to convert 16384 bits to KiB:

16384 bits = (16384 / 8) / 1024 = 2 KiB
If you want to convert 1 GB to kB, you should multiply the number by a thousand twice:

1 GB = 1 * 1000 * 1000 = 1000000 kB
Congratulations, now you have studied one of the basic topics of computer science and are ready to storm new dizzying heights of knowledge.

<!----------- Theory: Sizes and ranges-------------!>
In this lesson, we will discuss the classification and properties of primitive types provided by Java. Maybe you already know a few of them. The basic types can be separated into several groups according to meaning. Types from the same group can be operated in the same way, but have different sizes and, as consequence, represent different ranges of values.

You do not need to know all this information by heart, because it is easy to find it in the documentation or simply Google it. But a common understanding of these concepts is important in job interviews and practice.

Numbers
Java provides several types for integers and fractional numbers. These types are often used in arithmetic expressions.

Integer numbers (0, 1, 2, ...) are represented by the following four types: long,int,short,byte(from the largest to the smallest). These types have different sizes and may represent different ranges of values. The range of an integer type is calculated as −(2n−1) to (2n−1)−1, where n is the number of bits. The range includes 0, which is the reason for subtracting 1 from the upper bound.

byte: size 8 bits (1 byte), range from -128 to 127
short: size 16 bits (2 bytes), range from -32768 to 32767
int: size 32 bits (4 bytes), range from −(231) to (231)−1
long: size 64 bits (8 bytes), range from −(263) to (263)−1
The sizes of types are always the same. They do not depend on the operating system or hardware and cannot be changed.

The most commonly used integer types are int and long. Try to use int if it is enough for your purposes. Otherwise, use long.

int one = 1;
long million = 1_000_000L;
Floating-point types represent numbers with fractional parts. Java has two such types: double (64 bits) and float (32 bits). These types can store only a limited number of significant decimal digits (~6-7 for float and ~14-16 for double). Usually, you will use the double type in practice.

double pi = 3.1415;
float e = 2.71828f;
Note, that when we declare and initialize a float variable, we should mark the assigned value with the special letter f. It is often a good practice to mark a long value with L as well. We will learn more about numeric literals later.
Characters
Java has a type named char to represent letters (uppercase and lowercase), digits, and other symbols. Each character is just a single letter enclosed in single quotes. This type has the same size as the short type (2 bytes = 16 bits).

char lowerCaseLetter = 'a';
char upperCaseLetter = 'Q';
char dollar = '$';
Characters represent symbols from many alphabets including hieroglyphs, as well as some special symbols which will be studied in the following lessons.

Booleans
Java provides a type called boolean, which can store only two values: true and false. It represents only one bit of information, but its size is not precisely defined.

boolean enabled = true;
boolean bugFound = false;
We will often use this type in conditionals and as a result of comparing two numbers.

As a recap, we note that the types used most often are int, long, boolean, char, and double. Also, remember that long is the widest integer type. Knowledge of sizes and ranges of data types may help you with interviews.
Choose the correct formula for calculating the upper (max) possible value of an int variable.

a) 2^(n−1) − 1, where n is the number of bytes
b) 2^(n−1) + 1, where n is the number of bytes
c) 2^n + 1, where n is the number of bytes
d) 2^(n−1) − 1, where n is the number of bits//correcta
e) 2^(n−1) + 1, where n is the number of bits
f) 2^n + 1, where n is the number of bits

<!-------- Theory: Type casting   --------!>
Suppose, you need to assign a value of one type to a variable of another type. To do that, your program needs to cast the source type to the target type. Java provides two kinds of casting for primitive types: implicit and explicit. The first one is performed automatically by the java compiler when it is possible, and the second one – only by a programmer.

Implicit casting
The compiler automatically performs implicit casting when the target type is wider than the source type. The picture below illustrates the direction of this casting. Any value of a given type can be assigned to the one on the right implicitly.

                    char
//byte ---> short ---> int --->long --->float --->double
Boolean -> Char -> Byte -> Short -> Int -> Long -> Float -> Double

*/The direction of implicit primitive type castings

Normally, there is no loss of information when the target type is wider than the source type, for example when we cast int to long. But it is not possible to automatically cast in the backward order (e.g. from long to int or from double to float).

Note, there is no boolean type on the picture above, because it is impossible to cast this type to any other and vice versa.
Here are several examples of implicit castings:

from int to long:
int num = 100;
long bigNum = num; // 100L
from long to double:
long bigNum = 100_000_000L;
double bigFraction = bigNum; // 100000000.0
from short to int:
short shortNum = 100;
int num = shortNum; // 100
from char to int:
char ch = '?';
int code = ch; // 63
In some cases, implicit type casting may be a bit lossy. When we convert an int to float, or a long to float or to double, we may lose some less significant bits of the value, which will result in a loss of precision. However, the result of this conversion will be a correctly rounded version of the integer value, which will be in the overall range of the target type. To understand that, check out the example:

long bigLong =  1_200_000_002L;
float bigFloat = bigLong; // 1.2E9 (= 1_200_000_000)
When we convert a char to an int in Java we actually get the ASCII value for a given character. ASCII value is an integer representation of English alphabet letters (both uppercase and lowercase), digits, and other symbols. Here you can find some of the standard symbols in ASCII.

char character = 'a';
char upperCase = 'A';

int ascii1 = character; // this is 97
int ascii2 = upperCase; // this is 65
Strictly speaking, Java uses Unicode Character Representations (UTF-16), which is a superset of ASCII and includes a by far larger set of symbols. However, the numbers 0–127 have the same values in ASCII and Unicode.
As you can see, implicit casting works absolutely transparently.

Explicit casting
The considered implicit casting does not work when the target type is narrower than the source type. But programmers can apply explicit casting to a source type to get another type they want. It may lose information about the overall magnitude of a numeric value and may also lose precision.

To perform explicit casting, a programmer must write the target type in parentheses before the source.

(targetType) source
Any possible casting not presented in the picture above needs such an approach, for example double to int, and long to char.

Examples:

double d = 2.00003;

// it loses the fractional part
long l =  (long) d; // 2

// requires explicit casting because long is wider than int
int i = (int) l; // 2 

// requires explicit casting because the result is long (indicated by L)
int val = (int) (3 + 2L); // 5

// casting from a long literal to char
char ch = (char) 55L; // '7'
However, the explicit casting may truncate the value, because long and double can store a much larger number than int.

long bigNum = 100_000_000_000_000L;
int n = (int) bigNum; // 276447232
Oops! The value has been truncated. This problem is known as type overflow. The same problem may occur when casting int to short or byte. Let's see what happens exactly.

As you remember, in Java long is a 64-bit number, while int is 32-bit. When converting long to int the program just takes the last 32 bits to represent the new number. If the long contains a number less than or equal to Integer.MAX_VALUE you can convert it by casting without losing information. Otherwise, the result will be quite meaningless, although determined. That is why you shouldn't perform casting from a larger type to a smaller type unless you are absolutely sure that it is necessary, and that truncation will not interfere with your program.

Explicit casting also works when implicit casting is enough.

int num = 10;
long bigNum = (long) num; // redundant casting
But this is redundant and should not be used to avoid unnecessary constructs in your code.

Note, that despite the power of explicit casting, it is still impossible to cast something to and from the boolean type.
Conclusion
If you want to cast a narrower type to a wider type, you do not need to write anything, the Java compiler will do it automatically for you. But if you want the opposite, specify the required type in parentheses following the assignment operator. Keep in mind, the boolean type cannot be cast to another type and vice versa.
float f = 20d + 20.02f; // 1 CAST AS FLOAT
long n = 10 + 2L;       // 2
byte b = n + 5;         // 3 CAST AS BYTE

long lo = Integer.MAX_VALUE; // (1)
int i = lo; // (2)   CASTEAR
char ch = i; // (3)  CASTEAR
double d = ch; // (4)
float f = d; // (5)  CASTEAR
CASTEO EXPLICITO REQUERIDO
int q = 'q';  // 1
char ch2 = q; // 2  SI
short s = 1;  // 3
char ch3 = s; // 4  SI
<----------STAGE 1 COMPLETADO ------------>
Description
Our program should be able to display the grid at all stages of the game. Now we’re going to write a program that allows the user to enter a string representing the game state and correctly prints the 3x3 game grid based on this input. We’ll also add some boundaries around the game grid.

Objectives
In this stage, you will write a program that:

Reads a string of 9 symbols from the input and displays them to the user in a 3x3 grid. The grid can contain only X, O and _ symbols.
Outputs a line of dashes --------- above and below the grid, adds a pipe | symbol to the beginning and end of each line of the grid, and adds a space between all characters in the grid.
Examples
Examples below show how your output should look.
Notice that after Enter cells: comes the user input.

Example 1:

Enter cells: O_OXXO_XX
---------
| O _ O |
| X X O |
| _ X X |
---------
Example 2:

Enter cells: OXO__X_OX
---------
| O X O |
| _ _ X |
| _ O X |
---------
Example 3:

Enter cells: _XO__X___
---------
| _ X O |
| _ _ X |
| _ _ _ |
---------
<!------ Theory: Increment and decrement---------!>
In this topic, we will discuss one of the most famous operations in programming: increment. It is used in many programming languages including Java to increase a variable by one. Fun fact: this operation is used in the name of C++, and signifies the evolutionary nature of the changes from C.

Using ++ and -- in Java
Java has two opposite operations called increment (++) and decrement (--) to increase/decrease the value of a variable by one.

int n = 10;
n++; // 11
n--; // 10
The code above is actually the same as below.

int n = 10;
n += 1; // 11
n -= 1; // 10
Prefix and postfix forms
Both increment and decrement operators have two forms which are very important when using the result in the current statement:

prefix (++n or --n) increases/decreases the value of a variable before it is used;
postfix (n++ or n--) increases/decreases the value of a variable after it is used.
The following examples demonstrate both forms of increment.

Prefix increment:

int a = 4;
int b = ++a;

System.out.println(a); // 5
System.out.println(b); // 5
In this case, the value of a has been incremented and then assigned to b. So, b is 5.

Postfix increment:

int a = 4;
int b = a++;

System.out.println(a); // 5
System.out.println(b); // 4
In Java, the postfix operator has higher precedence than the assignment operator. However, it returns the original value of a, not the incremented one. That's why when we assign a++ to b, we actually assign 4, while a itself has already been incremented. So, b is 4 and a is 5.

If that's still not clear enough for you, take a look at the code:

int a = 4;
System.out.println(a++ + a); // this is 9
We hope that now you fully understand increment and decrement and their prefix and postfix forms.
el preincremento agrega primero y luego asigna la variable. El postincremento asigna el valor y luego aumenta el valor
int a = 4;
int b = a++;

System.out.println(a); // 5
System.out.println(b); // 4
RESPUESTA A:
int a = -1;
System.out.println(1 - a++);    2

int a = 2;
int b = 3;
int c = ++a + b--;  6

int n = 10;
n--;
System.out.println(n++); 9

<!------- Theory: Characters ---------!>
The char type is used to represent letters (both uppercase and lowercase), digits, and other symbols. Each character is just a symbol enclosed in single quotes.

char lowerCaseLetter = 'a';
char upperCaseLetter = 'Q';
char number = '1';
char space = ' ';
char dollar = '$';
This type can represent all characters in all languages as well as some special and computer symbols. It corresponds to the Unicode (UTF-16) format. Unicode is a computer encoding methodology that assigns a unique number for every character. It doesn't matter what language, or computer platform it's on. This is important in a global, networked world, and for computer systems that must accommodate multiple languages and special characters. Unicode truly unifies all of these into a single standard.

Initializing characters with codes
A character can be also created using its hexadecimal code in the Unicode table. The code starts with \u.

char ch = '\u0040'; // it represents '@'
System.out.println(ch); // @
Although we use a sequence of characters to represent such code, the code represents exactly one character.

As an example, Latin capital letters have hexadecimal codes from '\u0041' to '\u005A', and Latin small letters have codes from '\u0061' to '\u007A'.

The char type has a minimum value encoded as '\u0000' and the maximum value encoded as '\uffff'.

It is also possible to initialize a char with a positive integer number.

char ch = 64;
System.out.println(ch); // @
The number 64 just corresponds to the Unicode hexadecimal code '\u0040'.

Any char variable may be considered as an unsigned integer value in the range from 0 to 65535.

Retrieving subsequent characters
There are two operators for adding (+) and subtracting (-) integer numbers in order to get the next and previous character according to the Unicode order.

char ch = 'b';
ch += 1; // 'c'
ch -= 2; // 'a'
It is also possible adding and subtracting one character to / from another one.

char ch = 'b';
ch += 'a';
ch -= 'b';
System.out.println(ch); // prints 'a' without quotes
Actually, these operations manipulate with codes of characters, 'b' has the next code after 'a'.

It is possible to use increment (++) and decrement (--) operators in prefix and postfix forms.

char ch = 'A';
ch += 10;
System.out.println(ch);   // 'K'
System.out.println(++ch); // 'L'
System.out.println(++ch); // 'M'
System.out.println(--ch); // 'L'
Escape sequences
There are some special characters starting with backslash \ which are known as the escape or control sequences. They do not have corresponding symbols and cannot be found on a keyboard. To represent such characters we use a pair of regular symbols. In a program, this pair will be considered as exactly one character with the appropriate code.

'\n' is the newline character;
'\t' is the tab character;
'\r' is the carriage return character;
'\\' is the backslash character itself;
'\'' is the single quote mark;
'\"' is the double quote mark.
Here are several examples:

System.out.print('\t'); // makes a tab
System.out.print('a');  // prints 'a'
System.out.print('\n'); // goes to the new line
System.out.print('c');  // prints 'c'
This code prints:

  a
c
There is also a character to represent a single space ' '. It is just a regular character, not an escape sequence.

char c = '1' + '3';
System.out.println(c); 4

int z = 'z'; 
char mystery = z - 10; 
System.out.println(mystery); COMPILE ERROR

char ch = '\u0031' + '\u0035';
System.out.println(ch); F

<!----- Theory: Calling a method ------!>
You may remember that a method is a sequence of statements that can be invoked or referred to by its name. Nothing special, huh? But what if we tell you that you can use it in a program anytime you need and anywhere you want just by simply invoking it with one line of code? Hope that we caught your attention now!

To get started, we will call some method:

getVolume(a, b, h);
Here, getVolume is the name of the method that, for example, calculates a volume of some geometric shape, and the variables a, b and h are its parameters. Technically, the parameter of a method is some value that is used inside the method. The combination of the name and method's parameters in parentheses is the way we call or invoke the method. Let's focus on it in more detail.

Name of the method
Each method has a name that is used to call it. Generally, it reflects what the method does – prints, finds, calculates, provides you with some information.

The Java compiler requires a method name to be a legal identifier. The rules for legal identifiers are the following:

identifiers are case-sensitive;
an identifier can include Unicode letters, digits, underscore _ or currency characters, such as $;
an identifier can't start with a digit;
identifiers must not be a keyword.
In addition, there is a naming convention that restricts possible method names. It's optional but desired for developers. By convention, a one-word name should be a verb in lowercase: sum, multiply, or round.

If a method has a multi-word name, the first letter of the second and the following words should be capitalized: getValue, calculateNumberOfOranges, or findLetter.

OK, now we know how methods are named. Let's talk about how we actually call them!

Calling a method
If you want to call (or invoke) a method in your program, you should write its name and pass the values of its parameters in parentheses. Here's how it can be done:

printNumber(7); // this method prints 7

convertDoubleToInt(1.25) // this method converts double value to int

findUserByName("Kate"); // this method finds a user whose name is Kate
Let's take a look at the findUserByName example.

Here we pass a String value with a name to make the findUserByName do its job. To call a method from outside the class it belongs to you need to indicate a class as a prefix. Check these methods:

Math.round(79.378); // method with Math class name
Character.isLetter('a'); // method with Character class name
Let's try to perform a small task by invoking a method:

double weight = 63.85;
weight = Math.round(weight); // now weight equals 64.0
Here, we have methods that take parameters, but what if we tell you that some methods don't accept parameters at all? In that case, just leave the parentheses empty.

Some methods are called in a slightly different way. Take a look:

// this is how you call an instance method

String name = new String("Anya"); // created an instance (1)
name = name.toLowerCase() // anya (2)
Methods like this require an object of a certain class to be invoked. Before we called the toLowerCase() method, we created an object of the String class called name, since the method in question deals with strings. Now we can call the method for this particular instance (2), which results in decapitalizing all the letters from our string.

As you see, this method requires an instance to be created before it can be called, that's why it is known as an instance method. We will talk about this type of method later.

Built-in methods
Why do you need to rewrite algorithms that have already been written? Of course, we're not talking about some special cases like educational tasks. Still, it is more efficient to use pre-defined methods that are always available to the user. That is why there are two types of methods in Java: built-in and user-defined methods.

Built-in methods belong to the Standard Java library. Now there are a lot of built-in methods that convert or compare values, round doubles, find the maximum or the minimum value, and do a lot of useful operations. We've already dealt with the round(), isLetter(), compareTo(), hasNext() methods, but the number of built-in methods is huge and constantly growing. You can find the method you need in the Oracle documentation. For example, check out the link to the Math library.

In contrast to built-in methods, user-defined methods are created by the programmer. It is a common practice to create a customized subprogram for a specific purpose. You may create your own method and even put it in your own class. Later on, we will learn why it is a good practice to use user-defined methods and how to actually create them.

Conclusion
Generally, a method is a necessary tool for a programmer who is aiming for a neat and reusable code style. With the help of methods, you can perform any specific task you need. They make the program look more readable, and you don't need to repeat routine code lines over and over. Some tasks are wrapped in special built-in methods that are parts of the standard Java library. Also, there are user-defined methods that are created by the programmer. We will discuss these methods in other topics.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        Scanner sc = new Scanner(System.in);
        
        countAreaOfParallelogram(sc.nextInt(), sc.nextInt());
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aa = scanner.nextInt();
        int bb = scanner.nextInt();
        countAreaOfParallelogram(aa, bb);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        callMeAwesome();
    }

    // Do not change code below
    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}

<!---------- Theory: Primitive and reference types ---------------!>
In Java, all data types are separated into two groups: primitive types and reference types.

Java provides only eight primitive types. They are built-in in the language syntax as keywords. The names of all primitive types are lowercase. The most commonly used type is int which represents an integer number.

int num = 100;
The number of reference types is huge and constantly growing. A programmer can even create their own type and use it like standard types. The most frequently used reference types are String, Scanner and arrays. Remember that Java, like most programming languages, is case sensitive.
In this topic, we will focus on String, which is a common example of the reference type.

The new keyword
In most cases, an object of a reference type can be created using the new keyword. When we use the new keyword, the memory is allocated for the object we create. That is called instantiation of the object because we create an instance of it. Then we initialize the variable by assigning some value to it. Often, as in our example, it is done with one line.

String language = new String("java"); 
//instantiation of String and initialization with "java"
You can also use a literal for strings:

String language = "java";
The first approach with the keyword new is common for reference types, while the second is only string-specific. Both approaches give us the same result for strings but they have some technical differences which we will not consider here.

The main difference
The basic difference between primitive and reference types is that a variable of a primitive type stores the actual values, whereas a variable of a reference type stores an address in memory (reference) where the data is located. The data can be presented as a complex structure that includes other data types as their parts.

The following picture simply demonstrates this difference. There are two main memory spaces: stack and heap. All values of primitive types are stored in stack memory, but variables of reference types store addresses of objects located in heap memory.



We will not consider stack and heap in detail here. Just remember this difference between primitive and reference types.

Assignment
The way to store data also affects the mechanism to assign the value of a variable to another variable:

primitive types: the value is just copied;
reference types: the address to the value is copied (the data is shared between several variables).
Here is a snippet of code and a picture that demonstrates this.

int a = 100;
int b = a; // 100 is copied to b

String language = new String("java");
String java = language;
The variable b has a copy of the value stored in the variable a. But the variables language and java reference the same value, rather than copying it. The picture below clearly demonstrates the difference.



Just remember, when assigning one value of a reference variable to another, we just make a copy of a reference rather than the value itself.

Comparisons
Comparing reference types using == and != is not the same as comparing primitive types. Actually, when you are comparing two variables of the String type, it compares references (addresses) rather than actual values.

The following code demonstrates it:

String s1 = new String("java");
String s2 = new String("java");
String s3 = s2;

System.out.println(s1 == s2); // false
System.out.println(s2 == s3); // true
The picture below demonstrates this effect:



So, you should not use comparison operators when you want to compare the values. The correct way to compare content is to invoke the special method equals.

String s1 = new String("java");
String s2 = new String("java");
String s3 = s2;

System.out.println(s1.equals(s2)); // true
System.out.println(s2.equals(s3)); // true
The null type
Unlike primitive types, a variable of a reference type can refer to a special null value that represents the fact that it is not initialized yet or doesn't have a value.

String str = null;
System.out.println(str); // null
str = "hello";
System.out.println(str); // hello
The following statement with a primitive type won't compile.

int n = null; // it won't compile
Unfortunately, the frequent use of the null value can easily lead to errors in the program and complicate the code. Try to avoid null whenever it is possible, only use it if you really need it.

<!-------Theory: Array --------!>
Introduction to arrays
When you need to process multiple objects of the same type, you can save them in an array and then process them together as a single unit. It is a very convenient approach if you do not know how many objects the program will process during runtime.

You may consider an array as a collection of elements of the same type. All elements are stored in the memory sequentially.

The collection provides one name for its elements. The possible number of elements to be stored is established when the array is created and cannot be changed. But a stored element can be modified at any time.

The picture below illustrates an array of five floating-point numbers. Each element has an integer index (0-4) to be accessed.



An array of five floating-point elements

The first element has the index 0, the last element has the index equal to array size – 1.
In Java, an array has the following important features:

an array is a reference type;
all array elements are stored in the memory sequentially;
each element of the array is accessed by its numerical index, the first element has the index 0;
the last element is accessed by the index equal to array size – 1;
it is possible to create an array to store elements of any type.
Declaration, instantiation, initialization
To create an array filled with elements we should:

declare a variable of an array type (declaration);
create an instance of the array object (instantiation);
initialize the array by some values (initialization).
When we declare a variable, we define its type and name. Instantiation happens when memory is allocated for this object. Initializing the array object means that we put certain values of the array object into the memory of our program.

To declare an array we must use two special characters [ ] after the name of the type of elements in the array:

int[] array; // declaration form 1
or after the name of an array variable:

int array[]; // declaration form 2: less used in practice
Next, we will use the first form of declaration because it is mostly used in practice.

Creating an array with specified elements
Java provides several ways to create an array with specified elements.

The simplest way to instantiate and initialize an array is to enumerate all its elements:

int[] numbers = { 1, 2, 3, 4 }; // instantiating and initializing an array of 1, 2, 3, 4
Another way is to initialize an array using variables:

int a = 1, b = 2, c = 3, d = 4;
int[] numbers = { a, b, c, d }; // instantiating and initializing an array of 1, 2, 3, 4
In this case, we should have all the elements at the moment of the array creation.

Creating an array using the keyword "new"
The most general way to create an array is to use the special keyword new and specify the necessary number of elements:

int n = ...; // n is a length of an array
int[] numbers = new int[n];
This form is useful when the number of elements is known before starting the program. When we create an instance of the array object with indicated length like [n] or [5] and don't enumerate its elements explicitly, the array is initialized with default values of its type.

Now, the array has n elements. Each element is equal to zero (the default value of the type int). Next, we should make an explicit initialization of elements.

The size of an array cannot be greater than Integer.MAX_VALUE. Actually, it is even slightly smaller than this value.
It's possible to separate declaration and instantiation in two lines:

int[] numbers; // declaration
numbers = new int[n]; // instantiation and initialization with default values
Also, we can write the keyword new and enumerate all elements of an array:

float[] floatNumbers; // declaration 
floatNumbers = new float[] { 1.02f, 0.03f, 4f }; // instantiation and initialization
The length of an array
To obtain the length of an existing array, access the special property arrayName.length. Here is an example:

int[] array = { 1, 2, 3, 4 }; // an array of numbers
        
int length = array.length; // number of elements of the array
        
System.out.println(length); // 4
Accessing elements
The values of elements of an array can be changed. You can use the index to set a value of the array or to get a value from it.

Set the value by the index:

array[index] = val;
Get the value by the index:

val = array[index];
Indexes of an array have numbers from 0 to length – 1 inclusive.

Let's see an example.

int[] numbers = new int[3]; // numbers: [0, 0, 0]
numbers[0] = 1; // numbers: [1, 0, 0]
numbers[1] = 2; // numbers: [1, 2, 0]
numbers[2] = numbers[0] + numbers[1]; // numbers: [1, 2, 3]
This code works as follows:

In the first line, the array of integers named numbers with three elements in it is created. It is initialized with default values, which is 0 for the int type.
In the second line, the value "1" is assigned to the very first element of the array by its index (do not forget, the first element has the index 0).
In the third line, the value "2" is assigned to the second element of the array by its index (numbers[1] is the second element).
In the last line, the sum of the first two elements is assigned to the third element by its index.
If we try to access a non-existing element by an index then a runtime exception occurs.
For instance, let's try to get the fourth element (with index 3) of the considered array numbers.

int elem = numbers[3];
The program throws ArrayIndexOutOfBoundsException.

Be careful while indexing elements of an array.

The utility class Arrays
If you need to process arrays, you can import and use standard methods grouped in the utility class Arrays.

convert an array to string using Arrays.toString(array) and then print it:
byte[] famousNumbers = { 0, 1, 2, 4, 8, 16, 32, 64 };
String arrayAsString = Arrays.toString(famousNumbers); // [0, 1, 2, 4, 8, 16, 32, 64]
System.out.println(arrayAsString);
sorting a whole array or a part of it using Arrays.sort(array):
long[] bigNumbers = { 200000000L, 400000000L, 100000000L, 300000000L }; // it's unsorted

Arrays.sort(bigNumbers); // sorting whole array
 
System.out.println(Arrays.toString(bigNumbers)); // [100000000, 200000000, 300000000, 400000000]
comparing arrays: two arrays are equal if they contain the same elements in the same order:
int[] numbers1 = { 1, 2, 5, 8 };
int[] numbers2 = { 1, 2, 5 };
int[] numbers3 = { 1, 2, 5, 8 };

System.out.println(Arrays.equals(numbers1, numbers2)); // it prints "false"
System.out.println(Arrays.equals(numbers1, numbers3)); // it prints "true"
filling a whole array or a part of it by some values:
int size = 10;
char[] characters = new char[size];

// It takes an array, start index, end index (exclusive) and the value for filling the array
Arrays.fill(characters, 0, size / 2, 'A'); 
Arrays.fill(characters, size / 2, size, 'B');

System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]
Of course, the Arrays class contains a lot of other useful methods, including array copying, searching in arrays, and so on. For details see here.

int numbers[] = { 1, 2, 3, 4, 5 };

Arrays.fill(numbers, 1, 5, 10);

System.out.println(Arrays.toString(numbers))  [1, 10, 10, 10, 10]
<!-------- Theory: String ---------!>
The String type
String is a reference type consisting of characters. It is one of the most widely used types in Java. Here is an example of a string: "Hello, Java". This string is a sequence of 11 characters, including one space.

This type has some features:

immutable type: it's impossible to change a character in a string;
it has methods for getting individual characters and extracting substrings;
individual characters can be accessed by indexes, the first character has the index 0, the last one – the length of the string – 1;
non-primitive type.
Creating strings
A string literal is surrounded by a pair of double quotes, for instance:

String simpleString = "It is a simple string"; // a simple string
System.out.println(simpleString);  // it prints "It is a simple string"

String anotherString = "This is\na multiple\nstring"; // a string with escape sequences
System.out.println(anotherString); // it prints the result in several lines
A string can represent a long character sequence (text). A string can have one or zero characters.

String strangeText = "aaaaaaaaaaaassssssssssss gggggggggggggggggggg ddddddddddd qqqqqq ffff";

String emptyString = "";

String s = "s"; // a string consisting of one character
A string can be null. It means no value assigned.

String nullString = null; // it is null
Another way to create a variable of String is by using the keyword new.

String str = new String("my-string"); // it creates an object and assigns it to the variable
Get the length and characters of a string
Any string has two useful methods:

length() returns the number of characters in the string;

charAt(int index) returns a character by its index;
Here is an example:

String s = "Hi, all";

int len = s.length(); // the len is 7

char theFirstChar = s.charAt(0);  // 'H' has the index 0

char theFifthChar = s.charAt(4); // 'a' has the index 4

char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6
You can easily get a character of a string by the index, but you can't change characters because strings are immutable in Java.
Useful methods of strings
The standard library of Java provides a lot of useful methods for processing strings:

isEmpty() returns true if the string is empty, otherwise – false;
toUpperCase() returns a new string in uppercase;
toLowerCase() returns a new string in lowercase;
startsWith(prefix) returns true if the string starts with the given string prefix, otherwise, false;
endsWith(suffix) returns true if the string ends with the given string suffix, otherwise, false.
contains(...) returns true if the string contains the given string or character;
substring(beginIndex, endIndex) returns a substring of the string in the range: beginIndex, endIndex - 1;
replace(old, new) returns a new string obtained by replacing all occurrences of old with new that can be chars or strings.
trim() returns a copy of the string obtained by omitting the leading and trailing whitespace. Note that whitespace includes not only space character, but mostly everything that looks empty: tab, carriage return, newline character, etc.
See the following example to better understand these methods:

String text = "The simple text string";

boolean empty = text.isEmpty(); // false

String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"

boolean startsWith = textInUpperCase.startsWith("THE"); // true

/* replace all space characters with empty strings */
String noSpaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"

String textWithWhitespaces = "\t text with whitespaces   !\n  \t";

String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
To learn more about different methods and arguments you can check out the documentation.

Exceptions when processing strings
When working with strings, there can be several exceptions.

1. NullPointerException. If a string is null and you call a method of the string, it throws NullPointerException.

String s = null;
int length = s.length(); // it throws NullPointerException
2. StringIndexOutOfBoundsException. If you try to access a non-existing character by an index then this exception occurs.

String s = "ab";
char c = s.charAt(2); // it throws StringIndexOutOfBoundsException because indexing starts with 0
We will consider how to handle different types of exceptions later.

Concatenating strings
Two strings can be concatenated using the "+" operator or the concat method. Both approaches lead to the same results.

String firstName = "John";
String lastName = "Smith";

// concatenation using the "+" operator
String fullName1 = firstName + " " + lastName; // "John Smith"

// concatenation using the concat method 
String fullName2 = firstName.concat(" ").concat(lastName); // "John Smith"
When we concatenate two strings a new string is created (because strings are immutable).

Important: in the general case str1 + str2 is not the same as str2 + str1 because the concatenation is not a commutative operation.
Appending values to a string
It's possible to add values of different types to a string. The value will be automatically converted to a string. See an example below.

String str = "str" + 10 + false; // the result is "str10false"
In the example above, the order of execution is:

"str" + 10 => "str10"
"str10" + false = "str10false"
Let's see a more complex example:

String shortString = "str";
int number = 100;

String result1 = shortString + number + 50; // the result is "str10050"
String result2 = number + 50 + shortString; // what is the result2?
The result2 is 150str, because, first, we calculate a sum of number and 50 and then concat it with str. The order of operations is important.

How to compare strings correctly?
Since String is a reference type you shouldn't compare strings using == or != operators. In this case, only addresses will be compared, but not actual values.

String has two convenient methods for comparing the equivalence of the actual content of one string with the content of another string: equals(other) and equalsIgnoreCase(other). See an example below.

String first = "first";
String second = "second";

String anotherFirst = "first";
String secondInUpperCase = "SECOND";

System.out.println(first.equals(second)); // false, the strings have different values
System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases 
Do not forget the rules when comparing strings.

Description
Our program should be able to display the grid at all stages of the game. Now we’re going to write a program that allows the user to enter a string representing the game state and correctly prints the 3x3 game grid based on this input. We’ll also add some boundaries around the game grid.

Objectives
In this stage, you will write a program that:

Reads a string of 9 symbols from the input and displays them to the user in a 3x3 grid. The grid can contain only X, O and _ symbols.
Outputs a line of dashes --------- above and below the grid, adds a pipe | symbol to the beginning and end of each line of the grid, and adds a space between all characters in the grid.
Examples
Examples below show how your output should look.
Notice that after Enter cells: comes the user input.

Example 1:

Enter cells: O_OXXO_XX
---------
| O _ O |
| X X O |
| _ X X |
---------
Example 2:

Enter cells: OXO__X_OX
---------
| O X O |
| _ _ X |
| _ O X |
---------
Example 3:

Enter cells: _XO__X___
---------
| _ X O |
| _ _ X |
| _ _ _ |
---------
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().replace('a', 'b'));
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        System.out.println(getChangedString(a.toCharArray()));
        sc.close();
    }

    static String getChangedString(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = 'b';
            }
        }
        return new String(arr);
    }
}
- public: anyone can access it
- static: method can be run without creating an instance of the class containing the main method
- void: method doesn't return any value
- main: the name of the method
You can now read in different kinds of input data that the user enters.
Here are some methods that are available through the Scanner class:
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()
Conditional statements are used to perform different actions based on different conditions.
The if statement is one of the most frequently used conditional statements.
If the if statement's condition expression evaluates to true, the block of code inside the if statement is executed. If the expression is found to be false, the first set of code after the end of the if statement (after the closing curly brace) is executed.
Syntax:
if (condition) {
   //Executes when the condition is true
}
Any of the following comparison operators may be used to form the condition:
< less than
> greater than
!= not equal to
== equal to
<= less than or equal to
>= greater than or equal to
Any of the following comparison operators may be used to form the condition:
< less than
> greater than
!= not equal to
== equal to
<= less than or equal to
>= greater than or equal to
Any of the following comparison operators may be used to form the condition:
< less than
> greater than
!= not equal to
== equal to
<= less than or equal to
>= greater than or equal to
An if statement can be followed by an optional else statement, which executes when the condition evaluates to false.
You can use one if-else statement inside another if or else statement.
Instead of using nested if-else statements, you can use the else if statement to check multiple conditions.
Logical operators are used to combine multiple conditions.

Let's say you wanted your program to output "Welcome!" only when the variable age is greater than 18 and the variable money is greater than 500.
One way to accomplish this is to use nested if statements
The OR operator (||) checks if any one of the conditions is true.
The condition becomes true, if any one of the operands evaluates to true.
The NOT !) logical operator is used to reverse the logical state of its operand. If a condition is true, the NOT logical operator will make it false.
A switch statement tests a variable for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.
Syntax:
switch (expression) {
   case value1 :
     //Statements
     break; //optional
   case value2 :
     //Statements
     break; //optional
    //You can have any number of case statements.
    default : //Optional
       //Statements
}
- When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
- When a break statement is reached, the switch terminates, and the flow of control jumps to the next line after the switch statement.
- Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.

The example below tests day against a set of values and prints a corresponding message.
A switch statement can have an optional default case.
The default case can be used for performing a task when none of the cases is matched.
The switch expression allows multiple comma-separated values per case and returns a value for the whole switch-case block.
The switch expression makes the switch-case block much shorter and doesn't use a break statement.
A loop statement allows to repeatedly execute a statement or group of statements.
while loops:
A while loop statement repeatedly executes a target statement as long as a given condition is true.
The while loops check for the condition x > 0. If it evaluates to true, it executes the statements within its body. Then it checks for the statement again and repeats.
int x = 3;
while(x>=) {
System.out.println(x);
x--;
}The while loops check for the condition x > 0. If it evaluates to true, it executes the statements within its body. Then it checks for the statement again and repeats.
When the expression is tested and the result is false, the loop body is skipped and the first statement after the while loop is executed.
Another loop structure is the for loop. A for loop allows you to efficiently write a loop that needs to execute a specific number of times.
Syntax: for(initialization; condition; increment/ decrement){
 statement(S)
}Initialization: Expression executes only once during the beginning of loop
Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
Increment/Decrement: Executes after each iteration of the loop.
A do...while loop is similar to a while loop, except that a do...while loop is guaranteed to execute at least one time.
int x = 1;
do{
System.out.println(x);
x++;
}while(x<5);Notice that the condition appears at the end of the loop, so the statements in the loop execute once before it is tested.
Even with a false condition, the code will run once.
Loop control statements:
The break and continue statements change the loop's execution flow.
The break statement terminates the loop and transfers execution to the statement immediately following the loop.
The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. In other words, it makes the loop skip to its next iteration.
a || b is true if either a or b is true
(a||b) && c is true if c is true and either a or b is true.
