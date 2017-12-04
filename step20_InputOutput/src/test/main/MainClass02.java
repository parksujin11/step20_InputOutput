package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStreamReader
 * -���ڿ��� �о���϶� ����Ѵ�.
 * -2 byte ó�� ��Ʈ��
 * -�ѱ��� ������ ��� ���� 1���ڸ� ó���� �� �ִ�. */
public class MainClass02 {
	public static void main(String[] args) {
		//Ű����� ����� ��ü�� ������
		InputStream is=System.in;
		
		InputStreamReader isr=new InputStreamReader(is);
		
		try {
			System.out.println("�ѱ��� �Է�"); 
			int keyCode=isr.read();
			//�Է� ���� ���� �ڵ尪 ���
			System.out.println("keyCode:"+keyCode);
			//�ڵ带 Char �� ��ȯ
			char ch=(char)keyCode;
			//��ȯ�� ���� ���
			System.out.println("�Է��� ����:"+ch);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
