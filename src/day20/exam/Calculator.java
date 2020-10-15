package day20.exam;

public class Calculator {
	
	//div메서드 호출 시 MyException발생 가능. 반드시 예외처리 컴파일 타임에 필요
	public int div(int n1, int n2) throws MyException{
		int ret = 0;
		
		if(n1 < 0) {
			throw new MyException("음수는 사용 불가!");
		}
		if(n2 == 0) {
			throw new MyRuntimeException("0 안됨");
		}
		ret = n1 / n2;
		return ret;
	}
	
}