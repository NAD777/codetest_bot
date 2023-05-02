package com.github.nad777.bot.client.responses;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public record SubmitTaskResponse(String status, int code, long id) {
    @NotNull
    @Contract(pure = true)
    @Override
    public String toString() {
        return "\nSTATUS CODE: " + code + "\nSTATUS DESCRIPTION: " + status + "\n SUBMISSION ID: " + id;
    }
}
