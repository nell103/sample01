package chap07;

public class ExeTimeCalculator implements Calculator {
	
	private Calculator delegate;
	
	/*public TimeTraceCalculator(Calculator delegate) {
		this.delegate = delegate;
	}*/
	
	public ExeTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}
	
	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(%d)���� �ð�=%d\n", delegate.getClass().getSimpleName(), num,(end - start));
		return result;
	}

}
