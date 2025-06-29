নিচে "Java Fundamentals (Beginner Level)" এর অন্তর্ভুক্ত **Data Types** বিষয়টি বাংলা ভাষায় সহজ উদাহরণসহ ব্যাখ্যা করা হলো:

---

## 📘 **Java Data Types (ডাটা টাইপস)**

Java-তে **ডাটা টাইপ** ব্যবহার করা হয় ভ্যারিয়েবলের ধরণ নির্ধারণ করতে। যেমন: সংখ্যা, অক্ষর, দশমিক সংখ্যা ইত্যাদি।

Java-তে প্রধানত দুই ধরনের ডাটা টাইপ আছে:

### ✅ ১. Primitive Data Types (প্রিমিটিভ ডাটা টাইপ)

| টাইপ      | বর্ণনা                           | উদাহরণ        |
| --------- | -------------------------------- | ------------- |
| `int`     | পূর্ণ সংখ্যা                     | 10, 100, -50  |
| `float`   | দশমিক সংখ্যা                     | 3.14f, 5.5f   |
| `double`  | বড় দশমিক সংখ্যা                  | 3.14159265359 |
| `char`    | একটি অক্ষর                       | 'A', 'z'      |
| `boolean` | সত্য বা মিথ্যা                   | true, false   |
| `byte`    | ছোট পূর্ণ সংখ্যা (-128 থেকে 127) | 100           |
| `short`   | ছোট পরিসরের পূর্ণ সংখ্যা         | 32000         |
| `long`    | বড় পরিসরের পূর্ণ সংখ্যা          | 1234567890L   |

---

## 🎯 সহজ উদাহরণ (Java Code সহ)

```java
public class DataTypesExample {
    public static void main(String[] args) {
        int age = 25;                  // পূর্ণ সংখ্যা
        float temperature = 36.5f;     // দশমিক সংখ্যা (float)
        double pi = 3.14159;           // বড় দশমিক সংখ্যা
        char grade = 'A';              // একটি অক্ষর
        boolean isPassed = true;       // সত্য/মিথ্যা
        byte smallNumber = 100;        // ছোট সংখ্যা
        short shortNumber = 32000;     // ছোট পরিসরের সংখ্যা
        long bigNumber = 123456789L;   // বড় সংখ্যা

        // আউটপুট দেখানো
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
        System.out.println("PI value: " + pi);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Long value: " + bigNumber);
    }
}
```

---

## 🧠 মনে রাখার টিপস:

* `int` = সংখ্যা গুলো যা পূর্ণ (decimal ছাড়া)
* `float` ও `double` = দশমিক সংখ্যা (`float` এর শেষে `f` দিতে হয়)
* `char` = একটি মাত্র অক্ষর
* `boolean` = সত্য/মিথ্যা
* বড় সংখ্যার জন্য `long` (শেষে `L`)
* ছোট পরিসরের জন্য `byte` বা `short`

---

আপনি চাইলে পরবর্তী ধাপে **Operators**, **Variables**, **Input/Output**, ইত্যাদি বিষয়গুলিও বাংলায় উদাহরণসহ জানতে পারেন। যদি চান, আমি এগুলোও তৈরি করে দিতে পারি।

অবশ্যই! নিচে **Java Variables** (ভ্যারিয়েবল) সম্পর্কে বাংলা ভাষায় সহজভাবে ব্যাখ্যা ও উদাহরণ দেওয়া হলো, যেখানে কোডে বাংলা মন্তব্য এবং আউটপুট ব্যবহার করা হয়েছে।

---

## 🧾 **Java Variables (ভ্যারিয়েবল কী?)**

Java-তে **ভ্যারিয়েবল** হলো এমন একটি কন্টেইনার বা ধারক, যেখানে আমরা তথ্য (ডাটা) সংরক্ষণ করি।
প্রতিটি ভ্যারিয়েবলের একটি **নাম** ও একটি **ডাটা টাইপ** থাকে।

---

## 🔢 উদাহরণসহ সহজ ব্যাখ্যা (বাংলা মন্তব্য ও প্রিন্ট সহ)

