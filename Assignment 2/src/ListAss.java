import java.util.ArrayList;
import java.util.List;

public class ListAss {
	public static void main(String[] args) {
		accountList();
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		List<Account> acc = new ArrayList<Account>();
		Account[] accArray = new Account[5];
		for (int i = 0; i < accArray.length; i++) {
			Account acc1 = new Account();
			acc1.setNames("Ram"+i);
			acc1.setBalance(10000+i);
//			accArray[i].setNames("Ram"+i);
//			accArray[i].setBalance(10000+i);
			accArray[i] = acc1;
			 
		}
		System.out.println(accArray.toString());
  }
	}
//	