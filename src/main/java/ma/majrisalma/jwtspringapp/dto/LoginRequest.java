package ma.majrisalma.jwtspringapp.dto;

public record LoginRequest(
        String email,
        String password
) {

}