```java
public class VariableExample {
    public static void main(String[] args) {
        // বয়স সংরক্ষণের জন্য একটি পূর্ণসংখ্যা ভ্যারিয়েবল
        int boyos = ২৫;

        // নাম সংরক্ষণের জন্য একটি স্ট্রিং ভ্যারিয়েবল
        String naam = "রাহুল";

        // প্রাপ্ত নম্বর সংরক্ষণের জন্য দশমিক সংখ্যা
        float number = ৮৭.৫f;

        // পাশ করেছে কিনা তা সংরক্ষণের জন্য boolean ভ্যারিয়েবল
        boolean pass = true;

        // আউটপুট প্রদর্শন (বাংলায়)
        System.out.println("ছাত্রের নাম: " + naam);
        System.out.println("বয়স: " + boyos + " বছর");
        System.out.println("নম্বর: " + number);
        System.out.println("পাশ করেছে? " + pass);
    }
}
```

---

## 🧠 কিছু গুরুত্বপূর্ণ পয়েন্ট:

🔹 **ভ্যারিয়েবল ঘোষণার নিয়ম**:

```java
dataType variableName = value;
```

🔹 যেমন:

```java
int age = 30;
String name = "রাহুল";
```

---

## 📘 আরও কিছু উদাহরণ

### 🎓 ছাত্রের তথ্য:

```java
public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "সালমা";
        int rollNumber = ৫;
        double gpa = ৩.৭৫;
        char section = 'A';

        System.out.println("নাম: " + studentName);
        System.out.println("রোল নম্বর: " + rollNumber);
        System.out.println("GPA: " + gpa);
        System.out.println("সেকশন: " + section);
    }
}
```

---

## 📌 মনে রাখুন:

* **String** = শব্দ বা বাক্য
* **int** = সংখ্যা (পূর্ন সংখ্যা)
* **float/double** = দশমিক সংখ্যা
* **boolean** = সত্য বা মিথ্যা
* **char** = একটি অক্ষর

---

আপনি যদি চান, আমি পরবর্তী টপিক যেমন **Operators**, **Input from User**, ইত্যাদিও বাংলায় উদাহরণসহ ব্যাখ্যা করতে পারি। বললেই তৈরি করে দেব!

অবশ্যই! নিচে **Java Operators (অপারেটর)** সম্পর্কে বাংলা ভাষায় সহজ ব্যাখ্যা এবং উদাহরণসহ কোড দেওয়া হলো, যাতে বাংলা মন্তব্য ও আউটপুট রয়েছে।

---

## ⚙️ **Java Operators (অপারেটর কী?)**

**অপারেটর** হলো প্রতীক বা চিহ্ন যেগুলোর মাধ্যমে আমরা ভ্যারিয়েবলের উপর বিভিন্ন গাণিতিক, তুলনামূলক বা যৌক্তিক কাজ করতে পারি।

---

## 🔢 ১. **Arithmetic Operators (গাণিতিক অপারেটর)**

| অপারেটর | কাজ    | উদাহরণ  |
| ------- | ------ | ------- |
| `+`     | যোগ    | `a + b` |
| `-`     | বিয়োগ | `a - b` |
| `*`     | গুণ    | `a * b` |
| `/`     | ভাগ    | `a / b` |
| `%`     | ভাগশেষ | `a % b` |

### ✅ উদাহরণ (বাংলা সহ)

```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = ১০;
        int b = ৩;

        System.out.println("যোগ: " + (a + b));       // ১৩
        System.out.println("বিয়োগ: " + (a - b));    // ৭
        System.out.println("গুণ: " + (a * b));       // ৩০
        System.out.println("ভাগ: " + (a / b));       // ৩
        System.out.println("ভাগশেষ: " + (a % b));    // ১
    }
}
```

---

## 🔍 ২. **Relational / Comparison Operators (তুলনামূলক অপারেটর)**

| অপারেটর | কাজ         | উদাহরণ   |
| ------- | ----------- | -------- |
| `==`    | সমান কিনা   | `a == b` |
| `!=`    | অসমান কিনা  | `a != b` |
| `>`     | বড় কিনা     | `a > b`  |
| `<`     | ছোট কিনা    | `a < b`  |
| `>=`    | বড় বা সমান  | `a >= b` |
| `<=`    | ছোট বা সমান | `a <= b` |

### ✅ উদাহরণ:

