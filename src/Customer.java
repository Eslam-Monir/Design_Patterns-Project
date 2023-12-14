public class Customer extends User {
    private int ssn,credit_card_no,age;
    private String gender,email;

    public Customer(String name,String email, String password, int ssn, int credit_card_no, int age ,String gender) {
        super(name, password);
        this.email=email;
        this.ssn = ssn;
        this.credit_card_no = credit_card_no;
        this.age = age;
        this.gender=gender;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getCredit_card_no() {
        return credit_card_no;
    }

    public Customer() {
    }

    public void setCredit_card_no(int credit_card_no) {
        this.credit_card_no = credit_card_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
