package question;

public class Airthmetic {
	int num1 ,num2;
	String operation="";
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String precess() {
		int result = 0;
		String answer = "";
		switch (operation) {
		case "+":
				result =num1+num2;
			break;
		case "-":
			result =num1-num2;
		break;
		case "*":
			result =num1*num2;
		break;
		case "/":
			if (num2==0) {
				answer = "0으로 나눌 수 없습니다.";
			} else {
				result =num1/num2;
			}
		break;
		default:
			answer = "사칙연산이 아닙니다.";
			break;
		}
		if (!answer.isEmpty()) {
			return answer;
		} else {
			return num1+"와"+num2+"의 계산 결과는"+num1+operation+num2+"의 계산 결과는"+ result; 
		}
	}
}
