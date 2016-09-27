import java.io.*;
import java.net.*;
public class Server {
public static void main(String[] args){
	
		ServerSocket s;
		try {
			s = new ServerSocket(9999);
			Socket client = s.accept();
			System.out.print(client.getInetAddress());
			
			DataInputStream dIn = new DataInputStream(client.getInputStream());
			DataOutputStream dOut = new DataOutputStream(client.getOutputStream());
			
			BufferedReader abr = new BufferedReader(new InputStreamReader(System.in));
			
			String msgin="", msgout= "";
			
			while(!msgin.equals("exit")){
				msgin = dIn.readUTF();
				System.out.println(msgin);
				msgout = abr.readLine();
				dOut.writeUTF(msgout);
				dOut.flush();
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
}}
