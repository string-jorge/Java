package com.qiao.jdk5;

import static java.util.Arrays.sort;//��̬����

public class Test2_StaticImport {

	/**
	 * A:��̬����
	 * 		��̬�����ǵ������о�̬����
	 * B:��ʽ
	 * 		Import static ����.����.������;
	 * 		����ֱ�ӵ��뵽�����ļ���
	 * C:ע������
	 * 		���������Ǿ�̬��,����ж��ͬ���ľ�̬����,���ײ�֪��ʹ��˭?���ʱ��Ҫʹ��,�����ǰ׺.�ɴ˿ɼ�,���岻��,����һ�㲻��,����Ҫ�ܿ��ö�
	 * 		��̬���뿪�����õ���Ҫ�ܿ��ö�
	 */
	public static void main(String[] args) {
		int[] arr = {11,22,55,77,66,33,44};
		sort(arr);//����
		//System.out.println(Arrays.toString(arr));
	}

}