```java
public class ComparisonOperators {
    public static void main(String[] args) {
        int a = ৫;
        int b = ৮;

        System.out.println("a এবং b সমান? " + (a == b));
        System.out.println("a বড়? " + (a > b));
        System.out.println("a ছোট? " + (a < b));
    }
}
```

---

## 🧠 ৩. **Logical Operators (যৌক্তিক অপারেটর)**

| অপারেটর | নাম | উদাহরণ            |    |         |   |          |
| ------- | --- | ----------------- | -- | ------- | - | -------- |
| `&&`    | AND | `a > 5 && b < 10` |    |         |   |          |
| \`      |     | \`                | OR | \`a > 5 |   | b < 10\` |
| `!`     | NOT | `!(a > 5)`        |    |         |   |          |

### ✅ উদাহরণ:

```java
public class LogicalOperators {
    public static void main(String[] args) {
        int a = ৭;
        int b = ৯;

        System.out.println("a > ৫ && b < ১০ : " + (a > ৫ && b < ১০));
        System.out.println("a > ৮ || b < ১০ : " + (a > ৮ || b < ১০));
        System.out.println("a < ৫ নয়? : " + !(a < ৫));
    }
}
```

---

## 🧾 ৪. **Assignment Operators (অ্যাসাইনমেন্ট অপারেটর)**

| অপারেটর | কাজ                 | উদাহরণ                      |
| ------- | ------------------- | --------------------------- |
| `=`     | মান নির্ধারণ        | `a = ৫`                     |
| `+=`    | যোগ করে মান রাখা    | `a += ২` (মানে `a = a + ২`) |
| `-=`    | বিয়োগ করে মান রাখা | `a -= ২`                    |
| `*=`    | গুণ করে রাখা        | `a *= ২`                    |
| `/=`    | ভাগ করে রাখা        | `a /= ২`                    |

### ✅ উদাহরণ:

```java
public class AssignmentOperators {
    public static void main(String[] args) {
        int a = ১০;
        a += ৫; // এখন a = ১৫
        System.out.println("যোগ করে মান: " + a);

        a -= ৩; // এখন a = ১২
        System.out.println("বিয়োগ করে মান: " + a);
    }
}
```

---

## ✅ উপসংহার:

* **গাণিতিক** কাজের জন্য `+`, `-`, `*`, `/`, `%`
* **তুলনা** করার জন্য `==`, `!=`, `<`, `>`
* **যৌক্তিক চিন্তা** করার জন্য `&&`, `||`, `!`
* **ভ্যালু সেট** করার জন্য `=`, `+=`, `-=`

---

আপনি যদি চান, আমি **Conditional Statements (if/else)** বা **Loops (for/while)** এর বাংলা ব্যাখ্যা সহ উদাহরণও দিতে পারি। শুধু বলুন কী লাগবে! 😊


অবশ্যই! নিচে Java Loops (লুপ) নিয়ে বাংলায় সহজ ব্যাখ্যা ও উদাহরণ দেওয়া হলো, যাতে বাংলা মন্তব্য এবং বাংলা প্রিন্ট স্টেটমেন্ট ব্যবহার করা হয়েছে।

অবশ্যই! নিচে **Java Loops (লুপ)** নিয়ে বাংলায় সহজ ব্যাখ্যা ও উদাহরণ দেওয়া হলো, যাতে বাংলা মন্তব্য এবং বাংলা প্রিন্ট স্টেটমেন্ট ব্যবহার করা হয়েছে।

---

## 🔁 **Java Loops (লুপ কী?)**

**Loop** বা লুপ হলো একটি নির্দিষ্ট কাজ **পুনরাবৃত্তি** (repeat) করে করার উপায়। যেমন: ১ থেকে ১০ পর্যন্ত সংখ্যা ছাপানো, কোনো ম্যাসেজ বারবার দেখানো ইত্যাদি।

Java-তে প্রধানত ৩ ধরনের লুপ আছে:

1. `for` লুপ
2. `while` লুপ
3. `do-while` লুপ

---

## ১️⃣ **for লুপ** – নির্দিষ্ট সংখ্যক বার চালানোর জন্য

### ✅ উদাহরণ: ১ থেকে ৫ পর্যন্ত সংখ্যা ছাপাও

```java
public class ForLoopExample {
    public static void main(String[] args) {
        // ১ থেকে ৫ পর্যন্ত সংখ্যা ছাপানো
        for (int i = ১; i <= ৫; i++) {
            System.out.println("সংখ্যা: " + i);
        }
    }
}
```

---

## ২️⃣ **while লুপ** – শর্ত সত্য থাকা পর্যন্ত চালায়

### ✅ উদাহরণ: যতক্ষণ না সংখ্যা ৫ হয়

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = ১;

        // যতক্ষণ i <= ৫, ততক্ষণ চলবে
        while (i <= ৫) {
            System.out.println("আমি while লুপে আছি, সংখ্যা: " + i);
            i++;
        }
    }
}
```

