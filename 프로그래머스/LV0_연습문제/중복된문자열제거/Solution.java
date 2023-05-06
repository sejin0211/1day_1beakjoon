package 프로그래머스.LV0_연습문제.중복된문자열제거;

class Main {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i)
                answer+=str.charAt(i);
        }
        return answer;
    }
}