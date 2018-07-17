
public class Student extends Person {
    private String xueyuan;
    private String zhuanye;

    public void setXueyuan(String xueyuan) {
        this.xueyuan = xueyuan;
    }

    public String getZhuanye() {
        return zhuanye;
    }

    public String getXueyuan() {
        return xueyuan;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public Student(){
        super();
        this.xueyuan = "jisuanji";
        this.zhuanye = "jisuanjiruanjian";
    }

//    函数覆写
    public void speak() {
        System.out.println("我来自" + this.getXueyuan() + "学院，我的专业是：" + this.getZhuanye() );
        super.speak("changge");
    }
}