---

## ৩️⃣ **do-while লুপ** – অন্তত একবার চালায়, তারপর শর্ত দেখে

### ✅ উদাহরণ: সংখ্যা ১ থেকে ৩ পর্যন্ত ছাপাও

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = ১;

        do {
            System.out.println("do-while লুপ, সংখ্যা: " + i);
            i++;
        } while (i <= ৩);
    }
}
```

---

## 🎯 আরও একটি মজার উদাহরণ: শুধু জোড় সংখ্যা ছাপাও

```java
public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("১ থেকে ১০ এর মধ্যে জোড় সংখ্যা:");

        for (int i = ১; i <= ১০; i++) {
            if (i % ২ == ০) {
                System.out.println(i + " একটি জোড় সংখ্যা।");
            }
        }
    }
}
```

---

## 📌 মনে রাখার টিপস:

| লুপ টাইপ   | কবে ব্যবহার করবেন                                    |
| ---------- | ---------------------------------------------------- |
| `for`      | যখন লুপ কতবার চলবে সেটা জানেন                        |
| `while`    | যখন শুধু শর্তের উপর ভিত্তি করে চালাতে চান            |
| `do-while` | যখন অন্তত একবার চালানো দরকার, তারপর শর্ত যাচাই করবেন |

---

## ✅ উপসংহার:

* লুপের মাধ্যমে কোড **পুনরাবৃত্তি** করা যায়।
* Java তে তিন ধরনের লুপ আছে।
* প্রতিটি লুপেই আমরা শর্ত দিয়ে কাজগুলো নির্দিষ্ট নিয়ন্ত্রণে রাখতে পারি।

---

চাইলে আমি **nested loops**, **break/continue**, অথবা **loop দিয়ে pattern প্রিন্ট** করার উদাহরণও বাংলায় দেখাতে পারি। আগ্রহ থাকলে জানাও 😊

ধন্যবাদ! তুমি চেয়েছো শুধুমাত্র **`for` লুপ** ব্যবহার করে উদাহরণ। নিচে বাংলায় কিছু **সহজ ও ব্যাসিক `for` লুপ** উদাহরণ দেওয়া হলো:

---

## 🧾 **১. ১ থেকে ১০ পর্যন্ত সংখ্যা প্রিন্ট করা**

```java
public class ForLoop1to10 {
    public static void main(String[] args) {
        // ১ থেকে ১০ পর্যন্ত সংখ্যা ছাপানো
        for (int i = ১; i <= ১০; i++) {
            System.out.println("সংখ্যা: " + i);
        }
    }
}
```

---

## 🔢 **২. ১০ থেকে ১ পর্যন্ত উল্টোভাবে প্রিন্ট করা**

```java
public class ReversePrint {
    public static void main(String[] args) {
        // ১০ থেকে ১ পর্যন্ত সংখ্যা
        for (int i = ১০; i >= ১; i--) {
            System.out.println("উল্টো সংখ্যা: " + i);
        }
    }
}
```

---

## ➗ **৩. ১ থেকে ২০ এর মধ্যে শুধু জোড় সংখ্যা**

```java
public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("১ থেকে ২০ এর মধ্যে জোড় সংখ্যা:");

        for (int i = ২; i <= ২০; i += ২) {
            System.out.println(i);
        }
    }
}
```

---

## 🟠 **৪. ১ থেকে ১০ এর গুণফল (Multiplication Table of 5)**

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = ৫;

        System.out.println("৫ এর নামতা:");

        for (int i = ১; i <= ১০; i++) {
            System.out.println(number + " × " + i + " = " + (number * i));
        }
    }
}
```

---

