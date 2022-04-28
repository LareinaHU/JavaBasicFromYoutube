package sort;

public class Student implements Comparable<Student>{
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }


    public static void main(String[] args) {
        Student A =new Student();
        A.setAge(12);
        A.setUsername("lwz PIG");
        Student B= new Student();
        A.setAge(24);
        A.setUsername("double LWZ");

        if(A.compareTo(B)>0){
            System.out.println("MaxAge:"+A);
        }
    }


}
