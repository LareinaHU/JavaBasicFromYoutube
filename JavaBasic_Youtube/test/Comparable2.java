package test;

public class Comparable2 {
    public static void main(String[] args) {
        Student ss1 = new Student();
        Student ss2 = new Student();
        ss1.name = "zhengzhou";
        ss1.age = 14;
        ss2.name = "lisa";
        ss2.age = 18;
        int re = ss1.compareTo(ss2);
        if (re > 0) {

            System.out.println("max age" + ss1);

        } else if (re < 0) {
            System.out.println("max age" + ss2);

        } else {
            System.out.println("equal");

        }
    }

    public static class Student implements Comparable<Student> {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            return this.getAge() - o.getAge();
        }
    }
}