## 🧱 **৫. `*` চিহ্ন দিয়ে প্যাটার্ন ছাপানো**

```java
public class StarPattern {
    public static void main(String[] args) {
        System.out.println("তারা চিহ্ন প্যাটার্ন:");

        for (int i = ১; i <= ৫; i++) {
            for (int j = ১; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // লাইন ব্রেক
        }
    }
}
```

**আউটপুট:**

```
* 
* * 
* * * 
* * * * 
* * * * * 
```

---

## ✅ উপসংহার:

* `for` লুপ খুবই উপকারী যখন তুমি জানো কতবার লুপ চলবে।
* তুমি চাইলে লুপের ভিতরে `if` ব্যবহার করে বিভিন্ন শর্তে কাজ করতে পারো।
* চাইলে প্যাটার্ন, টেবিল, সংখ্যা প্রিন্ট, যোগফল, গড়, সবই `for` লুপ দিয়ে করা যায়।

---

🔔 **আরো উদাহরণ লাগলে জানিও:** যেমন `for` লুপ দিয়ে **ফ্যাক্টরিয়াল**, **সংখ্যার যোগফল**, অথবা **list/array প্রিন্ট** — সব বাংলায় বুঝিয়ে দেব! 😊


খুব ভালো প্রশ্ন! এখন আমরা বাস্তব জীবনের কিছু **Real-life Java for-loop example** দেখবো — যেমন একটি ছোট **ERP (Enterprise Resource Planning)** ব্যবস্থার মতো উদাহরণ।

এই উদাহরণগুলো বাস্তবজীবনে অফিস, স্কুল বা দোকানে ব্যবহৃত হতে পারে এবং এগুলোর মাধ্যমে Java `for` loop কিভাবে ব্যবহার হয় তা পরিষ্কারভাবে বোঝা যাবে।

---

## ✅ উদাহরণ ১: **কর্মচারীদের বেতন তালিকা তৈরি (Employee Salary Report)**

**সমস্যা**: একটি প্রতিষ্ঠানে ৫ জন কর্মচারী আছেন। প্রতিটি কর্মচারীর নাম এবং মাসিক বেতন আছে। তুমি `for` লুপ ব্যবহার করে তাদের নাম ও বেতন প্রিন্ট করো।

```java
public class EmployeeSalaryReport {
    public static void main(String[] args) {
        // কর্মচারীদের নাম
        String[] names = {"রাকিব", "সালমা", "জন", "সাব্বির", "নুসরাত"};

        // বেতন তালিকা (টাকায়)
        int[] salaries = {25000, 30000, 28000, 27000, 32000};

        System.out.println("📋 কর্মচারীদের বেতন তালিকা:\n");

        for (int i = 0; i < names.length; i++) {
            System.out.println("নাম: " + names[i] + " | মাসিক বেতন: " + salaries[i] + " টাকা");
        }
    }
}
```

---

## ✅ উদাহরণ ২: **স্টুডেন্ট রেজাল্ট প্রসেসিং (Mark Sheet Generation)**

**সমস্যা**: একটি ক্লাসে ৪ জন শিক্ষার্থী আছেন। তাদের নাম ও প্রাপ্ত নম্বর দেওয়া আছে। তুমি `for` লুপ দিয়ে দেখাও কে পাশ করেছে (৩৩ বা তার বেশি নম্বর)।

```java
public class StudentResults {
    public static void main(String[] args) {
        String[] students = {"রাহুল", "সুমাইয়া", "নিহাদ", "জাহিদ"};
        int[] marks = {45, 29, 68, 32};

        System.out.println("🎓 শিক্ষার্থীদের রেজাল্ট:\n");

        for (int i = 0; i < students.length; i++) {
            System.out.print("নাম: " + students[i] + " | নম্বর: " + marks[i]);

            if (marks[i] >= 33) {
                System.out.println(" → ✅ পাশ");
            } else {
                System.out.println(" → ❌ ফেল");
            }
        }
    }
}
```

---

## ✅ উদাহরণ ৩: **স্টকে থাকা পণ্যের তালিকা (Inventory Management)**

**সমস্যা**: একটি দোকানে ৫টি পণ্যের নাম এবং স্টক রয়েছে। তুমি `for` লুপ দিয়ে পণ্যের তালিকা দেখাও এবং কোনটি **স্টকে নেই (stock = 0)** তা চিহ্নিত করো।

