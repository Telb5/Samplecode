package Project2;

public class replit181 {
}

class Account{

    String acc_no;
    String name;
    String email;
    double amount;

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}


class Main14{
    public static void main(String[] args) {
        Account obj14 = new Account();
        obj14.setAcc_no("7560504000");
        obj14.setName("Sumair");
        obj14.setEmail("sumair@syntax.com");
        obj14.setAmount(500000.0);

        System.out.println(obj14.getAcc_no()+" "+ obj14.getName()+" "+ obj14.getEmail()+" "+ obj14.getAmount());
    }
}
