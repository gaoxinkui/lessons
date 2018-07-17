public class Reading {
    private String write;
    private String book;
    public Reading(){
        this.write="school assignment";
        this.book="english";
    }
    public Reading(String write,String book){
        this.write=write;
        this.book=book;
    }
    public String getWrite(){
        return this.write;
    }
    public void setWrite(String setWrite){
        this.write=setWrite;
    }

    public String getBook() {
        return this.book;
    }

    public void setBook(String setbook) {
        ;
    }
    public void speak(){
        System.out.println("我写了："+this.getWrite()+"，并且读了："+getBook());
    }
}
