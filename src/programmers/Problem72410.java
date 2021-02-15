package programmers;

public class Problem72410 {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id
                .toLowerCase()
                .replaceAll("[^\\w-_.]", "")
                .replaceAll("[.]{2,}", ".")

                .replaceAll("^[.]", "")
                .replaceAll("[.]$", "");
        if (answer.length() <= 0) {
            answer = "a";
        }
        else if (answer.length() >= 16) {
            answer = answer.substring(0, 15)
                    .replaceAll("^[.]", "")
                    .replaceAll("[.]$", "");
        }
        if (answer.length() <= 2) {
            for(int i=answer.length();i<3;i++){
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }
}
