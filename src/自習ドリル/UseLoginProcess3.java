package 自習ドリル;

public class UseLoginProcess3 {
	public static void main(String[] args) {
		BasicProcess process1 = new BasicProcess();
		BasicProcess process2 = new LoginProcess();
		process1.action();
		process2.action();
		LoginProcess loginProcess = (LoginProcess) process2;
		loginProcess.loginAction("bazaru", "gozaru");
	}
}
