package day45_Exceptions;

import java.util.ArrayList;

    public class MichaelPractice {

        public static void main(String[] args) {

            System.out.println(stringtoArraylist("Michael"));

        }

        public static ArrayList<String> stringtoArraylist(String str) {
            char[] charArr = str.toCharArray();
            ArrayList<String> List = new ArrayList<>();
            for (int i = 0,j=0; i <= charArr.length - 1; i++) {
                List.add(charArr[i] + "");

            }
            return List;

        }

    }
