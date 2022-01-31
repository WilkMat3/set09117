
public class t2 {

    public static void main(String[] args) {
	 int evenSum=0;
        int c=0;
        int a= 0;
        int b = 1;

        while (c < 4000000) {
            if (c%2 ==0){
                evenSum +=c;
            }
            c = a+b;

            a = b;
            b = c;
        }
    System.out.println(evenSum);
	}
}
