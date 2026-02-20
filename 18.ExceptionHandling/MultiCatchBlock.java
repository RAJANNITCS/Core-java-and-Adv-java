// WAP to demostrating and using multi catch block

public class MultiCatchBlock {
	public static void main(String[] args) {
		
		try {
			int[] arr = new int[5];
			arr[5] = 33/0;
		}
        catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
