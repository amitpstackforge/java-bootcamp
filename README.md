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
