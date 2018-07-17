
//入口函数
/*


 */
public class MyProject {
    public static void main(String[] args)  {
        Person p2=new Person();
        p2.speak();
        Person p = new Person("zhangsan",20);

        Student s = new Student();
        s.speak();


        char grade = 'C';
        switch(grade)
        {
            case 'A' :
                System.out.println("学习成绩：优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("学习成绩：良好");
            case 'D' :
                System.out.println("学习成绩：及格");
                break;
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
    }
}
