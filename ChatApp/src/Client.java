import java.io.*;
import java.net.*;


public class Client {

	public static void main(String[] args) {
		// asking the user to enter the IP
		// confirming the connection
		try{
			Socket s = new Socket("46.19.100.110", 1040);
			DataInputStream dIn = new DataInputStream(s.getInputStream());
			DataOutputStream dOut = new DataOutputStream(s.getOutputStream());
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String msgin="", msgout= "";
			
			while(!msgin.equals("exit")){
				msgout = br.readLine();
				dOut.writeUTF(msgout);
				msgin = dIn.readUTF();
				System.out.println(msgin);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
}
