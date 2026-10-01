package pl.fincore.fincore_backend.user.dto;

import java.util.UUID;
public record UserResponse (
        UUID id,
        String email,
        String firstName,
        String lastName,
        String role
){}