```java
public class ProductInventory {
    public static void main(String[] args) {
        String[] products = {"চাল", "ডাল", "তেল", "চিনি", "লবণ"};
        int[] stock = {50, 0, 20, 10, 0};

        System.out.println("🛒 পণ্যের স্টক রিপোর্ট:\n");

        for (int i = 0; i < products.length; i++) {
            System.out.print("পণ্য: " + products[i] + " | স্টক: " + stock[i]);

            if (stock[i] == 0) {
                System.out.println(" → ⚠️ স্টকে নেই!");
            } else {
                System.out.println(" → ✅ উপলব্ধ");
            }
        }
    }
}
```

---

## ✅ উদাহরণ ৪: **মাস ভিত্তিক বিক্রয় রিপোর্ট (Sales Summary for Each Month)**

```java
public class MonthlySales {
    public static void main(String[] args) {
        String[] months = {"জানুয়ারি", "ফেব্রুয়ারি", "মার্চ", "এপ্রিল"};
        int[] sales = {12000, 15000, 13000, 14000};

        System.out.println("📊 মাসভিত্তিক বিক্রয় রিপোর্ট:\n");

        int totalSales = 0;

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " মাসে বিক্রয়: " + sales[i] + " টাকা");
            totalSales += sales[i];
        }

        System.out.println("\nমোট বিক্রয়: " + totalSales + " টাকা");
    }
}
```

---

## 🎓 শিক্ষণীয়:

* বাস্তবজীবনের ERP-এর ছোট ছোট সমস্যাগুলো `for` লুপ ব্যবহার করে সমাধান করা যায়।
* ডাটা যদি array আকারে থাকে, `for` লুপ দিয়ে খুব সহজে সেটি প্রসেস করা যায়।
* এতে আমরা **ডেটা প্রসেসিং, রিপোর্ট তৈরি, এবং শর্ত নির্ধারণ** করতে পারি।

---

চাইলে আমি এই উদাহরণগুলোর মধ্যে কোনো একটি **বেশি জটিল করে (input, filtering, average, etc.)** বা **GUI (graphical)** আকারে তৈরি করে দিতে পারি।
বললেই করে দিচ্ছি! 😊

public class StudentReportCard {
public static void main(String[] args) {
// শিক্ষার্থীদের নাম
String[] students = {"রায়হান", "সালমা", "রিমন"};

        // প্রতিটি শিক্ষার্থীর ৩টি বিষয় অনুযায়ী নম্বর
        int[][] marks = {
            {80, 75, 90}, // রায়হান
            {60, 50, 65}, // সালমা
            {30, 40, 20}  // রিমন
        };

        System.out.println("📘 শিক্ষার্থীদের রেজাল্ট রিপোর্ট:\n");

        for (int i = 0; i < students.length; i++) {
            System.out.println("👤 নাম: " + students[i]);

            int total = 0;

            // বিষয় ভিত্তিক নম্বর দেখানো ও যোগফল
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("    বিষয় " + (j + 1) + " নম্বর: " + marks[i][j]);
                total += marks[i][j];
            }

            double average = total / 3.0;
            String grade;

            // গ্রেড নির্ধারণ
            if (average >= 80) {
                grade = "A+";
            } else if (average >= 70) {
                grade = "A";
            } else if (average >= 60) {
                grade = "B";
            } else if (average >= 50) {
                grade = "C";
            } else if (average >= 33) {
                grade = "D";
            } else {
                grade = "F (ফেল)";
            }

            System.out.println("    মোট নম্বর: " + total);
            System.out.println("    গড় নম্বর: " + average);
            System.out.println("    গ্রেড: " + grade);
            System.out.println("------------------------------");
        }
    }
}


📘 শিক্ষার্থীদের রেজাল্ট রিপোর্ট:

