public class String_To_object{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("java.lang.String                                                                                                                                  ");
        System.out.println("class name: "+c.getName());
        System.out.println("super class name: "+c.getSuperclass().getName());
    }
}

