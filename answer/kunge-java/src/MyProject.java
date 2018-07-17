
//入口函数
/*


 */
public class MyProject {
    public static void main(String[] args)  {
        Person p=new Person();
        p.setAge(18);
        p.setName("小明");
        p.speak();
        Person p2 = new Person("zhangsan",20);
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
                break;
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }

    }
    }
}