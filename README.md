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
