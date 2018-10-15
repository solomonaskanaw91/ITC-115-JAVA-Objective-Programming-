//Write a method called printPowersOfN. Test your method by calling it twice from the main method of your class with different arguments

public class Powers {

public static int printPowersOfN (int base, int exponent) {

int answer = 1;

for (int i=0; i <= exponent; i++) {
System.out.print(answer);
System.out.print(" ");
answer*=base;

}

return answer;

}

public static void main(String[] args) {

System.out.println(printPowersOfN(4, 3));
System.out.println(printPowersOfN(5, 6));
System.out.println(printPowersOfN(-2, 8));
    }
}


