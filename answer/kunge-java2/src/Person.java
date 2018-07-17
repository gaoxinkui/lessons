
public class Person {
    private String name;
    private int age;
    private Sex sex;

    public Person(){
        this.name = "xiaoming";
        this.age = 20;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return this.name;
    }
    public void setName(String setName){
        this.name=setName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int setAge){
        if(setAge<=0 || setAge > 150){
            System.out.println("输入年龄错误");
        }
        else{
            this.age=setAge;
        }
    }
//受保护的方法，只有自己和子类可以调用
    protected void speak() {
        System.out.println("大家好，我叫" + this.getName() + "，我今年" + this.getAge() + "岁");
    }

//公有方法
    public void speak(String aciton) {
        System.out.println("大家好，我叫" + this.getName() + "，我今年" + this.getAge() + "岁");
        System.out.println("下面我将为大家表演：" + aciton);
    }
}
enum Sex{
    //枚举类 怎么定义
}

