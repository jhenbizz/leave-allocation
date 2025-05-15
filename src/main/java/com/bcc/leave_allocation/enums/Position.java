package com.bcc.leave_allocation.enums;

import lombok.Getter;

@Getter
public enum Position {
    RANK_AND_FILE(5),
    SUPERVISOR(10),
    MANAGER(20);

    private final int leaveCredits;

    Position(int leaveCredits) {
        this.leaveCredits = leaveCredits;
    }

}
