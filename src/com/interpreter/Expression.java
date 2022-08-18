package com.interpreter;

import java.util.HashMap;

/**
 * ��������ʽ��ͨ��HashMap ��ֵ��, ���Ի�ȡ��������ֵ
 * 
 * @author Administrator
 *
 */
public abstract class Expression {

	// HashMap {a=10, b=20}
	public abstract int interpreter(HashMap<String, Integer> var);
}
