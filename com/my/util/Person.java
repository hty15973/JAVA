package com.my.util;

class Person { // Ŭ������ �޼���� ��������� �ٸ����� public�� default �� ����� �����ϴ�.
	public String name; // �տ� private�̵� public �̵� ���������ڰ� ������ �̴� ����Ʈ ���������ڰ� �ٰԵǸ�,
				// �̷��ԵǸ� ���� ��Ű�� �������� �����Ҽ� �ְԵȴ�. �ٸ� ��Ű�������� ������ ������ �ȴ�.
				// public �̸� ��𼭵� �����Ҽ��� �ְ�(������ �ܺ���Ű��������),private�̸�  ���� �б��������� ����ӺҰ���������.
				// ���������� : public,protected,default,private ������ ��ū���� �������� ������
	
	void setName(String name) {  // �޼��嵵 ��������, ����Ʈ�� ������Ű��, public �̸� �ܺε�����,private �̸� ���θ�
		this.name =name ; 
	}
}
