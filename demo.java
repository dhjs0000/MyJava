
public class demo {
    public static String utj(String u, String s, String n, String i, String sm) {
        /**
         * 将单独字符转为BBYC24web格式
         *
         * @String u 为类型
         * @String s 为名称
         * @String n 为URL（需要完整http/https格式）
         * @String i 为图标url或路径
         * @String sm 为描述
         *
         * @return String 输出BBYC24web格式字符串
         */
        String[] r = {"{category: '", u, "',name: '" + s + "',url: '" + n + "',icon: '" + i + "',description: '" + sm + "'}"};
        return String.join("",r);
    }
    public static void main(String[] args){
        System.out.println(utj("u", "s", "n", "i", "sm"));
    }
}
