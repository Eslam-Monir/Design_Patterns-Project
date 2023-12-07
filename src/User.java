public class User {
    private int ssn,credit_card_no,age;
    private String name,gender;

    public User(int ssn, int credit_card_no, int age, String name, String gender) {
        this.ssn = ssn;
        this.credit_card_no = credit_card_no;
        this.age = age;
        this.name = name;
        this.gender = gender;
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

    public void setCredit_card_no(int credit_card_no) {
        this.credit_card_no = credit_card_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
