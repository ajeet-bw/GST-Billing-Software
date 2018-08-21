/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static java.lang.Integer.sum;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.N;

/**
 *
 * @author AJEET
 */
public class My {
    public static void main(String sr[])
    {
Scanner sc = new Scanner(System.in);
long sum = 0;
int N = sc.nextInt();
for (int i = 0; i < N; i++) {
final long x = sc.nextLong(); // read input
String str = Long.toString((long) Math.pow(1 << 1, x));
str = str.length() > 2 ? str.substring(str.length() - 2) : str;
sum += Integer.parseInt(str);
}
System.out.println(sum%100);
}
}