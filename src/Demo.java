import static java.lang.System.currentTimeMillis;

class Demo{
    public static void main(String[] args) {
int [] artemArray = new int[100_000]; //100,000-1
int [] romanArray = new int [100_000];//2-100,00-1
        int [] test = new int [100_000]; //1=100_000 already sorted array
 int sizeA = 100_000;
        for (int i = 0; i < 100000; i++) {
            currentTimeMillis();
            artemArray[i]=sizeA;
            sizeA--;
        }
        int sizeR=2;
        System.out.println(artemArray[0]);

        for (int i = 0; i < 99999; i++) {
            romanArray[i]=sizeR;
            sizeR++;
        }
        for (int i = 0; i < test.length; i++) {
            test[i]=i+1;
        }
    }

    private static void currentTimeMillis() {
        System.currentTimeMillis();
    }
}