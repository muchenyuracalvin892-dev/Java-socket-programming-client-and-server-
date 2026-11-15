package Socket;
import java.io.*;
import java.net.*;
public class Server {

	public static void main(String[] args) {
		try {
		System.out.println(" Server running");
             ServerSocket server =new ServerSocket(5000);
             
             Socket socket = server.accept();
             BufferedReader input  =new BufferedReader(new InputStreamReader(socket.getInputStream()));
             
             PrintWriter output =new PrintWriter(socket.getOutputStream(),true);
             String message =input.readLine();
              System.out.println("client says"+message);
              
              String response =message.toUpperCase();
              output.println(response);
              
              System.out.println("client response"+response);
              socket.close();
              server.close();
             
		}catch(IOException e) {
			System.out.print("server error :"+ e.getMessage());
		}
	}

}
