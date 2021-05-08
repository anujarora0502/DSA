public class strings{


   public static void main(String[] args){
    String s = "anuj,kunal,rhythm,ayush";
     
    String[] arr = s.split(",");

    // for(String temp: arr){
    //     System.out.println(temp);
    // }

    String s1 = "hello";
    String s2 = "hello";

    String s3 = new String("hello");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s3));
    System.out.println(s2.equals(s3));

    StringBuilder sb = new StringBuilder("hello");

    sb.append("how are you ");

    sb.insert(0,"hellow");

    String snew = sb.toString();

    System.out.println(sb);

    System.out.println(sb.length());
    
   }

}