👤 নাম: রায়হান
বিষয় 1 নম্বর: 80
বিষয় 2 নম্বর: 75
বিষয় 3 নম্বর: 90
মোট নম্বর: 245
গড় নম্বর: 81.666666...
গ্রেড: A+
------------------------------
👤 নাম: সালমা
বিষয় 1 নম্বর: 60
বিষয় 2 নম্বর: 50
বিষয় 3 নম্বর: 65
মোট নম্বর: 175
গড় নম্বর: 58.33
গ্রেড: C
------------------------------
👤 নাম: রিমন
বিষয় 1 নম্বর: 30
বিষয় 2 নম্বর: 40
বিষয় 3 নম্বর: 20
মোট নম্বর: 90
গড় নম্বর: 30.0
গ্রেড: F (ফেল)
------------------------------

দারুন! তুমি বলেছো **"yes"** — তাহলে আমি এখন একটি বাস্তবধর্মী `for` লুপ প্রোজেক্টকে **আরও উন্নত** করব।

নিচে আমি একটি ERP টাইপের **"স্টুডেন্ট মার্কস রিপোর্ট সিস্টেম"** বানিয়ে দেখাচ্ছি, যেখানে আমরা করব:

✅ নাম ও নম্বর দেখানো
✅ মোট নম্বর হিসাব
✅ গড় (average)
✅ গ্রেড নির্ধারণ
✅ `for` লুপ ব্যবহার
✅ বাংলা প্রিন্ট

---

## 🎓 উন্নত উদাহরণ: **শিক্ষার্থীদের রেজাল্ট রিপোর্ট কার্ড**

```java
public class StudentReportCard {
    public static void main(String[] args) {
        // শিক্ষার্থীদের নাম
        String[] students = {"রায়হান", "সালমা", "রিমন"};

        // প্রতিটি শিক্ষার্থীর ৩টি বিষয় অনুযায়ী নম্বর
        int[][] marks = {
            {80, 75, 90}, // রায়হান
            {60, 50, 65}, // সালমা
            {30, 40, 20}  // রিমন
        };

        System.out.println("📘 শিক্ষার্থীদের রেজাল্ট রিপোর্ট:\n");

        for (int i = 0; i < students.length; i++) {
            System.out.println("👤 নাম: " + students[i]);

            int total = 0;

            // বিষয় ভিত্তিক নম্বর দেখানো ও যোগফল
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("    বিষয় " + (j + 1) + " নম্বর: " + marks[i][j]);
                total += marks[i][j];
            }

            double average = total / 3.0;
            String grade;

            // গ্রেড নির্ধারণ
            if (average >= 80) {
                grade = "A+";
            } else if (average >= 70) {
                grade = "A";
            } else if (average >= 60) {
                grade = "B";
            } else if (average >= 50) {
                grade = "C";
            } else if (average >= 33) {
                grade = "D";
            } else {
                grade = "F (ফেল)";
            }

            System.out.println("    মোট নম্বর: " + total);
            System.out.println("    গড় নম্বর: " + average);
            System.out.println("    গ্রেড: " + grade);
            System.out.println("------------------------------");
        }
    }
}
```

---

### 🖨️ আউটপুট (উদাহরণ):

```
📘 শিক্ষার্থীদের রেজাল্ট রিপোর্ট:

👤 নাম: রায়হান
    বিষয় 1 নম্বর: 80
    বিষয় 2 নম্বর: 75
    বিষয় 3 নম্বর: 90
    মোট নম্বর: 245
    গড় নম্বর: 81.666666...
    গ্রেড: A+
------------------------------
👤 নাম: সালমা
    বিষয় 1 নম্বর: 60
    বিষয় 2 নম্বর: 50
    বিষয় 3 নম্বর: 65
    মোট নম্বর: 175
    গড় নম্বর: 58.33
    গ্রেড: C
------------------------------
👤 নাম: রিমন
    বিষয় 1 নম্বর: 30
    বিষয় 2 নম্বর: 40
    বিষয় 3 নম্বর: 20
    মোট নম্বর: 90
    গড় নম্বর: 30.0
    গ্রেড: F (ফেল)
------------------------------
```

---

## ✅ এখানে আমরা যা শিখলাম:

* `for` লুপ ব্যবহার করে **একাধিক শিক্ষার্থী** এবং **একাধিক বিষয়** প্রসেস করলাম
* **২D Array** ব্যবহার করে তথ্য ম্যানেজ করলাম
* **মোট, গড় ও গ্রেড** বের করলাম
* **বাংলা ভাষায়** সব প্রিন্ট ও মন্তব্য লিখলাম

---

## 🎯 পরবর্তী ধাপ:

