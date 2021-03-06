package mySocketTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by wangxiaodi1 on 2018/11/25.
 */
public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        BufferedReader in  = null;
        PrintWriter out = null ;
        try {
            socket = new Socket("127.0.0.1",9999);
             in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             out = new PrintWriter(socket.getOutputStream(),true);
            Thread.sleep(5000);
            out.println("接收客户端的请求数据11111");
            out.println("11111222");
            String response = in.readLine();
            System.out.println("client1:"+response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(in != null) {
                in.close();
            }
            if(out != null){
                out.close();
            }
            if(socket != null){
                socket.close();
            }
        }
    }
}
