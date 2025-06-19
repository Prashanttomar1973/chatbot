class Example{
    String message;
    Example(String message){
        this.message=message;
    }
    public String toString(){
        return "Message: "+message;
    }
}
public class Object_to_String{
    public static void main(String[] args){
        Example obj=new Example("Hello,World!");
        System.out.println(obj.toString());
    }
}