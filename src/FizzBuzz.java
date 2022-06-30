public class FizzBuzz {
    public static int kol = 0;

    public FizzBuzz(int kol) {
        this.kol = kol;
    }

    public static void main(String[] args) throws InterruptedException {

        FizzBuzz fizzBuzz = new FizzBuzz(15);

        for(int i=1; i<=kol; i++) {
            A a = new A(i);
            a.start();

            B b = new B(i);
            b.start();
            b.join();

            C c = new C(i);
            c.start();
            c.join();

            D d = new D(i);
            d.start();
            d.join();
        }
    }
    public static void fizz(Integer chislo) {
        try {
            if (chislo % 3 == 0 && chislo % 5 != 0) {
                System.out.print("fizz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО !!!");
        }
    }

    public static void buzz(Integer chislo) {
        try {
            if (chislo % 5 == 0 && chislo % 3 != 0) {
                System.out.print("buzz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО !!!");
        }
    }

    public static void fizzbuzz(Integer chislo) {
        try {
            if (chislo % 3 == 0 && chislo % 5 == 0) {
                System.out.print("fizzbuzz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО !!!");
        }
    }

    public static void number(Integer chislo) {
        try {
            if (chislo % 3 != 0 && chislo % 5 != 0) {
                System.out.print(chislo + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("НЕ ЧИСЛО !!!");
        }
    }
}
