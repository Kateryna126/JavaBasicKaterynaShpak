package com.gmail.katerynashpak;

public class User {
    private String login;
    private String password;

}

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}

