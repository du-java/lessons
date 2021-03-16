//package lesson07;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class App02 {
//    public static void main(String[] args) {
//
//        String str = "+37512 123-45-67\n" +
//                "+375 (12) 1234567\n" +
//                "+375 121234567\n" +
//                "+375-12-123-45-67";
//
//        Pattern pattern = Pattern.compile("\\+(\\d{1,3})\\D*(\\d\\D*\\d)\\D*" +
//                "(\\d\\D*\\d\\D*\\d\\D*\\d\\D*\\d\\D*\\d\\D*\\d)");
//        Matcher matcher = pattern.matches(str);
//
//        while (matcher.find()) {
//            int groupCount = matcher.groupCount();
//            String group = matcher.group();
//            for (int i = 0; i < matcher.groupCount(); i++) {
//                matcher.group(i);
//            }
//            String countryCode = matcher.group(1);
//            String operatorCode = matcher.group(2);
//            String phone = matcher.group(3);
//            String format = String.format("full: %-20s country: %-4d operator: %.2f phone: ", group, Integer.parseInt(countryCode), Float.parseFloat(operatorCode));
//            System.out.println(format);
//        }
//    }
//}
