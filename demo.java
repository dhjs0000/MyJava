
public class demo {
    public static String utj(String u, String s, String n, String i, String sm) {
        /**
         * �������ַ�תΪBBYC24web��ʽ
         *
         * @String u Ϊ����
         * @String s Ϊ����
         * @String n ΪURL����Ҫ����http/https��ʽ��
         * @String i Ϊͼ��url��·��
         * @String sm Ϊ����
         *
         * @return String ���BBYC24web��ʽ�ַ���
         */
        String[] r = {"{category: '", u, "',name: '" + s + "',url: '" + n + "',icon: '" + i + "',description: '" + sm + "'}"};
        return String.join("",r);
    }
    public static void main(String[] args){
        System.out.println(utj("u", "s", "n", "i", "sm"));
    }
}
