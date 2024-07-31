package org.example;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {

    HashMap<String, String> nicknames = new HashMap<>();

    nicknames.put("jaclyn", "jackie");
    nicknames.put("ronald", "ronnie");
    nicknames.put("sylvester", "sly");

    String jaclynNickname = nicknames.get("jaclyn");
    System.out.println("Jaclyn's nickname is, " + jaclynNickname);
}
}
