package Scenario;

public class Scenario {

    public static void main(String[] args) {
        String[] roles = {
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"
        };
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Артемий Филиппович Артемий Филиппович: asdasdasdasdsad"
        };
        System.out.println(printTextPerRole(roles, textLines));


    }



    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (String r: roles) {
            builder.append(r+":\n");
            for (int j=0; j<textLines.length; j++) {
                if ( textLines[j].startsWith(r+":")){
                    builder.append((j+1)+")"+textLines[j].substring(r.length()+1)+"\n");
                }
            }
            builder.append("\n");
        }

        builder.delete(builder.length()-2,builder.length());



        return builder.toString();
    }
}
