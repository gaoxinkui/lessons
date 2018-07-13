
    class Person {
        String name;
        int age;

        public String getName () {
           return name;
        }
        public void setName(String setName){
            name=setName;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int setAge){
            if(setAge<=0){
                System.out.println("年龄错误");
            }
            else{
                age=setAge;
            }
        }
        public void speak() {
            System.out.println("大家好，我叫" + name + "，我今年" + age + "岁");
        }
    }
public class Student {
public static void main(String[] args){
        Person p=new Person();
        p.setAge(18);
        p.setName("小明");
        p.speak();
    char grade = 'C';

    switch(grade)
    {
        case 'A' :
            System.out.println("学习成绩：优秀");
            break;
        case 'B' :
        case 'C' :
            System.out.println("学习成绩：良好");
            break;
        case 'D' :
            System.out.println("学习成绩：及格");
        case 'F' :
            System.out.println("你需要再努力努力");
            break;
        default :
            System.out.println("未知等级");
    }

    }
}
