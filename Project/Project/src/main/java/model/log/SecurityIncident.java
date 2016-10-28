package model.log;

import java.time.LocalDateTime;

class SecurityIncident {
    final LocalDateTime timestamp;
    final String username;

    SecurityIncident(String username) {
        timestamp = LocalDateTime.now();
        this.username = username;
    }
}
