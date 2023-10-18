import java.util.*;
public class armstorng {
    public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter armstorng number:");
    int num = Sc.nextInt();
    int C = long Count(num);
    while(num!=0){
    int remainder = num%10;
    double result = Math.pow(remainder,C) ;}
    if(num==result){
        System.out.println("num is armstorng"+num);
    }
    else
    {
        System.out.println("num is not armstorng");
    }
    Sc.close();



}
    
}
