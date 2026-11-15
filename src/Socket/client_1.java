package Socket;
import java.io.*;
import java.net.*;
public class client_1 {

	public static void main(String[] args) {
		try {
			  Socket socket =new Socket("localhost",5000);
			        
			  PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
			  
			  BufferedReader input =new BufferedReader(
					  new InputStreamReader(socket.getInputStream())
					  );
			  String message = " c : Hello server ";
			  output.println(message);
			 String response =input.readLine();
			 System.out.println("Server response"+response);
			 socket.close();
			  
		}catch(IOException e) {
			System.out.print("client  error :"+ e.getMessage());
		}
	  

	}

}
