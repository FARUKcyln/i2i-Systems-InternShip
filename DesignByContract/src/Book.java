public class Book {
 private String name;
 private int pageNum;

    public int getPageNum() {
        return pageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public Book(){

    }

    public Book(String name, int pageNum){
        setName(name);
        setPageNum(pageNum);
    }

}
