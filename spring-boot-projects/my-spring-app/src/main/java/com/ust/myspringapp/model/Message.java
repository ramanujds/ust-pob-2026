package com.ust.myspringapp.model;

import java.time.LocalTime;

public record Message(String text, LocalTime time, String sender) {
}
