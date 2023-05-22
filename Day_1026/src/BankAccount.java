public class BankAccount {
	String AccountNo;
	String Name;
	int Balance;

	//예금하기
	public void deposit(int money) {
		Balance = Balance + money;
	}
	//출금하기
	public void withdraw(int money) {
		if(Balance < money) {
			System.out.println("잔고가 부족합니다.");
		} else {
			Balance = Balance- money;  //Balance-=money;
		}

	}
	public void output() {
		System.out.println("계좌번호: "+ this.AccountNo);
		System.out.println("이름: "+ this.Name);
		System.out.println("잔액: "+ this.Balance);
	}
}



