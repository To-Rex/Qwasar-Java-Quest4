// 
class Solution {
  public static void main(String[] args) {
      Person cp = new Person("Charles", "Ponzi");
      Person bm = new Person("Bernard", "Madoff");
      Person tp = new Person("Tom", "Petters");

      CheckingAccount ca_cp = new CheckingAccount(cp);
      ca_cp.print();
      SavingsAccount sa_cp = new SavingsAccount(cp);
      sa_cp.print();


      CheckingAccount ca_bm = new CheckingAccount(bm);
      ca_bm.print();

      SavingsAccount sa_tp = new SavingsAccount(tp);
      sa_tp.print();
      SavingsAccount sa_bm = new SavingsAccount(bm);
      sa_bm.print();
    }
}

class CheckingAccount extends BankAccount {
  CheckingAccount(Person _owner) {
    super(_owner);
  }
}

class SavingsAccount extends BankAccount {
  SavingsAccount(Person _owner) {
    super(_owner);
  }
}