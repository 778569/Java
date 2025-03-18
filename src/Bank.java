public class Bank {

    int balance;
    public Bank() {
        balance =0;
    }

    public Bank(int balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Bank Kamal = new Bank();
        Bank nimal = new Bank(1000);

        System.out.println(Kamal.balance);

        System.out.println(nimal.balance);


    }
}
