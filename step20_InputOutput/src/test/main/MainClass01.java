package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 * inputStream
 * -1byte ó�� ��Ʈ��(byte �˰����� �帧)
 * -������ ���� ������ ��ҹ���, ����, Ư������ �ѱ��ڸ� �о���� �� �ִ�.
 * -�ѱ��� ó�� �Ұ� 
 * 
 * [Java IO]
 * 
 * [input]                [output]
 * 
 * inputStream-> �Է�  / outputStream->���
 * FileinputStream / FileOutputStream
 * FileReader / FileWriter
 * inputStreamReader / OutputStreamWriter
 * BufferedReader /BufferedWriter
 *  
 */
public class MainClass01 {
	public static void main(String[] args) {
		//Ű����� ���� �Է¹��� �� �ִ� ��ü�� ������ ���ͼ� ������ ���
		InputStream is =System.in;
		
		System.out.println("�ѱ��� �Է�:");
		
		try {
			//�Է��� Ű�� �ڵ尪�� �޾ƿ´�.
			int keyCode = is.read();

			System.out.println("keyCode:"+keyCode);
			//�ڵ忡 �ش�Ǵ� ���ڸ� ���´�.
			char ch=(char)keyCode;
			System.out.println("char Type ���� ��ȯ�� �� :"+ch);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
