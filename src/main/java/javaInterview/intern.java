package javaInterview;

public class intern {
    public static void main(String[] args) {
        String a="java";
        String b=new String("java");
        String c=b.intern();
        String d=new String("java");
        System.out.println(b==c);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(d==c);
        System.out.println(b==d);
        System.out.println(b.equals(d));
    }
}
