import java.util.Scanner;

public class ReapteWordNum {
    private int ReapteWordNum_(String str,char temp){
        int Count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==temp){
                Count++;
            }
        }
        return Count;
    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String c=string.split(" ")[1];
        String temp=string.split(" ")[0];
        System.out.println(new ReapteWordNum().ReapteWordNum_(temp.toLowerCase(),c.toLowerCase().charAt(0)));
    }
}
