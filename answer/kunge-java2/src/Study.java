public class Study extends Reading {
    private String english;
    public  void setEnglish(){
       this.english=english;
    }
    public  String getEnglish(){
        return english;
    }
   public  Study(){
       super();
       this.english="JAVA";
   }

    public void speak(){
        System.out.println("还学习了"+this.english);
        super.speak();
    }
}
