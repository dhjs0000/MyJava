public class IApiC implements BBYCAPI{

    @Override
    public String utj(String u, String s, String n, String i, String sm) {
        String[] r = {"[category: '", u, "',name: '" + s + "',url: '" + n + "',icon: '" + i + "',description: '" + sm + "']"};
        return String.join("",r);
    }
}