package com.test;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.resoft.InputParam;
import com.resoft.OutputResult;
import com.resoft.ResoftVoice;


public class Test {

	
	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
		InputParam inputParam = new InputParam();		
		OutputResult outputResult = new OutputResult();

		inputParam.alertCode = "10000";
		//inputParam.alertSummary = "��[gei3]��[ni1]һ�Ź�ȥ��[de4]CD,������[na4]ʱ[shi2]��[wo3]�ǵİ�[ai4]��[qing2]����[you3]ʱ[shi2]��ͻȻ[ran2]��[wang4]�� �һ��ڰ�����";
		inputParam.alertSummary = "ϵͳ�ʻ��͹���Ա�ʻ� ������Ա�飩 ����ͬ���ļ�Ȩ�ޣ������Ǿ��в�ͬ�Ĺ��ܡ�ͨ������ϵͳ�Լ��� Windows �����еķ���ʹ��ϵͳ�ʻ��������������Ҫ������ ������ Windows ��װ�ڼ䣩 �ڲ���¼�� Windows �еĽ��̡�ϵͳ�ʻ�רΪ��Ŀ�� �����Ǹ��ڲ��ʻ��� ����ʾ���û��������У�������ӵ��κ����У����Ҳ��ܾ����û�Ȩ�޷����������һ���棬ϵͳ�ʻ��� NTFS �����ļ��������еİ�ȫ�˵��ϵ�Ȩ�޲�������ʾ��Ĭ������£�ϵͳ�ʻ������ NTFS ���ϵ������ļ�����ȫ���ơ������ϵͳ�ʻ��������Ա�ʻ�ͬ���Ĳ�����Ȩ ";

		String userinfo1 = "������|9,18614031161";
		//String userinfo2 = "����|915010035001";
		//String userinfo3 = "ţ��ΰ|9,15600243182";
		//String userinfo4 = "����Ԫ|9,18618150708";
		//String userinfo5 = "������|9,15110159103";		
		
		inputParam.alertUserInfo = new ArrayList<String>();
		inputParam.alertUserInfo.add(userinfo1);
		//inputParam.alertUserInfo.add(userinfo2);
		//inputParam.alertUserInfo.add(userinfo3);		
		//inputParam.alertUserInfo.add(userinfo4);
		//inputParam.alertUserInfo.add(userinfo5);
		
		inputParam.attribute1 = "reserver1";
		inputParam.attribute2 = "reserver2";
		
		System.out.println("In Java, inputParam.alertCode is " + inputParam.alertCode);
		System.out.println("In Java, inputParam.alertSummary is " + inputParam.alertSummary);
		System.out.println("In Java, inputParam.alertUserInfo is " + inputParam.alertUserInfo.toString());
		System.out.println("In Java, inputParam.attribute1 is " + inputParam.attribute1);
		System.out.println("In Java, inputParam.attribute2 is " + inputParam.attribute2);		

		
		ResoftVoice resoftvoice =  new ResoftVoice();
		System.out.println("In Java, return code is " + resoftvoice.resoftVoiceCall(inputParam, outputResult));		
		System.out.println("In Java, outputResult.alertCode is " + outputResult.alertCode);
		System.out.println("In Java, outputResult.attribute1 is " + outputResult.attribute1);
		System.out.println("In Java, outputResult.attribute2 is " + outputResult.attribute2);
		for(;;){
			if(outputResult.alertDialResult.size() == inputParam.alertUserInfo.size()){
				System.out.println("In Java, outputResult.alertDialResult is " + outputResult.alertDialResult.toString());
				break;
			}
		}
	}

}
