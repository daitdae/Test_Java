
public class BackAccountMain {

	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		a.AccountNo = "1234";
		a.Name = "홍길동";
		a.Balance = 10000;
		a.output(); //output 입력해 놓은걸 불러옴

		a.deposit(5000);
		a.output();

		System.out.println();

		//손오공의 예금통장을 만드시오 2000000원
		BankAccount b = new BankAccount();
		b.AccountNo = "24242424";
		b.Name = "손오공";
		b.Balance = 200000;
		b.output();

	}

}
