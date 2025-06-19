class access{
    private String m;
    public String getm(){
        return this.m;
    }
    public void setm(String k){
        this.m=k;
    }
}

public class Private_access_modifier {
    public static void main(String[] args){
    access b=new access();
    b.setm("");
        System.out.println(b.getm());
    }
}
