/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LAPTOP HP
 */
import java.util.*;
public class j0 {
    public static boolean c1(String s){
        char a[]=s.toCharArray();
        if(a[0]==a[1] && a[1]==a[2] && a[4]==a[5]) return true;
        return false;
    }
    public static boolean c2(String s){
        char a[]=s.toCharArray();
        if(a[0]<a[1] && a[1]<a[2] && a[2]<a[4] && a[4]<a[5]) return true;
        return false;
    }
    public static boolean c3(String s){
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]!='6' && a[i]!='8' && i!=3) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t-->0){
            String a=in.nextLine();
            String b=a.substring(5);
            if(c1(b) || c2(b) || c3(b)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}