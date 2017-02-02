public class App{
	
	public static void main(String[] args){
		System.out.println("App Main");
		System.out.println("Test 2");
		doStuff();
	}
	private static void doStuff(String caller){
		System.out.println("App.DoStuff By" + caller);
		private static void doStuff2(){
			System.out.println("App.DoStuff");
	}
    private void featureY(){
        doStuff();
    }
}
