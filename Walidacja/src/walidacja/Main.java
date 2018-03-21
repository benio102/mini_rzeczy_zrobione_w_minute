package walidacja;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check check = new Check();
		LoanApplicationList applicationList=new LoanApplicationList();
		
		//dodanie osoby
		applicationList.getLoanList().add(new LoanApplication());
		
		for(int i=0;i<applicationList.getLoanList().size();i++) {
		applicationList.getLoanList().get(i).setFirstName(check.checkName());
		applicationList.getLoanList().get(i).setSurname(check.checkSurname());
		applicationList.getLoanList().get(i).setPesel(check.checkPesel());
		applicationList.getLoanList().get(i).setNip(check.checkNip());
		applicationList.getLoanList().get(i).setBankAccountNumber(check.checkBankAccountNumber());
		applicationList.getLoanList().get(i).setDateOfBirth(check.checkDateOfBirth());		
		}
		
		//Wyswietlenie osob
		for(int i=0;i<applicationList.getLoanList().size();i++) {
			System.out.println(applicationList.getLoanList().get(i).getFirstName());
			System.out.println(applicationList.getLoanList().get(i).getSurname());
			System.out.println(applicationList.getLoanList().get(i).getPesel());
			System.out.println(applicationList.getLoanList().get(i).getNip());
			System.out.println(applicationList.getLoanList().get(i).getBankAccountNumber());
			System.out.println(applicationList.getLoanList().get(i).getDateOfBirth());		
		}
	}
	
		
	

}
