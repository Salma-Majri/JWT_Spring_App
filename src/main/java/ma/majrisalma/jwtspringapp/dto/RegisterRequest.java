package ma.majrisalma.jwtspringapp.dto;

public record RegisterRequest(
        String email,
        String password
) {

}