তুমি চাইলে আমি এটিকে পরবর্তীতে:

* **User Input** যুক্ত করতে পারি (স্ক্যানার দিয়ে)
* **ফাইল থেকে ডেটা রিড** করতে পারি
* অথবা **Java GUI (Graphical Interface)** দিয়ে একটি ছোট অ্যাপ বানিয়ে দিতে পারি (Swing/JavaFX দিয়ে)

👉 তুমি কী চাও? Input-based করবো, নাকি GUI বানাবো? 😊

import java.util.Scanner;

public class BengaliCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        // ব্যবহারকারীর কাছ থেকে সংখ্যা নেওয়া
        System.out.print("প্রথম সংখ্যা লিখুন: ");
        double num1 = input.nextDouble();

        System.out.print("দ্বিতীয় সংখ্যা লিখুন: ");
        double num2 = input.nextDouble();

        // অপারেশন চাওয়া
        System.out.print("অপারেশন নির্বাচন করুন (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        // অপারেশন অনুসারে হিসাব
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("ফলাফল: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("ফলাফল: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("ফলাফল: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("ফলাফল: " + result);
            } else {
                System.out.println("ভাগ করা যায় না (০ দিয়ে ভাগ নিষিদ্ধ)।");
            }
        } else {
            System.out.println("ভুল অপারেশন! সঠিক অপারেশন (+, -, *, /) দিন।");
        }

        input.close();
    }
}

প্রথম সংখ্যা লিখুন: 10
দ্বিতীয় সংখ্যা লিখুন: 5
অপারেশন নির্বাচন করুন (+, -, *, /): *

চমৎকার! এখন আমরা **Java দিয়ে একটি ক্যালকুলেটর প্রোগ্রাম** বানাবো — বাংলা ভাষায় মন্তব্য এবং প্রিন্ট মেসেজ সহ।

---

## ✅ 🎯 লক্ষ্য:

* ব্যবহারকারী দুইটি সংখ্যা ইনপুট দেবে
* ব্যবহারকারী একটি অপারেশন বেছে নেবে (`+`, `-`, `*`, `/`)
* ক্যালকুলেটর ফলাফল দেখাবে
* প্রোগ্রামটি `if-else` বা `switch` দিয়ে কাজ করবে

---

## 🧮 উদাহরণ: **Java ক্যালকুলেটর (Scanner ব্যবহার করে)**

```java
import java.util.Scanner;

public class BengaliCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ব্যবহারকারীর কাছ থেকে সংখ্যা নেওয়া
        System.out.print("প্রথম সংখ্যা লিখুন: ");
        double num1 = input.nextDouble();

        System.out.print("দ্বিতীয় সংখ্যা লিখুন: ");
        double num2 = input.nextDouble();

        // অপারেশন চাওয়া
        System.out.print("অপারেশন নির্বাচন করুন (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        // অপারেশন অনুসারে হিসাব
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("ফলাফল: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("ফলাফল: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("ফলাফল: " + result);
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("ফলাফল: " + result);
            } else {
                System.out.println("ভাগ করা যায় না (০ দিয়ে ভাগ নিষিদ্ধ)।");
            }
        } else {
            System.out.println("ভুল অপারেশন! সঠিক অপারেশন (+, -, *, /) দিন।");
        }

        input.close();
    }
}
```

---

### 🔎 ইনপুট উদাহরণ:

```
প্রথম সংখ্যা লিখুন: 10
দ্বিতীয় সংখ্যা লিখুন: 5
অপারেশন নির্বাচন করুন (+, -, *, /): *
```

### ✅ আউটপুট:

```
ফলাফল: 50.0
```

---

## 🧠 উন্নতির সুযোগ:

তুমি চাইলে এটাকে আরও উন্নত করতে পারো যেমন:

* `switch` দিয়ে অপারেশন নির্বাচন
* একাধিক ক্যালকুলেশন চালু রাখা (`while` লুপ দিয়ে)
* GUI ভার্সন তৈরি করা (Java Swing দিয়ে)

---

তুমি কি এটা **Graphical Calculator (GUI)** হিসেবে চাও?
নাকি **loop দিয়ে বারবার চলতে থাকা ক্যালকুলেটর** চাই?
বললেই তৈরি করে দিচ্ছি! 😊






